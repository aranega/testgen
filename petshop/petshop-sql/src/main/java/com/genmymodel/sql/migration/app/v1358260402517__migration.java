/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Modification: Table Toy via name property
			DETAILS: From Toy to Toying
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358260402517__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Modification: Table Toy via name property
		 	DETAILS: From Toy to Toying
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.Toy RENAME TO Toying;");




	}
}


