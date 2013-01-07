package com.dooapp.firea.entity.criteria;

//com.dooapp.firea.entity.criteria

import com.dooapp.firea.wrapper.criteria.SampleCriteria;

//Start of user code for imports
// TODO: import me!
//End of user code

//
import com.dooapp.lib.common.entity.Bean;


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
	
	private Integer highUpMax;
	
	private Integer highUpMin;
	
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

	public SampleCriteria getWrapper() {
		if (wrapper == null) {
			wrapper = new SampleCriteria(this);
		}
		return wrapper;
	}
	
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	public void setWrapper(SampleCriteria wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	public com.dooapp.firea.entity.AirPressureCalculationMethod getAirPressureCalculationMethod(){
		return this.airPressureCalculationMethod;
	}
	
	public void setAirPressureCalculationMethod(com.dooapp.firea.entity.AirPressureCalculationMethod arg0){
		this.airPressureCalculationMethod = arg0;
	} 
	public Integer getAirPressureMax(){
		return this.airPressureMax;
	}
	
	public void setAirPressureMax(Integer arg0){
		this.airPressureMax = arg0;
	} 
	public Integer getAirPressureMin(){
		return this.airPressureMin;
	}
	
	public void setAirPressureMin(Integer arg0){
		this.airPressureMin = arg0;
	} 
	public com.dooapp.firea.entity.BeaufortScale getBeaufortScale(){
		return this.beaufortScale;
	}
	
	public void setBeaufortScale(com.dooapp.firea.entity.BeaufortScale arg0){
		this.beaufortScale = arg0;
	} 
	public java.util.Date getCreationDateMax(){
		return this.creationDateMax;
	}
	
	public void setCreationDateMax(java.util.Date arg0){
		this.creationDateMax = arg0;
	} 
	public java.util.Date getCreationDateMin(){
		return this.creationDateMin;
	}
	
	public void setCreationDateMin(java.util.Date arg0){
		this.creationDateMin = arg0;
	} 
	public java.util.Date getDateMax(){
		return this.dateMax;
	}
	
	public void setDateMax(java.util.Date arg0){
		this.dateMax = arg0;
	} 
	public java.util.Date getDateMin(){
		return this.dateMin;
	}
	
	public void setDateMin(java.util.Date arg0){
		this.dateMin = arg0;
	} 
	public Integer getHighUpMax(){
		return this.highUpMax;
	}
	
	public void setHighUpMax(Integer arg0){
		this.highUpMax = arg0;
	} 
	public Integer getHighUpMin(){
		return this.highUpMin;
	}
	
	public void setHighUpMin(Integer arg0){
		this.highUpMin = arg0;
	} 
	public Long getIdMax(){
		return this.idMax;
	}
	
	public void setIdMax(Long arg0){
		this.idMax = arg0;
	} 
	public Long getIdMin(){
		return this.idMin;
	}
	
	public void setIdMin(Long arg0){
		this.idMin = arg0;
	} 
	public String getName(){
		return this.name;
	}
	
	public void setName(String arg0){
		this.name = arg0;
	} 
	public Double getPhiEPercentMax(){
		return this.phiEPercentMax;
	}
	
	public void setPhiEPercentMax(Double arg0){
		this.phiEPercentMax = arg0;
	} 
	public Double getPhiEPercentMin(){
		return this.phiEPercentMin;
	}
	
	public void setPhiEPercentMin(Double arg0){
		this.phiEPercentMin = arg0;
	} 
	public Double getPhiIPercentMax(){
		return this.phiIPercentMax;
	}
	
	public void setPhiIPercentMax(Double arg0){
		this.phiIPercentMax = arg0;
	} 
	public Double getPhiIPercentMin(){
		return this.phiIPercentMin;
	}
	
	public void setPhiIPercentMin(Double arg0){
		this.phiIPercentMin = arg0;
	} 
	public Double getRoEMax(){
		return this.roEMax;
	}
	
	public void setRoEMax(Double arg0){
		this.roEMax = arg0;
	} 
	public Double getRoEMin(){
		return this.roEMin;
	}
	
	public void setRoEMin(Double arg0){
		this.roEMin = arg0;
	} 
	public Double getRoIMax(){
		return this.roIMax;
	}
	
	public void setRoIMax(Double arg0){
		this.roIMax = arg0;
	} 
	public Double getRoIMin(){
		return this.roIMin;
	}
	
	public void setRoIMin(Double arg0){
		this.roIMin = arg0;
	} 
	public com.dooapp.firea.entity.SampleStatus getStatus(){
		return this.status;
	}
	
	public void setStatus(com.dooapp.firea.entity.SampleStatus arg0){
		this.status = arg0;
	} 
	public Double getTetaEMax(){
		return this.tetaEMax;
	}
	
	public void setTetaEMax(Double arg0){
		this.tetaEMax = arg0;
	} 
	public Double getTetaEMin(){
		return this.tetaEMin;
	}
	
	public void setTetaEMin(Double arg0){
		this.tetaEMin = arg0;
	} 
	public Double getTetaIMax(){
		return this.tetaIMax;
	}
	
	public void setTetaIMax(Double arg0){
		this.tetaIMax = arg0;
	} 
	public Double getTetaIMin(){
		return this.tetaIMin;
	}
	
	public void setTetaIMin(Double arg0){
		this.tetaIMin = arg0;
	} 
	public java.util.Date getUpdateDateMax(){
		return this.updateDateMax;
	}
	
	public void setUpdateDateMax(java.util.Date arg0){
		this.updateDateMax = arg0;
	} 
	public java.util.Date getUpdateDateMin(){
		return this.updateDateMin;
	}
	
	public void setUpdateDateMin(java.util.Date arg0){
		this.updateDateMin = arg0;
	} 
	public Integer getVersion(){
		return this.version;
	}
	
	public void setVersion(Integer arg0){
		this.version = arg0;
	} 
	public Double getWindMeasureMax(){
		return this.windMeasureMax;
	}
	
	public void setWindMeasureMax(Double arg0){
		this.windMeasureMax = arg0;
	} 
	public Double getWindMeasureMin(){
		return this.windMeasureMin;
	}
	
	public void setWindMeasureMin(Double arg0){
		this.windMeasureMin = arg0;
	} 
    


	//Start of user code for methods
	// Other methods
	//End of user code

}
