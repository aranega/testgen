package com.dooapp.firea.enumeration;

import java.util.ResourceBundle;
import com.dooapp.lib.guice.IOC;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public enum BeaufortScale
{
	FORCE0("BeaufortScale.FORCE0"),
	FORCE1("BeaufortScale.FORCE1"),
	FORCE2("BeaufortScale.FORCE2"),
	FORCE3("BeaufortScale.FORCE3"),
	FORCE4("BeaufortScale.FORCE4"),
	FORCE5("BeaufortScale.FORCE5"),
	FORCE6("BeaufortScale.FORCE6"),
	FORCE7("BeaufortScale.FORCE7"),
	FORCE8("BeaufortScale.FORCE8"),
	FORCE9("BeaufortScale.FORCE9");
	
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
	 * Create a BeaufortScale with a translation key
	 * @param myKey
	 * the i18n key
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private BeaufortScale(String myKey) { this.key = myKey; }

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
