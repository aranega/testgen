package com.dooapp.dooapptest.c.controller;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
import javafx.fxml.FXML;
import javafx.beans.property.ObjectProperty;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.dooappTest.wrapper.C;
import com.dooapp.dooapptest.wrapper.C;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class CController extends AbstractController<Node>
// Start of user code bloc for interfaces
//End of user code
{
	/**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(CController.class);
	
	/**
	 * The famous {@link EventBus}
	 * @generated
	 */
	@Inject
	private EventBus bus;

	/**
	 * The famous {@link ResourceBundle}
	 * @generated
	 */
	@Inject
	private ResourceBundle rb;

	/**
	 * An {@link Executor} going back to the FX-Thread
	 * @generated
	 */
	@Inject
	@FX
	private Executor fx;

	/**
	 * @generated
	 */
	@Inject
	@Context
	private ObjectProperty<C> itemProperty;	


	/**
	 * protected constructor to prevent non IOC instantiation.
	 * @generated
	 */
	@Inject
	protected CController(){}
	

	/**
	 * {@inheritDoc}
	 * @generated
	 */
	@Override
	protected void configureView() {
		C item = itemProperty.get();
	}

	/**
	 * {@inheritDoc}<br>
	 * Use {@link #addObservables(javafx.collections.ObservableList...)} and
	 * {@link #addObservables(javafx.beans.value.ObservableValue...)} to register every value that will call
	 * {@link #configure()} and {@link #unconfigure()} when they change.<br>
	 * To have more information see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * 
	 * @see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * @generated
	 */
	@Override
	protected void registerObservables() {
		addObservables(itemProperty);
	}
}

