/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Table C
		Addition: Column huge is added to E
		Addition: Column myAtt is added to B
		Addition: Table A
		Addition: FK a is added to B
		
		
		Addition: Column id is added to B
		Addition: Column id is added to E
		Addition: Column id is added to C
		Addition: Table E
		Addition: Column isOk is added to D
		Addition: Table D
		Addition: FK a2 is added to C
		Addition: Column id is added to D
		Addition: FK d is added to E
		Addition: Column id is added to A
		Addition: Table B
		
		Addition: FK b is added to D
		Addition: Column name is added to C
		Addition: Column name is added to A
		
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1364399378035__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table C
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table A
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ABean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
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
		 * Addition: Table B
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column huge is added to E
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EBean ADD COLUMN huge DOUBLE;");
		/**
		 * Addition: Column myAtt is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN myAtt VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column id is added to B
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to E
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to C
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column isOk is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DBean ADD COLUMN isOk BOOLEAN;");
		/**
		 * Addition: FK a2 is added to C
		 */
		jdbcTemplate.execute("ALTER TABLE CBean ADD FOREIGN KEY(a2_ID) REFERENCES ABean(ID);");
		
		/**
		 * Addition: Column id is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK d is added to E
		 */
		jdbcTemplate.execute("ALTER TABLE EBean ADD FOREIGN KEY(d_ID) REFERENCES DBean(ID);");
		
		/**
		 * Addition: Column id is added to A
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ABean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: FK b is added to D
		 */
		jdbcTemplate.execute("ALTER TABLE DBean ADD FOREIGN KEY(b_ID) REFERENCES BBean(ID);");
		
		/**
		 * Addition: Column name is added to C
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column name is added to A
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ABean ADD COLUMN name VARCHAR(255);");
		



	}
}


