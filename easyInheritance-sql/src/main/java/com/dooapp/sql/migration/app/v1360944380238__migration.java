/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column attribute2 is added to D
		
		
		
		
		
		
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1360944380238__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		
		
		
		
		

		/**
		 * Addition: Column attribute2 is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DBean ADD COLUMN attribute2 VARCHAR(255);");



	}
}


