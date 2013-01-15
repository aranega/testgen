package com.dooapp.fireaOLD.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for Direction Enumeration
 * End of user code -->
 */

public enum Direction
{
	PRESSURE("Direction.PRESSURE"),
	DEPRESSURE("Direction.DEPRESSURE");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a Direction with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private Direction(String myKey) { this.key = myKey; }

	/**
	 *{@inheritDoc}
	 */
	@Override
	public String toString()
	{ 
		return rb.getString(key);
	}

	//Start of user code enums methods
	// Feed me!
	//End of user code
}
