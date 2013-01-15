package com.dooapp.fireaOLD.entity.criteria;

import com.dooapp.fireaOLD.wrapper.criteria.PersistentImageCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for PersistentImageCriteria Class
 * End of user code -->
 */

public class PersistentImageCriteriaInstance implements Bean
{
	
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private String dataId;
	
	private Boolean error;
	
	private Long idMax;
	
	private Long idMin;
	
	private String preview;
	
	private String sourceFile;
	
	private String title;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private PersistentImageCriteria wrapper;

	/*
	 * <!-- Start of user code comment for PersistentImageCriteria wrapper getter
	 * End of user code -->
	 */
	public PersistentImageCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new PersistentImageCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for PersistentImageCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(PersistentImageCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for creationDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMax setter
	 * End of user code -->
	 */
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for creationDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for creationDateMin setter
	 * End of user code -->
	 */
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for dataId getter
	 * End of user code -->
	 */
	public String getDataId(){
		return this.dataId;
	}
	
	/*
	 * <!-- Start of user code comment for dataId setter
	 * End of user code -->
	 */
	public void setDataId(String arg0){
		this.dataId = arg0;
	} 
	/*
	 * <!-- Start of user code comment for error getter
	 * End of user code -->
	 */
	public Boolean isError(){
		return this.error;
	}
	
	/*
	 * <!-- Start of user code comment for error setter
	 * End of user code -->
	 */
	public void setError(Boolean arg0){
		this.error = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMax getter
	 * End of user code -->
	 */
	public Long getIdMax(){
		return this.idMax;
	}
	
	/*
	 * <!-- Start of user code comment for idMax setter
	 * End of user code -->
	 */
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for idMin getter
	 * End of user code -->
	 */
	public Long getIdMin(){
		return this.idMin;
	}
	
	/*
	 * <!-- Start of user code comment for idMin setter
	 * End of user code -->
	 */
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for preview getter
	 * End of user code -->
	 */
	public String getPreview(){
		return this.preview;
	}
	
	/*
	 * <!-- Start of user code comment for preview setter
	 * End of user code -->
	 */
	public void setPreview(String arg0){
		this.preview = arg0;
	} 
	/*
	 * <!-- Start of user code comment for sourceFile getter
	 * End of user code -->
	 */
	public String getSourceFile(){
		return this.sourceFile;
	}
	
	/*
	 * <!-- Start of user code comment for sourceFile setter
	 * End of user code -->
	 */
	public void setSourceFile(String arg0){
		this.sourceFile = arg0;
	} 
	/*
	 * <!-- Start of user code comment for title getter
	 * End of user code -->
	 */
	public String getTitle(){
		return this.title;
	}
	
	/*
	 * <!-- Start of user code comment for title setter
	 * End of user code -->
	 */
	public void setTitle(String arg0){
		this.title = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMax getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMax setter
	 * End of user code -->
	 */
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for updateDateMin getter
	 * End of user code -->
	 */
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	/*
	 * <!-- Start of user code comment for updateDateMin setter
	 * End of user code -->
	 */
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for version getter
	 * End of user code -->
	 */
	public Integer getVersion(){
		return this.version;
	}
	
	/*
	 * <!-- Start of user code comment for version setter
	 * End of user code -->
	 */
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
