package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.CalibrationStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;


import com.dooapp.firea.enumeration.StepStatus;


import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

import com.dooapp.lib.common.entity.BeanClass;

import com.dooapp.firea.visitor.FireaVisitor;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
@BeanClass(CalibrationStepBean.class)
public class CalibrationStep
// Start of user code bloc for inheritance
 extends Step
// End of user code
// Start of user code bloc for interface
 implements com.dooapp.lib.common.entity.Wrapper
// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty afterHoleELAProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty beforeHoleELAProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private DoubleProperty errorPercentProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStep(CalibrationStepBean entity) {
		super(entity);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CalibrationStepBean getBean() {
		return (CalibrationStepBean)super.getBean();
	}

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty afterHoleELAProperty(){
		if (this.afterHoleELAProperty == null) {
			this.afterHoleELAProperty = createAfterHoleELAProperty();
			getBean().setAfterHoleELA(getBean().getAfterHoleELA());
			this.afterHoleELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setAfterHoleELA((Double) arg2);
				}
			});
		}
		return this.afterHoleELAProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createAfterHoleELAProperty(){
		return new SimpleDoubleProperty(getBean().getAfterHoleELA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getAfterHoleELA(){
		return afterHoleELAProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setAfterHoleELA(double myAfterHoleELA){
		this.afterHoleELAProperty().set(myAfterHoleELA);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELA(final Double myAfterHoleELA) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELA(myAfterHoleELA);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELA(myAfterHoleELA);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateAfterHoleELAAndWait(final Double myAfterHoleELA) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setAfterHoleELA(myAfterHoleELA);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setAfterHoleELA(myAfterHoleELA);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty beforeHoleELAProperty(){
		if (this.beforeHoleELAProperty == null) {
			this.beforeHoleELAProperty = createBeforeHoleELAProperty();
			getBean().setBeforeHoleELA(getBean().getBeforeHoleELA());
			this.beforeHoleELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setBeforeHoleELA((Double) arg2);
				}
			});
		}
		return this.beforeHoleELAProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createBeforeHoleELAProperty(){
		return new SimpleDoubleProperty(getBean().getBeforeHoleELA());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getBeforeHoleELA(){
		return beforeHoleELAProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setBeforeHoleELA(double myBeforeHoleELA){
		this.beforeHoleELAProperty().set(myBeforeHoleELA);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELA(final Double myBeforeHoleELA) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELA(myBeforeHoleELA);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELA(myBeforeHoleELA);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateBeforeHoleELAAndWait(final Double myBeforeHoleELA) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setBeforeHoleELA(myBeforeHoleELA);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setBeforeHoleELA(myBeforeHoleELA);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty errorPercentProperty(){
		if (this.errorPercentProperty == null) {
			this.errorPercentProperty = createErrorPercentProperty();
			getBean().setErrorPercent(getBean().getErrorPercent());
			this.errorPercentProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					getBean().setErrorPercent((Double) arg2);
				}
			});
		}
		return this.errorPercentProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected DoubleProperty createErrorPercentProperty(){
		return new SimpleDoubleProperty(getBean().getErrorPercent());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getErrorPercent(){
		return errorPercentProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setErrorPercent(double myErrorPercent){
		this.errorPercentProperty().set(myErrorPercent);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercent(final Double myErrorPercent) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercent(myErrorPercent);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercent(myErrorPercent);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateErrorPercentAndWait(final Double myErrorPercent) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setErrorPercent(myErrorPercent);
		} else {
			final Object mutex = new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setErrorPercent(myErrorPercent);
					synchronized(mutex){ mutex.notify(); }
				}
			});
			synchronized(mutex){ mutex.wait(); }
		}
	}


	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Element toDomXML(){
		Element xmlElement = new Element("CalibrationStep");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		xmlElement.setAttribute(new Attribute("afterHoleELA", String.valueOf(getAfterHoleELA())));
		xmlElement.setAttribute(new Attribute("beforeHoleELA", String.valueOf(getBeforeHoleELA())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("errorPercent", String.valueOf(getErrorPercent())));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		xmlElement.setAttribute(new Attribute("status", String.valueOf(getStatus())));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		
		if (!getPoints().isEmpty()) {
			Element points = new Element("points");
			for (Point tmp : getPoints())
				points.addContent(new Element("Point", String.valueOf(tmp.getId())));
			xmlElement.addContent(points);
		}
		if (getSample() != null)
			xmlElement.setAttribute("sample", String.valueOf(getSample().getId()));
		
		
		// For custom purposes
		xmlElement = this.customDomXML(xmlElement);
		
		return xmlElement;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element customDomXML(Element e) {
		return e;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public void accept(FireaVisitor visitor) {
		visitor.visitBeforeCalibrationStep(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterCalibrationStep(this);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	protected void visitInternal(FireaVisitor visitor)
	{
		super.accept(visitor);
		
	}

}
