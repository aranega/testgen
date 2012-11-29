package com.dooapp.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dooapp.lib.event.Event;
import com.dooapp.lib.event.bus.EventHandler;

/**
 * TODO write documentation<br>
 * <br>
 * Created at : 1354195798<br>
 * 
 * @author genmymodel
 * @since 1.0-SNAPSHOT
 * 
 */
public class PlaceHolderHandler implements EventHandler<Event> {
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(PlaceHolderHandler.class);

	/**
	 * {@inheritDoc}
	 */

	public void handle(Event arg0) {
		// TODO write this method
		throw new UnsupportedOperationException("Not implemented");
	}

	/**
	 * {@inheritDoc}
	 */

	public boolean canHandle(Event event) {
		// TODO write this method
		return false;
	}
}
