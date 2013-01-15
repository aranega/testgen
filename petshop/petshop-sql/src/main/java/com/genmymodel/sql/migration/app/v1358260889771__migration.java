/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column attribute is added to Customer
		
		Modification: Entry expedition via name property
			DETAILS: From expedition to expeditionff
		
		
		Modification: Entry preparation via name property
			DETAILS: From preparation to preparationKK
		
		
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358260889771__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		

		/**
		 * Addition: Column attribute is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN attribute VARBINARY;");


		
		/**
		 * Modification: Entry expedition via name property
		 	DETAILS: From expedition to expeditionff
		 */
		jdbcTemplate.execute("UPDATE PUBLIC.Order SET status='expeditionff' WHERE status='expedition';");
		
		
		/**
		 * Modification: Entry preparation via name property
		 	DETAILS: From preparation to preparationKK
		 */
		jdbcTemplate.execute("UPDATE PUBLIC.Order SET status='preparationKK' WHERE status='preparation';");
		
		
		

	}
}


