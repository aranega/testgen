package com.dooapp.firea.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;


public enum SampleStatus
{
	NO_STARTED("SampleStatus.NO_STARTED"),
	STARTED("SampleStatus.STARTED"),
	DONE("SampleStatus.DONE"),
	ERROR("SampleStatus.ERROR");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a SampleStatus with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private SampleStatus(String myKey) { this.key = myKey; }

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
