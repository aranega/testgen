package com.dooapp.firea.entity.fxcontroller;

import javafx.scene.control.TableView;
import com.dooapp.firea.entity.services.PersistentImageDataService;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;
import com.dooapp.firea.entity.fxwrapper.PersistentImageDataCriteriaWrapper;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper;
import java.util.ResourceBundle;
import java.net.URL;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class PersistentImageDataSearchFxController implements Initializable
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
	private TextField persistentImageDataCriteriaData;
	
	private PersistentImageDataCriteriaWrapper persistentImageDataCriteriaWrapper;
	@Autowired
	private PersistentImageDataEditFxController persistentImageDataEditFxController;
	@Autowired
	private PersistentImageDataService persistentImageDataService;
	@FXML
	private TableView<PersistentImageDataWrapper> persistentImageDataTable;
    

	public PersistentImageDataSearchFxController () 
	{
		persistentImageDataCriteriaWrapper= new PersistentImageDataCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		persistentImageDataEditFxController.setPersistentImageDataWrapper(new PersistentImageDataWrapper());
		mainController.show("PersistentImageData_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		persistentImageDataCriteriaData.setText(String.valueOf(persistentImageDataCriteriaWrapper.getData()));
		
		persistentImageDataCriteriaData.textProperty().bindBidirectional(persistentImageDataCriteriaWrapper.dataProperty(), new javafx.util.converter.NumberStringConverter());
		
		persistentImageDataTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper> model = persistentImageDataTable.getSelectionModel(); 
							persistentImageDataEditFxController.setPersistentImageDataWrapper
								(model.getSelectedItem());
							mainController.show("PersistentImageData_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper>();
		for (com.dooapp.firea.entity.domain.PersistentImageData o : persistentImageDataService.findByCriteria(persistentImageDataCriteriaWrapper.getPersistentImageDataCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.PersistentImageDataWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		persistentImageDataTable.setItems(proObs);		
	}


}
