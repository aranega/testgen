package com.genmymodel.handler;

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
import com.genmymodel.petshop.entity.ApplicationDomain;
import com.genmymodel.petshop.wrapper.Customer;
import com.genmymodel.petshop.entity.factories.CustomerBuilder;

/**
 * Handler to create Customer<br>
 * <br>
 * Created at : 1358259859<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 */
public class CreateCustomerHandler implements EventHandler<LinkEvent<Location>> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(CreateCustomerHandler.class);
	
	/**
	* The famous {@link EventBus}
 	*/
	@Inject
	private EventBus bus;

	/**
 	* The famous {@link ResourceBundle}
 	*/
	@Inject
	private ResourceBundle rb;

	/**
 	* An {@link Executor} going back to the FX-Thread
 	*/
	@Inject
	@FX
	private Executor fx;
	/**
	 * The builder to create the object
	 */
	@Inject
	private CustomerBuilder itemBuilder;
	/**
	 * The entity manager to store the object
	 */
	@Inject
	private EntityManager manager;

	/**
	 * protected constructor to avoid IOC vs. Non IOC bug
	 */
	@Inject
	protected CreateCustomerHandler() {
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean canHandle(Event event) {
		if (event instanceof LinkEvent) {
			@SuppressWarnings("rawtypes")
			Location location = ((LinkEvent) event).getLocation();
			return Action.CREATE.equals(location.getAction()) && ApplicationDomain.CUSTOMER.equals(location.getDomain());
		}
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void handle(LinkEvent<Location> event) {
		Customer item = manager.save(itemBuilder.build());
		bus.publish(new LinkEvent<DisplayLocation>(new DisplayLocation(ApplicationDomain.CUSTOMER, Customer.class, item.getId())));
	}
}
