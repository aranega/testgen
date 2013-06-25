package com.dooapp.firea.contact.controller;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.net.URL;
import javafx.beans.property.ObjectProperty;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.enumeration.ContactKind;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ContactController extends AbstractController<Node>
 implements Initializable
// Start of user code bloc for interfaces
//End of user code
{
    /**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
 	 * @generated
 	 */
    private static final Logger logger = LoggerFactory.getLogger(ContactController.class);
    /**
     * The famous {@link com.dooapp.lib.event.bus.EventBus}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Inject
    private EventBus bus;
    /**
     * The famous {@link java.util.ResourceBundle}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Inject
    private ResourceBundle rb;
    /**
     * An {@link java.util.concurrent.Executor} going back to the FX-Thread
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Inject
    @FX
    private Executor fx;
    /**
     * The Contact we will use to configure this controller
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    @Context
    private ObjectProperty<Contact>itemProperty;
    /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField address2;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField adress1;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField city;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField email;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private ChoiceBox<ContactKind> kind;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField name;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField person;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField phone;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField siret;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField zipCode;
				/**
     * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Override
    protected void configureView() {
		Contact item = itemProperty.get();
		viewBinder.bind(item.address2Property(), address2);
		viewBinder.bind(item.adress1Property(), adress1);
		viewBinder.bind(item.cityProperty(), city);
		viewBinder.bind(item.emailProperty(), email);
		viewBinder.bind(item.kindProperty(), kind, ContactKind.class);
		viewBinder.bind(item.nameProperty(), name);
		viewBinder.bind(item.personProperty(), person);
		viewBinder.bind(item.phoneProperty(), phone);
		viewBinder.bind(item.siretProperty(), siret);
		viewBinder.bind(item.zipCodeProperty(), zipCode);
	}
    /**
     * protected constructor to prevent non IOC instantiation.
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    protected ContactController() {}
    /**
	 * @generated
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		kind.getItems().addAll(ContactKind.values()); 
	}
				/**
     * {@inheritDoc}<br>
     * Use {@link #addObservables(javafx.collections.ObservableList...)} and
     * {@link #addObservables(javafx.beans.value.ObservableValue...)} to register every value that will call
     * {@link #configure()} and {@link #unconfigure()} when they change.<br>
     * To have more information see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
     *
     * @see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
     *      <!-- begin-user-doc -->
     *      <!--  end-user-doc  -->
     * @generated
     */
    @Override
    protected void registerObservables() {
		addObservables(itemProperty);
	}
}

