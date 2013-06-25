package com.dooapp.firea.blowhole.controller;
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
import com.dooapp.firea.enumeration.Discharge;
import com.dooapp.firea.wrapper.BlowHole;
import com.dooapp.lib.annotation.Context;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.controller.AbstractController;
import com.dooapp.lib.event.bus.EventBus;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class BlowHoleController extends AbstractController<Node>
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
    private static final Logger logger = LoggerFactory.getLogger(BlowHoleController.class);
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
     * The BlowHole we will use to configure this controller
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    @Context
    private ObjectProperty<BlowHole>itemProperty;
    /**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private ChoiceBox<Discharge> Discharge;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField quantity;
				/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@FXML
	private TextField surface;
				/**
     * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Override
    protected void configureView() {
		BlowHole item = itemProperty.get();
		viewBinder.bind(item.dischargeProperty(), Discharge, Discharge.class);
		viewBinder.bind(item.quantityProperty(), quantity);
		viewBinder.bind(item.surfaceProperty(), surface);
	}
    /**
     * protected constructor to prevent non IOC instantiation.
     *
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    @Inject
    protected BlowHoleController() {}
    /**
	 * @generated
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Discharge.getItems().addAll(Discharge.values()); 
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

