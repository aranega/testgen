package com.genmymodel.petshop.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/*
 * <!-- Start of user code comment for OrderStatus Enumeration
 * End of user code -->
 */

/**
 * MyDoc
 
 */
public enum OrderStatus
{
	preparation("OrderStatus.preparation"),
	expedition("OrderStatus.expedition");
	
	/**
	 * The famous {@link ResourceBundle}
	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 *The key used to translate
	 */
	private final String key;

	/**
	 *Create a OrderStatus with a translation key
	 *@param myKey
	 * the i18n key
	 */
	private OrderStatus(String myKey) { this.key = myKey; }

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
