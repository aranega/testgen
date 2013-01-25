package com.dooapp.firea.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for BottleUnit Enumeration
 * End of user code -->
 */

public enum BottleUnit
{
	WEIGHT("BottleUnit.WEIGHT"),
	VOLUME("BottleUnit.VOLUME");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a BottleUnit with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private BottleUnit(String myKey) { this.key = myKey; }

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
