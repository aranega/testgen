package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.StaticStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;




import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class StaticStep
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
	
	private DoubleProperty deltaPProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final StaticStepBean staticStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStep(){
		this(new StaticStepBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStep(StaticStepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.staticStep = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepBean getStaticStepBean(){
		return this.staticStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StaticStepBean getBean() {
		return  this.staticStep;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty deltaPProperty(){
		if (this.deltaPProperty == null) {
			this.deltaPProperty = new SimpleDoubleProperty(staticStep.getDeltaP());
			this.deltaPProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					staticStep.setDeltaP((Double) arg2);
				}
			});
		}
		return this.deltaPProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getDeltaP(){
		return deltaPProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDeltaP(double myDeltaP){
		this.deltaPProperty().set(myDeltaP);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDeltaP(final double myDeltaP, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDeltaP(myDeltaP);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDeltaP(myDeltaP);
					if (mutex != null) {
						mutex.notify();
					}
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDeltaP(final double myDeltaP) {
		updateDeltaP(myDeltaP, null);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getStaticStepBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("StaticStep");
		xmlElement.setAttribute(new Attribute("status", String.valueOf(getStatus())));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		xmlElement.setAttribute(new Attribute("deltaP", String.valueOf(getDeltaP())));
		
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

}
