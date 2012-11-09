package com.dooapp.firea.entity.fxcontroller;

import javafx.scene.control.TextField;
import com.dooapp.firea.entity.services.ContactService;
import com.dooapp.firea.entity.fxwrapper.ContactWrapper;
import java.util.ResourceBundle;
import com.dooapp.firea.entity.fxwrapper.ContactCriteriaWrapper;
import javafx.scene.control.TableView;
import javafx.event.ActionEvent;
import java.net.URL;
import javafx.fxml.Initializable;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;
import org.springframework.beans.factory.annotation.Autowired;

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
		
		contactCriteriaName.textProperty().bindBidirectional(contactCriteriaWrapper.nameProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaPerson.textProperty().bindBidirectional(contactCriteriaWrapper.personProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaAdress1.textProperty().bindBidirectional(contactCriteriaWrapper.adress1Property(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaAddress2.textProperty().bindBidirectional(contactCriteriaWrapper.address2Property(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaZipCode.textProperty().bindBidirectional(contactCriteriaWrapper.zipCodeProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaCity.textProperty().bindBidirectional(contactCriteriaWrapper.cityProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaEmail.textProperty().bindBidirectional(contactCriteriaWrapper.emailProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaPhone.textProperty().bindBidirectional(contactCriteriaWrapper.phoneProperty(), new javafx.util.converter.NumberStringConverter());
		contactCriteriaSiret.textProperty().bindBidirectional(contactCriteriaWrapper.siretProperty(), new javafx.util.converter.NumberStringConverter());
		
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
