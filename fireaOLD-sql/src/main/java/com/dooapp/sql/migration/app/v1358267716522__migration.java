/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		
		
		
		Modification: Entry MEASURE via name property
			DETAILS: From MEASURE to MEASUREs
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358267716522__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		



		
		
		/**
		 * Modification: Entry MEASURE via name property
		 	DETAILS: From MEASURE to MEASUREs
		 */
		jdbcTemplate.execute("UPDATE PUBLIC.Sample SET airPressureCalculationMethod='MEASUREs' WHERE airPressureCalculationMethod='MEASURE';");
		

	}
}


