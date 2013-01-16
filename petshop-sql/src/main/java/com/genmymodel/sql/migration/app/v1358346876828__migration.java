/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column attribute is added to Food
		
		
		
		Modification: Entry expedition via name property
			DETAILS: From expedition to expeditions
		
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358346876828__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		

		/**
		 * Addition: Column attribute is added to Food
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FoodBean ADD COLUMN attribute VARCHAR(255);");


		
		/**
		 * Modification: Entry expedition via name property
		 	DETAILS: From expedition to expeditions
		 */
		jdbcTemplate.execute("UPDATE PUBLIC.Order SET status='expeditions' WHERE status='expedition';");
		
		

	}
}


