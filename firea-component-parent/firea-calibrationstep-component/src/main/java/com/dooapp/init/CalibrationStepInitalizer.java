 package com.dooapp.init;
import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.event.bus.EventBus;
import com.dooapp.lib.init.Initializer;
import com.dooapp.lib.init.InitializerOrder;
import com.dooapp.lib.manager.EntityManager;
import com.google.inject.Provider;
import javafx.collections.ObservableList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.inject.Inject;
import java.util.ResourceBundle;
import java.util.concurrent.Executor;
/**
 * This class init the CalibrationStep module<br>
 * <br>
 * Created at : date<br>
 *
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class CalibrationStepInitalizer extends Initializer{
    /**
     * The famous {@link org.slf4j.Logger}
     */
    private static final Logger logger=LoggerFactory.getLogger(CalibrationStepInitalizer.class);
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
     * An {@link Executor} going back to the FX-Thread
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    @Inject @FX
    private Executor fx;
    /**
     * {@inheritDoc}
     */
    public void init(){
            // TODO write this method
            logger.error(this.getClass()+" is doing nothing");
    }
    /**
     * {@inheritDoc}
     */
    public InitializerOrder getOrder(){
            // TODO write this method
            return InitializerOrder.AFTER_IOC;
    }
    /**
     * {@inheritDoc}
     */
    public double getInitializationTime(){
            // TODO write this method
            return 1;
    }
}
