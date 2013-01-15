package com.genmymodel.petshop.entity;


//Start of user code for imports
// TODO: import me!
//End of user code

//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.genmymodel.petshop.wrapper.Item;
import com.dooapp.lib.common.entity.Bean;

//Start of user code for queries
//End of user code

@javax.persistence.Entity
public class ItemBean implements Bean
{
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(ItemBean.class);

	@javax.persistence.Column(name = "CREATION_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date creationDate;
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "seq", initialValue = 1, allocationSize = 10)
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE, generator = "seq")
	@javax.persistence.Column(name = "ID")
	private long id;
	
	private double price;
	
	@javax.persistence.ManyToOne(cascade = javax.persistence.CascadeType.ALL)
	private ProductBean product;
	
	private String quantity;
	@javax.persistence.Column(name = "UPDATE_DATE")
	@javax.persistence.Temporal(javax.persistence.TemporalType.TIMESTAMP)
	private java.util.Date updateDate;
	@javax.persistence.Version
	@javax.persistence.Column(name = "VERSIONCOLUMN")
	private int version;

	@javax.persistence.Transient
	private Item wrapper;
    	
	/**
	 * The current UUID of this object.<br>
	 * It's generated by the JPA provider, so you do not have to do it yourself.<br>
	 * <br>
	 * 
	 * @see <a
	 *      href="http://openjpa.apache.org/builds/2.1.1/apache-openjpa-2.1.1/docs/jpa_overview_meta_field.html#jpa_overview_meta_gen">jpa
	 *      documentation</a>
	 * @see <a href="http://fr.wikipedia.org/wiki/UUID">wikipedia</a>
	 */
	@javax.persistence.Column(name = "UUID", columnDefinition = "CHAR(36)")
	private String uuid;
	@javax.persistence.Transient
	@Override
	public Item getWrapper() {
		if (wrapper == null) {
			wrapper = new Item(this);
		}
		return wrapper;
	}
	
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	@javax.persistence.Transient
	public void setWrapper(Item wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/**
	 * Configure date and identifiant when persisting the object the first time
	 */
	@javax.persistence.PrePersist
	void initDates() {
		updateDate = new java.util.Date();
		creationDate = new java.util.Date();
		if (uuid == null) {
			uuid = java.util.UUID.randomUUID().toString();
		}
	}
	
	/**
	 * Configure the update date when updating the object
	 */
	@javax.persistence.PreUpdate
	void initUpdateDate() {
		updateDate = new java.util.Date();
	}
	

	public java.util.Date getCreationDate(){
		return this.creationDate;
	}
	
	public void setCreationDate(java.util.Date arg0){
		this.creationDate = arg0;
	}
	
	public void unsetCreationDate(java.util.Date arg0){
		this.creationDate = null;
	}
	public long getId(){
		return this.id;
	}
	
	public void setId(long arg0){
		this.id = arg0;
	}
	public double getPrice(){
		return this.price;
	}
	
	public void setPrice(double arg0){
		this.price = arg0;
	}
	public ProductBean getProduct(){
		return this.product;
	}
	
	public void setProduct(ProductBean arg0){
		this.product = arg0;
	}
	
	public void unsetProduct(){
			this.product = null;
			
	} 
	public String getQuantity(){
		return this.quantity;
	}
	
	public void setQuantity(String arg0){
		this.quantity = arg0;
	}
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	
	public void setUpdateDate(java.util.Date arg0){
		this.updateDate = arg0;
	}
	
	public void unsetUpdateDate(java.util.Date arg0){
		this.updateDate = null;
	}
	public int getVersion(){
		return this.version;
	}
	
	public void setVersion(int arg0){
		this.version = arg0;
	}
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
