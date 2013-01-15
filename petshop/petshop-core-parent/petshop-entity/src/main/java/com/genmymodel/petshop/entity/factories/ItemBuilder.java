package com.genmymodel.petshop.entity.factories;


import com.genmymodel.petshop.wrapper.Item;
import com.genmymodel.petshop.wrapper.Product;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ItemBuilder<BUILDER extends ItemBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private Double price;
	
	private Product product;
	
	private String quantity;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	ProductBuilder<?> productBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected ItemBuilder() {
	}
	
	protected Item createValue() {
		return new Item();
	}
	
	public Item build() throws NullPointerException {
		Item result =  this.createValue() ;
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (price == null) {
			handleDefaultPrice(result);
		} else {
			result.setPrice(price);
		}
		if (product == null) {
			handleDefaultProduct(result);
		} else {
			result.setProduct(product);
		}
		if (quantity == null) {
			handleDefaultQuantity(result);
		} else {
			result.setQuantity(quantity);
		}
		if (updateDate == null) {
			handleDefaultUpdateDate(result);
		} else {
			result.setUpdateDate(updateDate);
		}
		if (version == null) {
			handleDefaultVersion(result);
		} else {
			result.setVersion(version);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */
	private void handleDefaultCreationDate(Item result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Item.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Item.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultId(Item result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Item.id", "0")));
		//End of user code
	}

	private void handleDefaultPrice(Item result) {
		//Start of user code default feature for handleDefaultPrice
		result.setPrice(Double.valueOf(cfg.getProperty("defaultValue.Item.price", "0")));
		//End of user code
	}

	private void handleDefaultProduct(Item result) {
		//Start of user code default feature for handleDefaultProduct
		result.setProduct(productBuilder.build());
		//End of user code
	}

	private void handleDefaultQuantity(Item result) {
		//Start of user code default feature for handleDefaultQuantity
		result.setQuantity(cfg.getProperty("defaultValue.Item.quantity"));
		//End of user code
	}

	private void handleDefaultUpdateDate(Item result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Item.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Item.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Item result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Item.version", "0")));
		//End of user code
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER price(Double myPrice) {
			this.price = myPrice;
			return (BUILDER) this;
	}

	public BUILDER product(Product myProduct) {
			this.product = myProduct;
			return (BUILDER) this;
	}

	public BUILDER quantity(String myQuantity) {
			this.quantity = myQuantity;
			return (BUILDER) this;
	}

	public BUILDER updateDate(java.util.Date myUpdateDate) {
			this.updateDate = myUpdateDate;
			return (BUILDER) this;
	}

	public BUILDER version(Integer myVersion) {
			this.version = myVersion;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
