/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: FK c is added to E
		Addition: Table E
		Addition: FK a is added to B
		Addition: Table D
		Addition: Column id is added to E
		
		
		Addition: Column id is added to B
		Addition: FK a is added to D
		
		Addition: Column id is added to C
		Addition: Column id is added to D
		Addition: FK b is added to C
		Addition: Column id is added to A
		Addition: Table C
		
		Addition: Table B
		Addition: Table A
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1364399632762__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table E
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table D
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table C
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table B
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table A
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ABean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: FK c is added to E
		 */
		jdbcTemplate.execute("ALTER TABLE EBean ADD FOREIGN KEY(c_ID) REFERENCES CBean(ID);");
		
		
		/**
		 * Addition: Column id is added to E
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column id is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK a is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE DBean ADD FOREIGN KEY(a_ID) REFERENCES ABean(ID);");
		
		
		/**
		 * Addition: Column id is added to C
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK b is added to C
		 */
		jdbcTemplate.execute("ALTER TABLE CBean ADD FOREIGN KEY(b_ID) REFERENCES BBean(ID);");
		
		/**
		 * Addition: Column id is added to A
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ABean ADD COLUMN id BIGINT;");
		



	}
}


