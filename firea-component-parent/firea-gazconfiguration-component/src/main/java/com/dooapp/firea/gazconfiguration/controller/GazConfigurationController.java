package com.dooapp.firea.gazconfiguration.controller;
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
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class GazConfigurationController extends AbstractController<Node>
// Start of user code bloc for interfaces
//End of user code
{
    /**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
 	 * @generated
 	 */
    private static final Logger logger = LoggerFactory.getLogger(GazConfigurationController.class);
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
     * The GazConfiguration we will use to configure this controller
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    @Context
    private ObjectProperty<GazConfiguration>itemProperty;
    /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox droppedCeilFull;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox droppedFloorFull;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField leekRepartitionPercent;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField retentionGoal;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox retentionInterface;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox slowUnloading;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField slowUnloadingValue;
				/**
     * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Override
    protected void configureView() {
		GazConfiguration item = itemProperty.get();
		viewBinder.bind(item.droppedCeilFullProperty(), droppedCeilFull);
		viewBinder.bind(item.droppedFloorFullProperty(), droppedFloorFull);
		viewBinder.bind(item.leekRepartitionPercentProperty(), leekRepartitionPercent);
		viewBinder.bind(item.retentionGoalProperty(), retentionGoal);
		viewBinder.bind(item.retentionInterfaceProperty(), retentionInterface);
		viewBinder.bind(item.slowUnloadingProperty(), slowUnloading);
		viewBinder.bind(item.slowUnloadingValueProperty(), slowUnloadingValue);
	}
    /**
     * protected constructor to prevent non IOC instantiation.
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    protected GazConfigurationController() {}
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

