package com.dooapp.dooapp-test.a.controller.list;

import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.fxml.FXML;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.scene.Node;
import javafx.scene.control.Label;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




import com.dooapp.dooapp-test.wrapper.A;

import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.controller.ChildController;
import com.dooapp.lib.event.bus.EventBus;

import com.dooapp.dooapp-test.ApplicationDomain;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class APreviewController extends AbstractController<Node> // Start of user code bloc for interfaces
implements ChildController<A, Node>{
//End of user code
	/**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(APreviewController.class);
	
	/**
	 * The famous {@link EventBus}
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private EventBus bus;

	/**
	 * The famous {@link ResourceBundle}
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	private ResourceBundle rb;

	/**
	 * An {@link Executor} going back to the FX-Thread
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	@FX
	private Executor fx;

	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	@Context
	private ObjectProperty<A> itemProperty;	


	/**
	 * protected constructor to prevent non IOC instantiation.
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	protected APreviewController(){}

	/**
	 * {@inheritDoc}
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void configureView() {
		A item = itemProperty.get();
	}

	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<A> itemProperty(){
		if(itemProperty==null){
			itemProperty = new SimpleObjectProperty<A>();
		}
		return itemProperty;
	}
	/**
	 * {@inheritDoc}
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	public void setItem(A item) {
		itemProperty().set(item);
	}
	
	/**
	 * {@inheritDoc}
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public A getItem() {
		return itemProperty().get();
	}
	
	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private void delete(){
		ApplicationDomain.A.deleteHandler(getItem()).handle(null);
	}

	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML 
	private void open(){
		ApplicationDomain.A.showHandler(A.class, getItem().getId()).handle(null);
	}
	
	/**
	 * {@inheritDoc}<br>
	 * Use {@link #addObservables(javafx.collections.ObservableList...)} and
	 * {@link #addObservables(javafx.beans.value.ObservableValue...)} to register every value that will call
	 * {@link #configure()} and {@link #unconfigure()} when they change.<br>
	 * To have more information see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * 
	 * @see http://gitlab.jack.dooapp.com/dooapp-lib/wikis/controller.registerObservables
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void registerObservables() {
		addObservables(itemProperty);
	}
}
