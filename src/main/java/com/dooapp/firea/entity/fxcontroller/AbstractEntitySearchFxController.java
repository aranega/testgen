package com.dooapp.firea.entity.fxcontroller;

import java.net.URL;
import com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import com.dooapp.firea.entity.fxwrapper.AbstractEntityCriteriaWrapper;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.services.AbstractEntityService;
import javafx.scene.control.TableView;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class AbstractEntitySearchFxController implements Initializable
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
	
	private AbstractEntityCriteriaWrapper abstractEntityCriteriaWrapper;
	@Autowired
	private AbstractEntityEditFxController abstractEntityEditFxController;
	@Autowired
	private AbstractEntityService abstractEntityService;
	@FXML
	private TableView<AbstractEntityWrapper> abstractEntityTable;
	@Autowired
	private MainFxController mainController;
    

	public AbstractEntitySearchFxController () 
	{
		abstractEntityCriteriaWrapper= new AbstractEntityCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		abstractEntityEditFxController.setAbstractEntityWrapper(new AbstractEntityWrapper());
		mainController.show("AbstractEntity_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		abstractEntityCriteriaVersionMin.setText(String.valueOf(abstractEntityCriteriaWrapper.getVersionMin()));
		abstractEntityCriteriaVersionMax.setText(String.valueOf(abstractEntityCriteriaWrapper.getVersionMax()));
		abstractEntityCriteriaId.setText(String.valueOf(abstractEntityCriteriaWrapper.getId()));
		
		abstractEntityCriteriaVersionMin.textProperty().bindBidirectional(abstractEntityCriteriaWrapper.versionMinProperty(), new javafx.util.converter.NumberStringConverter());
		abstractEntityCriteriaVersionMax.textProperty().bindBidirectional(abstractEntityCriteriaWrapper.versionMaxProperty(), new javafx.util.converter.NumberStringConverter());
		abstractEntityCriteriaId.textProperty().bindBidirectional(abstractEntityCriteriaWrapper.idProperty(), new javafx.util.converter.NumberStringConverter());
		
		abstractEntityTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper> model = abstractEntityTable.getSelectionModel(); 
							abstractEntityEditFxController.setAbstractEntityWrapper
								(model.getSelectedItem());
							mainController.show("AbstractEntity_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper>();
		for (com.dooapp.firea.entity.domain.AbstractEntity o : abstractEntityService.findByCriteria(abstractEntityCriteriaWrapper.getAbstractEntityCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.AbstractEntityWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		abstractEntityTable.setItems(proObs);		
	}


}
