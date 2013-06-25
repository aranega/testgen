package com.dooapp.firea.calibrationstep.controller;
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
import com.dooapp.firea.enumeration.StepStatus;
import com.dooapp.firea.wrapper.CalibrationStep;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class CalibrationStepController extends AbstractController<Node>
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
    private static final Logger logger = LoggerFactory.getLogger(CalibrationStepController.class);
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
     * The CalibrationStep we will use to configure this controller
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    @Context
    private ObjectProperty<CalibrationStep>itemProperty;
    /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField afterHoleELA;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField beforeHoleELA;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField date;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField errorPercent;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private ChoiceBox<StepStatus> status;
				/**
     * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Override
    protected void configureView() {
		CalibrationStep item = itemProperty.get();
		viewBinder.bind(item.afterHoleELAProperty(), afterHoleELA);
		viewBinder.bind(item.beforeHoleELAProperty(), beforeHoleELA);
		viewBinder.bind(item.dateProperty(), date, java.util.Date.class);
		viewBinder.bind(item.errorPercentProperty(), errorPercent);
		viewBinder.bind(item.statusProperty(), status, StepStatus.class);
	}
    /**
     * protected constructor to prevent non IOC instantiation.
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    protected CalibrationStepController() {}
    /**
	 * @generated
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		status.getItems().addAll(StepStatus.values()); 
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

