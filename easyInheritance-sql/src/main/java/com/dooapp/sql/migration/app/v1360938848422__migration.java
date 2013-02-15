/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Table B
		Addition: Column attribute2 is added to B
		Addition: Table C
		Addition: Table D
		
		Addition: Table A
		Addition: Column id is added to D
		Addition: Column id is added to B
		Addition: Column attribute is added to B
		Addition: FK b is added to D
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1360938848422__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table B
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table C
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table D
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table A
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ABean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column attribute2 is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN attribute2 VARCHAR(255);");
		
		/**
		 * Addition: Column id is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column attribute is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN attribute VARCHAR(255);");
		/**
		 * Addition: FK b is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE DBean ADD FOREIGN KEY(b_ID) REFERENCES BBean(ID);");
		



	}
}


