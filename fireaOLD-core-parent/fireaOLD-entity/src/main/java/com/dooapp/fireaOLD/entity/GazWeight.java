package com.dooapp.fireaOLD.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for GazWeight Enumeration
 * End of user code -->
 */

public enum GazWeight
{
	HEAVY("GazWeight.HEAVY"),
	LIGHT("GazWeight.LIGHT"),
	MIXED("GazWeight.MIXED");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a GazWeight with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private GazWeight(String myKey) { this.key = myKey; }

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
