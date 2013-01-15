package com.dooapp.fireaOLD.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for ProjectStatus Enumeration
 * End of user code -->
 */

public enum ProjectStatus
{
	TO_PLAN("ProjectStatus.TO_PLAN"),
	IN_PROGRESSION("ProjectStatus.IN_PROGRESSION"),
	DONE("ProjectStatus.DONE");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a ProjectStatus with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private ProjectStatus(String myKey) { this.key = myKey; }

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
