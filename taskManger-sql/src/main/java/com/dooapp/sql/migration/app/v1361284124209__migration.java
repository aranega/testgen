/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Domain Priority (nothing to do)
		Addition: Entry HARD in Priority (nothing to do)
		Addition: Column priority is added to Task
		Addition: FK owner is added to Task
		Addition: Column id is added to User
		Addition: Column firstname is added to User
		
		Addition: Column title is added to Task
		Addition: Column id is added to Task
		Addition: Entry LOW in Priority (nothing to do)
		Addition: Column age is added to User
		Addition: Column isCompleted is added to Task
		Addition: Column startAt is added to DelayedTask
		Addition: Table User
		Addition: Column endAt is added to DelayedTask
		Addition: Table DelayedTask
		Addition: Entry MEDIUM in Priority (nothing to do)
		Addition: Column lastname is added to User
		Addition: Table Task
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1361284124209__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		/**
		 * Addition: Table User
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS UserBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table DelayedTask
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DelayedTaskBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Task
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TaskBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		
		/**
		 * Addition: Column priority is added to Task
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TaskBean ADD COLUMN priority VARCHAR(255);");
		
		/**
		 * Addition: Column id is added to User
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.UserBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column firstname is added to User
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.UserBean ADD COLUMN firstname VARCHAR(255);");
		
		/**
		 * Addition: Column title is added to Task
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TaskBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column id is added to Task
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TaskBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column age is added to User
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.UserBean ADD COLUMN age INTEGER;");
		/**
		 * Addition: Column isCompleted is added to Task
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TaskBean ADD COLUMN isCompleted BOOLEAN;");
		/**
		 * Addition: Column startAt is added to DelayedTask
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DelayedTaskBean ADD COLUMN startAt VARCHAR(255);");
		/**
		 * Addition: Column endAt is added to DelayedTask
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DelayedTaskBean ADD COLUMN endAt VARCHAR(255);");
		
		/**
		 * Addition: Column lastname is added to User
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.UserBean ADD COLUMN lastname VARCHAR(255);");



	}
}


