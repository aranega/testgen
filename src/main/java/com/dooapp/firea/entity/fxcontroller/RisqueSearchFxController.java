package com.dooapp.firea.entity.fxcontroller;

import javafx.scene.control.TextField;
import com.dooapp.firea.entity.fxwrapper.RisqueCriteriaWrapper;
import java.util.ResourceBundle;
import com.dooapp.firea.entity.services.RisqueService;
import javafx.fxml.Initializable;
import java.net.URL;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.fxwrapper.RisqueWrapper;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class RisqueSearchFxController implements Initializable
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
	private TextField risqueCriteriaKey;
	
	private RisqueCriteriaWrapper risqueCriteriaWrapper;
	@Autowired
	private RisqueEditFxController risqueEditFxController;
	@Autowired
	private RisqueService risqueService;
	@FXML
	private TableView<RisqueWrapper> risqueTable;
    

	public RisqueSearchFxController () 
	{
		risqueCriteriaWrapper= new RisqueCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		risqueEditFxController.setRisqueWrapper(new RisqueWrapper());
		mainController.show("Risque_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		risqueCriteriaKey.setText(String.valueOf(risqueCriteriaWrapper.getKey()));
		
		risqueCriteriaWrapper.keyProperty().bindBidirectional(risqueCriteriaKey.textProperty());
		
		risqueTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.RisqueWrapper> model = risqueTable.getSelectionModel(); 
							risqueEditFxController.setRisqueWrapper
								(model.getSelectedItem());
							mainController.show("Risque_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.RisqueWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.RisqueWrapper>();
		for (com.dooapp.firea.entity.domain.Risque o : risqueService.findByCriteria(risqueCriteriaWrapper.getRisqueCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.RisqueWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.RisqueWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		risqueTable.setItems(proObs);		
	}


}
