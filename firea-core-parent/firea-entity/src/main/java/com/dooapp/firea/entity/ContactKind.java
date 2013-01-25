package com.dooapp.firea.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for ContactKind Enumeration
 * End of user code -->
 */

public enum ContactKind
{
	TECHNICIAN("ContactKind.TECHNICIAN"),
	FIRM_MOE("ContactKind.FIRM_MOE"),
	FIRM_CUSTOMER("ContactKind.FIRM_CUSTOMER"),
	FIRM_MAINTENANCE("ContactKind.FIRM_MAINTENANCE");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a ContactKind with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private ContactKind(String myKey) { this.key = myKey; }

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
