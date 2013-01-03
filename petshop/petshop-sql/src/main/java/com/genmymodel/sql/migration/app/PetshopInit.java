/*********************************************
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 17 December 2012
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class PetshopInit implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		// ----
		// Create Hibernate Sequence, uncomment if needed
		// ----
		// jdbcTemplate.execute("CREATE SEQUENCE IF NOT EXISTS HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1");


		/*
		 *  Table structure Product
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProductBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"description VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure Item
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ItemBean (" +
						"ID BIGINT PRIMARY KEY," +
						"price DOUBLE," +
						"quantity VARCHAR(255)," +
						"uuid CHAR(36)," +
						"product_ID BIGINT);");
		
		/*
		 *  Table structure Customer
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CustomerBean (" +
						"ID BIGINT PRIMARY KEY," +
						"firstName VARCHAR(255)," +
						"lastName VARCHAR(255)," +
						"uuid CHAR(36)," +
						"address_ID BIGINT," +
						"carts_ID BIGINT);");
		
		/*
		 *  Table structure Address
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS AddressBean (" +
						"ID BIGINT PRIMARY KEY," +
						"line1 VARCHAR(255)," +
						"line2 VARCHAR(255)," +
						"city VARCHAR(255)," +
						"country VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure Cart
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CartBean (" +
						"ID BIGINT PRIMARY KEY," +
						"creationDate TIMESTAMP," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure Order
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS OrderBean (" +
						"ID BIGINT PRIMARY KEY," +
						"reference VARCHAR(255)," +
						"DATECOLUMN VARCHAR(255)," +
						"status VARCHAR(255)," +
						"uuid CHAR(36)," +
						"cart_ID BIGINT," +
						"customer_ID BIGINT," +
						"deliveryAddress_ID BIGINT," +
						"paymentAddress_ID BIGINT);");
		
		/*
		 *  Table structure Food
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FoodBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"description VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure Toy
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ToyBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"description VARCHAR(255)," +
						"uuid CHAR(36));");
		

		
		
		
		
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CART_ITEMS (" +
						"CartBean_ID BIGINT PRIMARY KEY," +
						"items_ID BIGINT," +
						"FOREIGN KEY(items_ID) REFERENCES ItemBean(ID));");					
		
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ORDER_ITEMS (" +
						"OrderBean_ID BIGINT PRIMARY KEY," +
						"items_ID BIGINT," +
						"FOREIGN KEY(items_ID) REFERENCES ItemBean(ID));");					
		
		
		

		/*
		 * Relationships
		 */
		jdbcTemplate.execute("ALTER TABLE ItemBean ADD FOREIGN KEY(product_ID) REFERENCES ProductBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_ID) REFERENCES AddressBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_ID) REFERENCES CartBean(ID) ON DELETE CASCADE;");
		
		
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_ID) REFERENCES CartBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_ID) REFERENCES CustomerBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_ID) REFERENCES AddressBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_ID) REFERENCES AddressBean(ID);");
		
	}
}
