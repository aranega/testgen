/*********************************************
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Entry preparation in OrderStatus (nothing to do)
		Addition: Table Customer
		Addition: FK items is added to Order
		Addition: Column lastName is added to Customer
		Addition: Column quantity is added to Item
		Addition: Table Item
		Addition: Table Cart
		Addition: FK order is added to Cart
		Addition: Column id is added to Item
		Addition: Table Product
		Addition: Table Toy
		Addition: Table Order
		Addition: Entry expedition in OrderStatus (nothing to do)
		Addition: Column status is added to Order
		Addition: Column country is added to Address
		Addition: Column name is added to Product
		Addition: Column id is added to Order
		Addition: FK product is added to Item
		Addition: Column id is added to Product
		Addition: Column description is added to Product
		Addition: Column reference is added to Order
		Addition: FK paymentAddress is added to Order
		Addition: Column firstName is added to Customer
		Addition: Table Address
		Addition: FK cart is added to Order
		Addition: Column city is added to Address
		Addition: Table Food
		Addition: Column id is added to Customer
		Addition: Column price is added to Item
		Addition: Column line2 is added to Address
		Addition: FK items is added to Cart
		Addition: Column line1 is added to Address
		Addition: FK carts is added to Customer
		Addition: Column date is added to Order
		Addition: FK deliveryAddress is added to Order
		Addition: FK customer is added to Order
		Addition: Column creationDate is added to Cart
		Addition: Column id is added to Address
		Addition: FK address is added to Customer
		Addition: Column id is added to Cart
		Addition: FK customer is added to Cart
		Addition: FK orders is added to Customer
		Addition: Domain OrderStatus (nothing to do)
**********************************************/

package com.genmymodel.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1357215774065__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table Customer
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CustomerBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Item
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ItemBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Cart
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CartBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Product
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProductBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Toy
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ToyBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Order
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS OrderBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Address
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS AddressBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Food
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FoodBean (" +
						"id BIGINT PRIMARY KEY);");
		

		
		/**
		 * Addition: FK items is added to Order
		 */
		// Join table generation
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  ORDER_ITEMS (" +
						"OrderBean_id BIGINT PRIMARY KEY," +
						"items_id BIGINT," +
						"FOREIGN KEY(items_id) REFERENCES ItemBean(id));");					
		/**
		 * Addition: Column lastName is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN lastName VARCHAR(255);");
		/**
		 * Addition: Column quantity is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN quantity VARCHAR(255);");
		/**
		 * Addition: FK order is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(items_id) REFERENCES ItemBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(customer_id) REFERENCES CustomerBean(id);");
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(order_id) REFERENCES OrderBean(id);");
		
		/**
		 * Addition: Column id is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column status is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column country is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN country VARCHAR(255);");
		/**
		 * Addition: Column name is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column id is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK product is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE ItemBean ADD FOREIGN KEY(product_id) REFERENCES ProductBean(id);");
		
		/**
		 * Addition: Column id is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column description is added to Product
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProductBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column reference is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN reference VARCHAR(255);");
		/**
		 * Addition: FK paymentAddress is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_id) REFERENCES CartBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(items_id) REFERENCES ItemBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_id) REFERENCES CustomerBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_id) REFERENCES AddressBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_id) REFERENCES AddressBean(id);");
		
		/**
		 * Addition: Column firstName is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN firstName VARCHAR(255);");
		/**
		 * Addition: FK cart is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_id) REFERENCES CartBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(items_id) REFERENCES ItemBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_id) REFERENCES CustomerBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_id) REFERENCES AddressBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_id) REFERENCES AddressBean(id);");
		
		/**
		 * Addition: Column city is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: Column id is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CustomerBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column price is added to Item
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ItemBean ADD COLUMN price DOUBLE;");
		/**
		 * Addition: Column line2 is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN line2 VARCHAR(255);");
		/**
		 * Addition: FK items is added to Cart
		 */
		// Join table generation
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  CART_ITEMS (" +
						"CartBean_id BIGINT PRIMARY KEY," +
						"items_id BIGINT," +
						"FOREIGN KEY(items_id) REFERENCES ItemBean(id));");					
		/**
		 * Addition: Column line1 is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN line1 VARCHAR(255);");
		/**
		 * Addition: FK carts is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_id) REFERENCES AddressBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_id) REFERENCES CartBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(orders_id) REFERENCES OrderBean(id) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column date is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.OrderBean ADD COLUMN date VARCHAR(255);");
		/**
		 * Addition: FK deliveryAddress is added to Order
		 */
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(cart_id) REFERENCES CartBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(items_id) REFERENCES ItemBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(customer_id) REFERENCES CustomerBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(deliveryAddress_id) REFERENCES AddressBean(id);");
		jdbcTemplate.execute("ALTER TABLE OrderBean ADD FOREIGN KEY(paymentAddress_id) REFERENCES AddressBean(id);");
		
		
		/**
		 * Addition: Column creationDate is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CartBean ADD COLUMN creationDate TIMESTAMP;");
		/**
		 * Addition: Column id is added to Address
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.AddressBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK address is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_id) REFERENCES AddressBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_id) REFERENCES CartBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(orders_id) REFERENCES OrderBean(id) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column id is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CartBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK customer is added to Cart
		 */
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(items_id) REFERENCES ItemBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(customer_id) REFERENCES CustomerBean(id);");
		jdbcTemplate.execute("ALTER TABLE CartBean ADD FOREIGN KEY(order_id) REFERENCES OrderBean(id);");
		
		/**
		 * Addition: FK orders is added to Customer
		 */
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(address_id) REFERENCES AddressBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(carts_id) REFERENCES CartBean(id) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE CustomerBean ADD FOREIGN KEY(orders_id) REFERENCES OrderBean(id) ON DELETE CASCADE;");
		



	}
}


