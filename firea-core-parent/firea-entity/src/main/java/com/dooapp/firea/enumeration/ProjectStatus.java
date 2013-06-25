package com.dooapp.firea.enumeration;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public enum ProjectStatus
{
	TO_PLAN("ProjectStatus.TO_PLAN"),
	IN_PROGRESS("ProjectStatus.IN_PROGRESS"),
	DONE("ProjectStatus.DONE");
	
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
	 * Create a ProjectStatus with a translation key
	 * @param myKey
	 * the i18n key
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private ProjectStatus(String myKey) { this.key = myKey; }

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
