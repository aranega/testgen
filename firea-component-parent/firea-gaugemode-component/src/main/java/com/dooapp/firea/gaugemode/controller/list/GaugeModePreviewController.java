package com.dooapp.firea.gaugemode.controller.list;


import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.fxml.FXML;
import javafx.scene.Node;

import javafx.scene.control.Label;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.controller.ChildController;
import com.dooapp.lib.event.bus.EventBus;
import com.dooapp.firea.ApplicationDomain;
import com.dooapp.firea.wrapper.GaugeMode;
import com.dooapp.lib.annotation.Context;

/**
 * Controller to show the GaugeMode in the list.<br>
 * <br>
 * Created at : date<br>
 *
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 *  
 * @generated
 */
public class GaugeModePreviewController extends AbstractController<Node> // Start of user code bloc for interfaces
implements ChildController<GaugeMode, Node>{
//End of user code


	/**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(GaugeModePreviewController.class);

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
	 * {@inheritDoc}
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Override
	protected void configureView() {
		GaugeMode item = itemProperty.get();
		viewBinder.bind(item.gaugeTypeProperty(), gaugeType);
		viewBinder.bind(item.nameProperty(), name);
	}

	/**
	 * protected constructor to prevent non IOC instantiation.
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
	protected GaugeModePreviewController(){}
	/**
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@Inject
		@Context
	private ObjectProperty<GaugeMode> itemProperty;
	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private Label gaugeType;

	/**
	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private Label name;



	/**
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<GaugeMode> itemProperty(){
		if(itemProperty==null){
			itemProperty = new SimpleObjectProperty<GaugeMode>();
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
	public void setItem(GaugeMode item) {
		itemProperty().set(item);
	}

	/**
	 * {@inheritDoc}
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	public GaugeMode getItem() {
		return itemProperty().get();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private void delete(){
		ApplicationDomain.GAUGEMODE.deleteHandler(getItem()).handle(null);
	}
	/**
	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private void open(){
		ApplicationDomain.GAUGEMODE.showHandler(GaugeMode.class, getItem().getId()).handle(null);
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

