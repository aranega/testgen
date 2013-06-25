package com.dooapp.firea.enumeration;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/**
 * <!-- begin-user-doc -->
 * bgbg

 * <!--  end-user-doc  -->
 * @generated
 */

public enum ContactKind
{
	TECHNICIAN("ContactKind.TECHNICIAN"),
	FIRM_MOE("ContactKind.FIRM_MOE"),
	FIRM_CUSTOMER("ContactKind.FIRM_CUSTOMER"),
	FIRM_MAINTENANCE("ContactKind.FIRM_MAINTENANCE");
	
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
	 * Create a ContactKind with a translation key
	 * @param myKey
	 * the i18n key
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private ContactKind(String myKey) { this.key = myKey; }

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
