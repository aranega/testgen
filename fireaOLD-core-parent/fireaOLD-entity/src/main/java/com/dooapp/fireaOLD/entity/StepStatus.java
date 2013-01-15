package com.dooapp.fireaOLD.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for StepStatus Enumeration
 * End of user code -->
 */

public enum StepStatus
{
	NO_STARTED("StepStatus.NO_STARTED"),
	READY("StepStatus.READY"),
	IN_PROGRESS("StepStatus.IN_PROGRESS"),
	WAIT_FOR_VALIDATION("StepStatus.WAIT_FOR_VALIDATION"),
	DONE("StepStatus.DONE"),
	ERROR("StepStatus.ERROR");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a StepStatus with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private StepStatus(String myKey) { this.key = myKey; }

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
