package com.dooapp.firea.bottleconfiguration.handler;

import java.util.ResourceBundle;
import java.util.concurrent.Executor;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.dooapp.lib.annotation.FX;
import com.dooapp.lib.event.Event;
import com.dooapp.lib.event.bus.EventBus;
import com.dooapp.lib.event.bus.EventHandler;
import com.dooapp.lib.location.Action;
import com.dooapp.lib.location.DisplayLocation;
import com.dooapp.lib.location.Location;
import com.dooapp.lib.location.event.LinkEvent;
import com.dooapp.lib.manager.EntityManager;
import com.dooapp.firea.ApplicationDomain;
import com.dooapp.firea.wrapper.BottleConfiguration;
import com.dooapp.firea.entity.factories.BottleConfigurationBuilder;

/**
 * Handler to create BottleConfiguration<br>
 * <br>
 * Created at : date<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
public class CreateBottleConfigurationHandler implements EventHandler<LinkEvent<Location>> {
	/**
	 * The famous {@link org.slf4j.Logger}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	private static final Logger logger = LoggerFactory.getLogger(CreateBottleConfigurationHandler.class);
	
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
	 * The builder to create the object
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private BottleConfigurationBuilder itemBuilder;
	/**
	 * The entity manager to store the object
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	private EntityManager manager;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Inject
	protected CreateBottleConfigurationHandler() {
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	public boolean canHandle(Event event) {
		if (event instanceof LinkEvent) {
			@SuppressWarnings("rawtypes")
			Location location = ((LinkEvent) event).getLocation();
			return Action.CREATE.equals(location.getAction()) && ApplicationDomain.BOTTLECONFIGURATION.equals(location.getDomain());
		}
		return false;
	}

	/**
	 * {@inheritDoc}
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
	 */
	@Override
	public void handle(LinkEvent<Location> event) {
		BottleConfiguration item = manager.save(itemBuilder.build());
		bus.publish(new LinkEvent<DisplayLocation>(new DisplayLocation(ApplicationDomain.BOTTLECONFIGURATION, BottleConfiguration.class, item.getId())));
	}
}
