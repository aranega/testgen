package com.dooapp.firea.testedroom.controller;
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
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class TestedRoomController extends AbstractController<Node>
// Start of user code bloc for interfaces
//End of user code
{
    /**
	 * The famous {@link Logger}
 	 * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
 	 * @generated
 	 */
    private static final Logger logger = LoggerFactory.getLogger(TestedRoomController.class);
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
     * The TestedRoom we will use to configure this controller
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    @Context
    private ObjectProperty<TestedRoom>itemProperty;
    /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField CommissioningDate;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField altitude;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField choosenProtectedHeight;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox clapetsCF;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climDuct;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climReclycle;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climReclycleAuto;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climVMC;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climVMCAuto;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climWithNewAir;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox climWithNewAirAuto;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField droppedCeiling;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField droppedFloor;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField indicatedVolume;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField mainHeight;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField measuredVolume;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField mecanicalStrength;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField minimalProtectedHeight;
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
	private TextField netVolume;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField risqueHeight;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField risqueHeightPercent;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField totalHeight;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private CheckBox uniformHorizontality;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField unloadTime;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField volumeCorrection;
				/**
     * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Override
    protected void configureView() {
		TestedRoom item = itemProperty.get();
		viewBinder.bind(item.commissioningDateProperty(), CommissioningDate, java.util.Date.class);
		viewBinder.bind(item.altitudeProperty(), altitude);
		viewBinder.bind(item.choosenProtectedHeightProperty(), choosenProtectedHeight);
		viewBinder.bind(item.clapetsCFProperty(), clapetsCF);
		viewBinder.bind(item.climDuctProperty(), climDuct);
		viewBinder.bind(item.climReclycleProperty(), climReclycle);
		viewBinder.bind(item.climReclycleAutoProperty(), climReclycleAuto);
		viewBinder.bind(item.climVMCProperty(), climVMC);
		viewBinder.bind(item.climVMCAutoProperty(), climVMCAuto);
		viewBinder.bind(item.climWithNewAirProperty(), climWithNewAir);
		viewBinder.bind(item.climWithNewAirAutoProperty(), climWithNewAirAuto);
		viewBinder.bind(item.droppedCeilingProperty(), droppedCeiling);
		viewBinder.bind(item.droppedFloorProperty(), droppedFloor);
		viewBinder.bind(item.indicatedVolumeProperty(), indicatedVolume);
		viewBinder.bind(item.mainHeightProperty(), mainHeight);
		viewBinder.bind(item.measuredVolumeProperty(), measuredVolume);
		viewBinder.bind(item.mecanicalStrengthProperty(), mecanicalStrength);
		viewBinder.bind(item.minimalProtectedHeightProperty(), minimalProtectedHeight);
		viewBinder.bind(item.nameProperty(), name);
		viewBinder.bind(item.netVolumeProperty(), netVolume);
		viewBinder.bind(item.risqueHeightProperty(), risqueHeight);
		viewBinder.bind(item.risqueHeightPercentProperty(), risqueHeightPercent);
		viewBinder.bind(item.totalHeightProperty(), totalHeight);
		viewBinder.bind(item.uniformHorizontalityProperty(), uniformHorizontality);
		viewBinder.bind(item.unloadTimeProperty(), unloadTime);
		viewBinder.bind(item.volumeCorrectionProperty(), volumeCorrection);
	}
    /**
     * protected constructor to prevent non IOC instantiation.
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    protected TestedRoomController() {}
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

