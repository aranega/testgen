/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Delete: Column attribute in Sample
		
		Modification: Entry MEASUREs via name property
			DETAILS: From MEASUREs to MEASURE
		
		
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358268193477__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		


		/**
		 * Delete: Column attribute in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS attribute;");

		
		/**
		 * Modification: Entry MEASUREs via name property
		 	DETAILS: From MEASUREs to MEASURE
		 */
		jdbcTemplate.execute("UPDATE PUBLIC.Sample SET airPressureCalculationMethod='MEASURE' WHERE airPressureCalculationMethod='MEASUREs';");
		
		

	}
}


