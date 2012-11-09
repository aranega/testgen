package com.dooapp.firea.entity.fxcontroller;

import javafx.event.ActionEvent;
import com.dooapp.firea.entity.domain.Contact;
import javafx.scene.control.ComboBox;
import java.net.URL;
import com.dooapp.firea.entity.fxwrapper.ContactWrapper;
import com.dooapp.firea.entity.domain.PersistentImage;
import com.dooapp.firea.entity.fxwrapper.ProjectWrapper;
import javafx.scene.control.TextField;
import com.dooapp.firea.entity.services.RisqueService;
import javafx.scene.control.TableView;
import com.dooapp.firea.entity.services.PersistentImageService;
import com.dooapp.firea.entity.domain.Risque;
import com.dooapp.firea.entity.services.ContactService;
import com.dooapp.firea.entity.services.ProjectService;
import javafx.fxml.Initializable;
import java.util.ResourceBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javafx.fxml.FXML;

//Start of user code for imports
// TODO: import me!
//End of user code

//


@Component
public class ProjectEditFxController implements Initializable
{
	//Start of user code for attributes
	// TODO: Feed me!
	//End of user code
	@FXML
	private TextField abstractEntityId;
	@FXML
	private TextField abstractEntityVersion;
	@Autowired
	private ContactService contactService;
	@Autowired
	private MainFxController mainController;
	@Autowired
	private PersistentImageService persistentImageService;
	@FXML
	private TableView<ContactWrapper> projectContacts;
	@FXML
	private ComboBox<Contact> projectContactsSelect;
	@FXML
	private TextField projectDescription;
	@FXML
	private ComboBox<PersistentImage> projectImage;
	@FXML
	private TextField projectName;
	@FXML
	private ComboBox<Risque> projectRisque;
	@Autowired
	private ProjectService projectService;
	
	private ProjectWrapper projectWrapper;
	@Autowired
	private RisqueService risqueService;
    

	public void contactsHandleAction (ActionEvent event) 
	{
		//Start of user code contactsHandleAction
		// TODO: implement me! 
		//End of user code	
	}

	public void handleCancelButtonAction (ActionEvent event) 
	{
		mainController.show("Project_search");	
	}

	public void handleSubmitButtonAction (ActionEvent event) 
	{
		projectService.save(projectWrapper.getProject());
		mainController.show("Project_search");	
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
		projectName.setText(String.valueOf(projectWrapper.getName()));
		projectDescription.setText(String.valueOf(projectWrapper.getDescription()));
		
		projectWrapper.nameProperty().bindBidirectional(projectName.textProperty());
		projectWrapper.descriptionProperty().bindBidirectional(projectDescription.textProperty());
		
		refreshContactsList();
		refreshRisque();
		refreshImage();
			
	}

	public void refreshContacts () 
	{
		//Start of user code refreshContacts
		// TODO: Implement me !
		//End of user code	
	}

	public void refreshContactsList () 
	{
		//Start of user code refreshContactsList
		// ex: projectContacts.setItems(javafx.collections.FXCollections.observableList(projectWrapper.getContactsProperty()));	
		// TODO: Implement me !
		//End of user code	
	}

	public void refreshImage () 
	{
		//Start of user code refreshImage
		// TODO: Implement me !
		//End of user code	
	}

	public void refreshRisque () 
	{
		//Start of user code refreshRisque
		// TODO: Implement me !
		//End of user code	
	}

	public void risqueHandleAction (ActionEvent event) 
	{
		//Start of user code risqueHandleAction
		// TODO: implement me! 
		//End of user code	
	}

	public void selectContacts () 
	{
		//Start of user code selectContacts
		// TODO: Implement me !
		//End of user code	
	}

	public void selectImage () 
	{
		//Start of user code selectImage
		// ex: projectWrapper.setPersistentImage(projectImage.getSelectionModel().getSelectedItem());
		// TODO: Implement me !
		//End of user code	
	}

	public void selectRisque () 
	{
		//Start of user code selectRisque
		// ex: projectWrapper.setRisque(projectRisque.getSelectionModel().getSelectedItem());
		// TODO: Implement me !
		//End of user code	
	}

	public void setProjectWrapper (ProjectWrapper w) 
	{
		this.projectWrapper = w;	
	}


}
