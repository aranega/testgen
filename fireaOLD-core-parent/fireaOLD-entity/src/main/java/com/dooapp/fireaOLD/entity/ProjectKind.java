package com.dooapp.fireaOLD.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for ProjectKind Enumeration
 * End of user code -->
 */

public enum ProjectKind
{
	R13_APSAD("ProjectKind.R13_APSAD"),
	ISO_14520_2006("ProjectKind.ISO_14520_2006"),
	ISO_14520_2004("ProjectKind.ISO_14520_2004"),
	NFPA_2008("ProjectKind.NFPA_2008"),
	NFPA_2000("ProjectKind.NFPA_2000");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a ProjectKind with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private ProjectKind(String myKey) { this.key = myKey; }

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
