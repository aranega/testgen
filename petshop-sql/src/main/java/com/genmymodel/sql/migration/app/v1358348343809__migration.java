/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Table Customer
		Addition: Column status is added to Order
		Addition: Table Product
		Addition: Entry preparation in OrderStatus (nothing to do)
		Addition: Column lastName is added to Customer
		
		
		Addition: Column line2 is added to Address
		Addition: Column id is added to Address
		Addition: Column quantity is added to Item
		Addition: Column id is added to Cart
		Addition: Column country is added to Address
		Addition: Table Cart
		Addition: Table Address
		
		Addition: FK carts is added to Customer
		Addition: FK customer is added to Order
		Addition: FK cart is added to Order
		Addition: Table Food
		Addition: Column firstName is added to Customer
		Addition: Table Item
		Addition: Domain OrderStatus (nothing to do)
		Addition: Column date is added to Order
		Addition: Column reference is added to Order
		Addition: Column id is added to Item
		Addition: Column name is added to Product
		Addition: Entry expeditions in OrderStatus (nothing to do)
		Addition: Column line1 is added to Address
		Addition: Column creationDate is added to Cart
		Addition: Table Order
		Addition: Column id is added to Customer
		Addition: Table Toy
		Addition: Column attribute is added to Food
		
		Addition: Column price is added to Item
		Addition: Column description is added to Product
		Addition: Column id is added to Order
		
		Addition: FK product is added to Item
		Addition: FK deliveryAddress is added to Order
		Addition: FK paymentAddress is added to Order
		Addition: Column city is added to Address
		Addition: FK address is added to Customer
		Addition: Column id is added to Product
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358348343809__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table Customer
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CustomerBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Product
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProductBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Cart
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CartBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Address
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS AddressBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Food
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FoodBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Item
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ItemBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Order
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS OrderBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Toy
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ToyBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column status is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN status VARCHAR(255);");
		
		/**
		 * Addition: Column lastName is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN lastName VARCHAR(255);");
		
		
		/**
		 * Addition: Column line2 is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN line2 VARCHAR(255);");
		/**
		 * Addition: Column id is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column quantity is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN quantity VARCHAR(255);");
		/**
		 * Addition: Column id is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CartBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column country is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN country VARCHAR(255);");
		
		/**
		 * Addition: FK carts is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_ID) REFERENCES AddressBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_ID) REFERENCES CartBean(ID) ON DELETE CASCADE;");
		
		
		/**
		 * Addition: FK cart is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_ID) REFERENCES CartBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_ID) REFERENCES CustomerBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_ID) REFERENCES AddressBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_ID) REFERENCES AddressBean(ID);");
		
		/**
		 * Addition: Column firstName is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN firstName VARCHAR(255);");
		/**
		 * Addition: Column date is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN date VARCHAR(255);");
		/**
		 * Addition: Column reference is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN reference VARCHAR(255);");
		/**
		 * Addition: Column id is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column line1 is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN line1 VARCHAR(255);");
		/**
		 * Addition: Column creationDate is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CartBean ADD COLUMN creationDate TIMESTAMP;");
		/**
		 * Addition: Column id is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column attribute is added to Food
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FoodBean ADD COLUMN attribute VARCHAR(255);");
		
		/**
		 * Addition: Column price is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN price DOUBLE;");
		/**
		 * Addition: Column description is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column id is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: FK product is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE ItemBean ADD FOREIGN KEY(product_ID) REFERENCES ProductBean(ID);");
		
		/**
		 * Addition: FK deliveryAddress is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_ID) REFERENCES CartBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_ID) REFERENCES CustomerBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_ID) REFERENCES AddressBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_ID) REFERENCES AddressBean(ID);");
		
		/**
		 * Addition: FK paymentAddress is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_ID) REFERENCES CartBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_ID) REFERENCES CustomerBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_ID) REFERENCES AddressBean(ID);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_ID) REFERENCES AddressBean(ID);");
		
		/**
		 * Addition: Column city is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: FK address is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_ID) REFERENCES AddressBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_ID) REFERENCES CartBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column id is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN id BIGINT;");



	}
}


