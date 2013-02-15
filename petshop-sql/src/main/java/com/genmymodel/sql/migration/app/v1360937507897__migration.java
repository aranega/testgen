/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column myAttributeIsBioutifoul is added to Item
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1360937507897__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		/**
		 * Addition: Column myAttributeIsBioutifoul is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN myAttributeIsBioutifoul VARCHAR(255);");



	}
}


