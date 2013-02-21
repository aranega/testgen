package com.dooapp.firea.entity;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/**
 * <!-- begin-user-doc -->
 * 
 * <!--  end-user-doc  -->
 * @generated
 */

public enum GazWeight
{
	HEAVY("GazWeight.HEAVY"),
	LIGHT("GazWeight.LIGHT"),
	MIXED("GazWeight.MIXED");
	
	/**
	 * The famous {@link ResourceBundle}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final ResourceBundle rb = IOC.getInjector().getInstance(ResourceBundle.class);

	/**
	 * The key used to translate
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private final String key;

	/**
	 * Create a GazWeight with a translation key
	 * @param myKey
	 * the i18n key
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private GazWeight(String myKey) { this.key = myKey; }

	/**
	 * {@inheritDoc}
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	@Override
	public String toString()
	{ 
		return rb.getString(key);
	}

}
