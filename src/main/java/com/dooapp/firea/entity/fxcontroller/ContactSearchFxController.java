package com.dooapp.firea.entity.fxcontroller;

import java.util.ResourceBundle;
import com.dooapp.firea.entity.fxwrapper.ContactWrapper;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import com.dooapp.firea.entity.fxwrapper.ContactCriteriaWrapper;
import com.dooapp.firea.entity.services.ContactService;
import javafx.scene.control.TextField;
import java.net.URL;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class ContactSearchFxController implements Initializable
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
	@FXML
	private TextField contactCriteriaAddress2;
	@FXML
	private TextField contactCriteriaAdress1;
	@FXML
	private TextField contactCriteriaCity;
	@FXML
	private TextField contactCriteriaEmail;
	@FXML
	private TextField contactCriteriaName;
	@FXML
	private TextField contactCriteriaPerson;
	@FXML
	private TextField contactCriteriaPhone;
	@FXML
	private TextField contactCriteriaSiret;
	
	private ContactCriteriaWrapper contactCriteriaWrapper;
	@FXML
	private TextField contactCriteriaZipCode;
	@Autowired
	private ContactEditFxController contactEditFxController;
	@Autowired
	private ContactService contactService;
	@FXML
	private TableView<ContactWrapper> contactTable;
	@Autowired
	private MainFxController mainController;
    

	public ContactSearchFxController () 
	{
		contactCriteriaWrapper= new ContactCriteriaWrapper();	
	}

	public void handleAdd (ActionEvent event) 
	{
		contactEditFxController.setContactWrapper(new ContactWrapper());
		mainController.show("Contact_edit");	
	}

	public void handleSearchButtonAction (ActionEvent event) 
	{
		refreshList();	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		contactCriteriaName.setText(String.valueOf(contactCriteriaWrapper.getName()));
		contactCriteriaPerson.setText(String.valueOf(contactCriteriaWrapper.getPerson()));
		contactCriteriaAdress1.setText(String.valueOf(contactCriteriaWrapper.getAdress1()));
		contactCriteriaAddress2.setText(String.valueOf(contactCriteriaWrapper.getAddress2()));
		contactCriteriaZipCode.setText(String.valueOf(contactCriteriaWrapper.getZipCode()));
		contactCriteriaCity.setText(String.valueOf(contactCriteriaWrapper.getCity()));
		contactCriteriaEmail.setText(String.valueOf(contactCriteriaWrapper.getEmail()));
		contactCriteriaPhone.setText(String.valueOf(contactCriteriaWrapper.getPhone()));
		contactCriteriaSiret.setText(String.valueOf(contactCriteriaWrapper.getSiret()));
		
		contactCriteriaWrapper.nameProperty().bindBidirectional(contactCriteriaName.textProperty());
		contactCriteriaWrapper.personProperty().bindBidirectional(contactCriteriaPerson.textProperty());
		contactCriteriaWrapper.adress1Property().bindBidirectional(contactCriteriaAdress1.textProperty());
		contactCriteriaWrapper.address2Property().bindBidirectional(contactCriteriaAddress2.textProperty());
		contactCriteriaWrapper.zipCodeProperty().bindBidirectional(contactCriteriaZipCode.textProperty());
		contactCriteriaWrapper.cityProperty().bindBidirectional(contactCriteriaCity.textProperty());
		contactCriteriaWrapper.emailProperty().bindBidirectional(contactCriteriaEmail.textProperty());
		contactCriteriaWrapper.phoneProperty().bindBidirectional(contactCriteriaPhone.textProperty());
		contactCriteriaWrapper.siretProperty().bindBidirectional(contactCriteriaSiret.textProperty());
		
		contactTable.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(javafx.scene.input.MouseEvent arg0)
					{
						if (arg0.getClickCount() > 1)
						{
							javafx.scene.control.SelectionModel<com.dooapp.firea.entity.fxwrapper.ContactWrapper> model = contactTable.getSelectionModel(); 
							contactEditFxController.setContactWrapper
								(model.getSelectedItem());
							mainController.show("Contact_edit");
						}
						
					}
				});
				
				refreshList();	
	}

	public void refreshList () 
	{
		java.util.List<com.dooapp.firea.entity.fxwrapper.ContactWrapper> all = new java.util.ArrayList<com.dooapp.firea.entity.fxwrapper.ContactWrapper>();
		for (com.dooapp.firea.entity.domain.Contact o : contactService.findByCriteria(contactCriteriaWrapper.getContactCriteria()))
			all.add(new com.dooapp.firea.entity.fxwrapper.ContactWrapper(o));
				
		javafx.collections.ObservableList<com.dooapp.firea.entity.fxwrapper.ContactWrapper> proObs = javafx.collections.FXCollections.observableList(all);
		contactTable.setItems(proObs);		
	}


}
