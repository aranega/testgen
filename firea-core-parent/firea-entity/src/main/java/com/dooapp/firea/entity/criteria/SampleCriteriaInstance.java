package com.dooapp.firea.entity.criteria;

import com.dooapp.firea.wrapper.criteria.SampleCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;

/*
 * Class
 * <!-- Start of user code comment for SampleCriteria Class
 * End of user code -->
 */

public class SampleCriteriaInstance implements Bean
{
	
	
	private com.dooapp.firea.entity.AirPressureCalculationMethod airPressureCalculationMethod;
	
	private Integer airPressureMax;
	
	private Integer airPressureMin;
	
	private com.dooapp.firea.entity.BeaufortScale beaufortScale;
	
	private java.util.Date creationDateMax;
	
	private java.util.Date creationDateMin;
	
	private java.util.Date dateMax;
	
	private java.util.Date dateMin;
	
	private Long idMax;
	
	private Long idMin;
	
	private String name;
	
	private Double phiEPercentMax;
	
	private Double phiEPercentMin;
	
	private Double phiIPercentMax;
	
	private Double phiIPercentMin;
	
	private Double roEMax;
	
	private Double roEMin;
	
	private Double roIMax;
	
	private Double roIMin;
	
	private com.dooapp.firea.entity.SampleStatus status;
	
	private Double tetaEMax;
	
	private Double tetaEMin;
	
	private Double tetaIMax;
	
	private Double tetaIMin;
	
	private java.util.Date updateDateMax;
	
	private java.util.Date updateDateMin;
	
	private Integer version;
	
	private Double windMeasureMax;
	
	private Double windMeasureMin;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	private SampleCriteria wrapper;

	/*
	 * <!-- Start of user code comment for SampleCriteria wrapper getter
	 * End of user code -->
	 */
	public SampleCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new SampleCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/*
	 * <!-- Start of user code comment for SampleCriteria wrapper setter
	 * End of user code -->
	 */
	public void setWrapper(SampleCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return this.airPressureCalculationMethod;
	}
	
	/*
	 * <!-- Start of user code comment for airPressureCalculationMethod setter
	 * End of user code -->
	 */
	public void setAirPressureCalculationMethod(com.dooapp.firea.entity.AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = arg0;
	} 
	/*
	 * <!-- Start of user code comment for airPressureMax getter
	 * End of user code -->
	 */
	public Integer getAirPressureMax(){
		return this.airPressureMax;
	}
	
	/*
	 * <!-- Start of user code comment for airPressureMax setter
	 * End of user code -->
	 */
	public void setAirPressureMax(Integer arg0){
		this.airPressureMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for airPressureMin getter
	 * End of user code -->
	 */
	public Integer getAirPressureMin(){
		return this.airPressureMin;
	}
	
	/*
	 * <!-- Start of user code comment for airPressureMin setter
	 * End of user code -->
	 */
	public void setAirPressureMin(Integer arg0){
		this.airPressureMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for beaufortScale getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.BeaufortScale getBeaufortScale(){
		return this.beaufortScale;
	}
	
	/*
	 * <!-- Start of user code comment for beaufortScale setter
	 * End of user code -->
	 */
	public void setBeaufortScale(com.dooapp.firea.entity.BeaufortScale arg0){
		this.beaufortScale = arg0;
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
	 * <!-- Start of user code comment for dateMax getter
	 * End of user code -->
	 */
	public java.util.Date getDateMax(){
		return this.dateMax;
	}
	
	/*
	 * <!-- Start of user code comment for dateMax setter
	 * End of user code -->
	 */
	public void setDateMax(java.util.Date arg0){
		this.dateMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for dateMin getter
	 * End of user code -->
	 */
	public java.util.Date getDateMin(){
		return this.dateMin;
	}
	
	/*
	 * <!-- Start of user code comment for dateMin setter
	 * End of user code -->
	 */
	public void setDateMin(java.util.Date arg0){
		this.dateMin = arg0;
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
	 * <!-- Start of user code comment for name getter
	 * End of user code -->
	 */
	public String getName(){
		return this.name;
	}
	
	/*
	 * <!-- Start of user code comment for name setter
	 * End of user code -->
	 */
	public void setName(String arg0){
		this.name = arg0;
	} 
	/*
	 * <!-- Start of user code comment for phiEPercentMax getter
	 * End of user code -->
	 */
	public Double getPhiEPercentMax(){
		return this.phiEPercentMax;
	}
	
	/*
	 * <!-- Start of user code comment for phiEPercentMax setter
	 * End of user code -->
	 */
	public void setPhiEPercentMax(Double arg0){
		this.phiEPercentMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for phiEPercentMin getter
	 * End of user code -->
	 */
	public Double getPhiEPercentMin(){
		return this.phiEPercentMin;
	}
	
	/*
	 * <!-- Start of user code comment for phiEPercentMin setter
	 * End of user code -->
	 */
	public void setPhiEPercentMin(Double arg0){
		this.phiEPercentMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for phiIPercentMax getter
	 * End of user code -->
	 */
	public Double getPhiIPercentMax(){
		return this.phiIPercentMax;
	}
	
	/*
	 * <!-- Start of user code comment for phiIPercentMax setter
	 * End of user code -->
	 */
	public void setPhiIPercentMax(Double arg0){
		this.phiIPercentMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for phiIPercentMin getter
	 * End of user code -->
	 */
	public Double getPhiIPercentMin(){
		return this.phiIPercentMin;
	}
	
	/*
	 * <!-- Start of user code comment for phiIPercentMin setter
	 * End of user code -->
	 */
	public void setPhiIPercentMin(Double arg0){
		this.phiIPercentMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for roEMax getter
	 * End of user code -->
	 */
	public Double getRoEMax(){
		return this.roEMax;
	}
	
	/*
	 * <!-- Start of user code comment for roEMax setter
	 * End of user code -->
	 */
	public void setRoEMax(Double arg0){
		this.roEMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for roEMin getter
	 * End of user code -->
	 */
	public Double getRoEMin(){
		return this.roEMin;
	}
	
	/*
	 * <!-- Start of user code comment for roEMin setter
	 * End of user code -->
	 */
	public void setRoEMin(Double arg0){
		this.roEMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for roIMax getter
	 * End of user code -->
	 */
	public Double getRoIMax(){
		return this.roIMax;
	}
	
	/*
	 * <!-- Start of user code comment for roIMax setter
	 * End of user code -->
	 */
	public void setRoIMax(Double arg0){
		this.roIMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for roIMin getter
	 * End of user code -->
	 */
	public Double getRoIMin(){
		return this.roIMin;
	}
	
	/*
	 * <!-- Start of user code comment for roIMin setter
	 * End of user code -->
	 */
	public void setRoIMin(Double arg0){
		this.roIMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for status getter
	 * End of user code -->
	 */
	public com.dooapp.firea.entity.SampleStatus getStatus(){
		return this.status;
	}
	
	/*
	 * <!-- Start of user code comment for status setter
	 * End of user code -->
	 */
	public void setStatus(com.dooapp.firea.entity.SampleStatus arg0){
		this.status = arg0;
	} 
	/*
	 * <!-- Start of user code comment for tetaEMax getter
	 * End of user code -->
	 */
	public Double getTetaEMax(){
		return this.tetaEMax;
	}
	
	/*
	 * <!-- Start of user code comment for tetaEMax setter
	 * End of user code -->
	 */
	public void setTetaEMax(Double arg0){
		this.tetaEMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for tetaEMin getter
	 * End of user code -->
	 */
	public Double getTetaEMin(){
		return this.tetaEMin;
	}
	
	/*
	 * <!-- Start of user code comment for tetaEMin setter
	 * End of user code -->
	 */
	public void setTetaEMin(Double arg0){
		this.tetaEMin = arg0;
	} 
	/*
	 * <!-- Start of user code comment for tetaIMax getter
	 * End of user code -->
	 */
	public Double getTetaIMax(){
		return this.tetaIMax;
	}
	
	/*
	 * <!-- Start of user code comment for tetaIMax setter
	 * End of user code -->
	 */
	public void setTetaIMax(Double arg0){
		this.tetaIMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for tetaIMin getter
	 * End of user code -->
	 */
	public Double getTetaIMin(){
		return this.tetaIMin;
	}
	
	/*
	 * <!-- Start of user code comment for tetaIMin setter
	 * End of user code -->
	 */
	public void setTetaIMin(Double arg0){
		this.tetaIMin = arg0;
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
	/*
	 * <!-- Start of user code comment for windMeasureMax getter
	 * End of user code -->
	 */
	public Double getWindMeasureMax(){
		return this.windMeasureMax;
	}
	
	/*
	 * <!-- Start of user code comment for windMeasureMax setter
	 * End of user code -->
	 */
	public void setWindMeasureMax(Double arg0){
		this.windMeasureMax = arg0;
	} 
	/*
	 * <!-- Start of user code comment for windMeasureMin getter
	 * End of user code -->
	 */
	public Double getWindMeasureMin(){
		return this.windMeasureMin;
	}
	
	/*
	 * <!-- Start of user code comment for windMeasureMin setter
	 * End of user code -->
	 */
	public void setWindMeasureMin(Double arg0){
		this.windMeasureMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
