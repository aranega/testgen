package com.dooapp.firea.entity.fxcontroller;

import java.net.URL;
import com.dooapp.firea.entity.fxwrapper.ContactWrapper;
import javafx.scene.control.TextField;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.dooapp.firea.entity.services.ContactService;
import com.dooapp.firea.entity.services.PersistentImageService;
import javafx.scene.control.ComboBox;
import javafx.event.ActionEvent;
import com.dooapp.firea.entity.domain.PersistentImage;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class ContactEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@FXML
	private TextField abstractEntityVersion;
	@FXML
	private TextField contactAddress2;
	@FXML
	private TextField contactAdress1;
	@FXML
	private TextField contactCity;
	@FXML
	private TextField contactEmail;
	@FXML
	private ComboBox<PersistentImage> contactImage;
	@FXML
	private TextField contactName;
	@FXML
	private TextField contactPerson;
	@FXML
	private TextField contactPhone;
	@Autowired
	private ContactService contactService;
	@FXML
	private TextField contactSiret;
	
	private ContactWrapper contactWrapper;
	@FXML
	private TextField contactZipCode;
	@Autowired
	private MainFxController mainController;
	@Autowired
	private PersistentImageService persistentImageService;
    

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("Contact_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		contactService.save(contactWrapper.getContact());
		mainController.show("Contact_search");	
	}

	public void imageHandleAction (ActionEvent event) 
	{
		//Start of user code imageHandleAction
		// TODO: implement me! 
		//End of user code	
	}

	public void initialize (URL args0, ResourceBundle args1) 
	{
		// Bindings
		contactName.setText(String.valueOf(contactWrapper.getName()));
		contactPerson.setText(String.valueOf(contactWrapper.getPerson()));
		contactAdress1.setText(String.valueOf(contactWrapper.getAdress1()));
		contactAddress2.setText(String.valueOf(contactWrapper.getAddress2()));
		contactZipCode.setText(String.valueOf(contactWrapper.getZipCode()));
		contactCity.setText(String.valueOf(contactWrapper.getCity()));
		contactEmail.setText(String.valueOf(contactWrapper.getEmail()));
		contactPhone.setText(String.valueOf(contactWrapper.getPhone()));
		contactSiret.setText(String.valueOf(contactWrapper.getSiret()));
		
		contactName.textProperty().bindBidirectional(contactWrapper.nameProperty(), new javafx.util.converter.NumberStringConverter());
		contactPerson.textProperty().bindBidirectional(contactWrapper.personProperty(), new javafx.util.converter.NumberStringConverter());
		contactAdress1.textProperty().bindBidirectional(contactWrapper.adress1Property(), new javafx.util.converter.NumberStringConverter());
		contactAddress2.textProperty().bindBidirectional(contactWrapper.address2Property(), new javafx.util.converter.NumberStringConverter());
		contactZipCode.textProperty().bindBidirectional(contactWrapper.zipCodeProperty(), new javafx.util.converter.NumberStringConverter());
		contactCity.textProperty().bindBidirectional(contactWrapper.cityProperty(), new javafx.util.converter.NumberStringConverter());
		contactEmail.textProperty().bindBidirectional(contactWrapper.emailProperty(), new javafx.util.converter.NumberStringConverter());
		contactPhone.textProperty().bindBidirectional(contactWrapper.phoneProperty(), new javafx.util.converter.NumberStringConverter());
		contactSiret.textProperty().bindBidirectional(contactWrapper.siretProperty(), new javafx.util.converter.NumberStringConverter());
		
		refreshImage();
			
	}

	public void refreshImage () 
	{
		//Start of user code refreshImage
		// TODO: Implement me !
		//End of user code	
	}

	public void selectImage () 
	{
		//Start of user code selectImage
		// ex: contactWrapper.setPersistentImage(contactImage.getSelectionModel().getSelectedItem());
		// TODO: Implement me !
		//End of user code	
	}

	public void setContactWrapper (ContactWrapper w) 
	{
		this.contactWrapper = w;	
	}


}
