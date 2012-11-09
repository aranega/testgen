package com.dooapp.firea.entity.fxcontroller;

import com.dooapp.firea.entity.services.PersistentImageService;
import com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper;
import com.dooapp.firea.entity.fxwrapper.PersistentImageCriteriaWrapper;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.control.TableView;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class PersistentImageSearchFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityCriteriaId;
	@FXML
	private TextField abstractEntityCriteriaVersionMax;
	@FXML
	private TextField abstractEntityCriteriaVersionMin;
	@Autowired
	private MainFxController mainController;
	@FXML
	private TextField persistentImageCriteriaDataId;
	@FXML
	private TextField persistentImageCriteriaError;
	@FXML
	private TextField persistentImageCriteriaPreview;
	@FXML
	private TextField persistentImageCriteriaSourceFile;
	@FXML
	private TextField persistentImageCriteriaTitle;
	
	private PersistentImageCriteriaWrapper persistentImageCriteriaWrapper;
	@Autowired
	private PersistentImageEditFxController persistentImageEditFxController;
	@Autowired
	private PersistentImageService persistentImageService;
	@FXML
	private TableView<PersistentImageWrapper> persistentImageTable;
    

	public PersistentImageSearchFxController () 
	{
		persistentImageCriteriaWrapper= new PersistentImageCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		persistentImageEditFxController.setPersistentImageWrapper(new PersistentImageWrapper());
		mainController.show("PersistentImage_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		persistentImageCriteriaTitle.setText(String.valueOf(persistentImageCriteriaWrapper.getTitle()));
		persistentImageCriteriaSourceFile.setText(String.valueOf(persistentImageCriteriaWrapper.getSourceFile()));
		persistentImageCriteriaPreview.setText(String.valueOf(persistentImageCriteriaWrapper.getPreview()));
		persistentImageCriteriaError.setText(String.valueOf(persistentImageCriteriaWrapper.getError()));
		persistentImageCriteriaDataId.setText(String.valueOf(persistentImageCriteriaWrapper.getDataId()));
		
		persistentImageCriteriaWrapper.titleProperty().bindBidirectional(persistentImageCriteriaTitle.textProperty());
		persistentImageCriteriaWrapper.sourceFileProperty().bindBidirectional(persistentImageCriteriaSourceFile.textProperty());
		persistentImageCriteriaWrapper.previewProperty().bindBidirectional(persistentImageCriteriaPreview.textProperty());
		persistentImageCriteriaError.textProperty().bindBidirectional(persistentImageCriteriaWrapper.errorProperty(), new javafx.util.converter.BooleanStringConverter());
		persistentImageCriteriaWrapper.dataIdProperty().bindBidirectional(persistentImageCriteriaDataId.textProperty());
		
		persistentImageTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper> model = persistentImageTable.getSelectionModel(); 
							persistentImageEditFxController.setPersistentImageWrapper
								(model.getSelectedItem());
							mainController.show("PersistentImage_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper>();
		for (com.dooapp.firea.entity.domain.PersistentImage o : persistentImageService.findByCriteria(persistentImageCriteriaWrapper.getPersistentImageCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.PersistentImageWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		persistentImageTable.setItems(proObs);		
	}


}
