package com.dooapp.firea.entity;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.dooapp.firea.wrapper.MainStep;
import com.dooapp.lib.common.entity.Bean;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MainStepBean
//Start of user code bloc for inheritance
 extends StepBean
//End of user code
//Start of user code bloc for interfaces
 implements Bean
//End of user code
{
	/**
	 * The logger
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	private static final Logger logger = LoggerFactory.getLogger(MainStepBean.class);

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double calculatedELA;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double cl;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double correlation;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private String direction;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private double n;

	/**
 	 * <!-- begin-user-doc -->
 	 * <!--  end-user-doc  -->
 	 * @generated
 	 */
	@javax.persistence.Transient
	private MainStep wrapper;
    	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public MainStep getWrapper() {
		if (wrapper == null) {
			wrapper = new MainStep(this);
		}
		return wrapper;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	@Override
	public boolean isWrapped() { 
		return wrapper != null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.persistence.Transient
	public void setWrapper(MainStep wrapper) {
		if (this.wrapper != null && this.wrapper != wrapper) {
			throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
		}
		this.wrapper = wrapper;
	}

	
	

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCalculatedELA(){
		return this.calculatedELA;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalculatedELA(double arg0){
		this.calculatedELA = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCl(){
		return this.cl;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCl(double arg0){
		this.cl = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCorrelation(){
		return this.correlation;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCorrelation(double arg0){
		this.correlation = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getDirection(){
		return this.direction;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(String arg0){
		this.direction = arg0;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getN(){
		return this.n;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setN(double arg0){
		this.n = arg0;
	}
    

}
