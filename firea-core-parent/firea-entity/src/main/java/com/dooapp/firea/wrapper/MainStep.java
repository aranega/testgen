package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.MainStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;




import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.Attribute;
import org.jdom2.Element;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class MainStep
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
	
	private DoubleProperty calculatedELAProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty clProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty correlationProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private StringProperty directionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	
	private DoubleProperty nProperty;

	/**
	 * Handled Entity
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	private final MainStepBean mainStep;

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStep(){
		this(new MainStepBean());	
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStep(MainStepBean entity) {
		if (entity == null) {
			throw new NullPointerException("Unable to create a wrapper with a null bean");
		}
		if (entity.isWrapped()) {
			if (entity.getWrapper() != this) {
				throw new RuntimeException("A bean can only have one wrapper, use #getWrapper instead");
			}
		}
		entity.setWrapper(this);
		this.mainStep = entity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStepBean getMainStepBean(){
		return this.mainStep;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public MainStepBean getBean() {
		return  this.mainStep;
	}
	

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty calculatedELAProperty(){
		if (this.calculatedELAProperty == null) {
			this.calculatedELAProperty = new SimpleDoubleProperty(mainStep.getCalculatedELA());
			this.calculatedELAProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCalculatedELA((Double) arg2);
				}
			});
		}
		return this.calculatedELAProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCalculatedELA(){
		return calculatedELAProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCalculatedELA(double myCalculatedELA){
		this.calculatedELAProperty().set(myCalculatedELA);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCalculatedELA(final double myCalculatedELA, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCalculatedELA(myCalculatedELA);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCalculatedELA(myCalculatedELA);
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
	public void updateCalculatedELA(final double myCalculatedELA) {
		updateCalculatedELA(myCalculatedELA, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty clProperty(){
		if (this.clProperty == null) {
			this.clProperty = new SimpleDoubleProperty(mainStep.getCl());
			this.clProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCl((Double) arg2);
				}
			});
		}
		return this.clProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCl(){
		return clProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCl(double myCl){
		this.clProperty().set(myCl);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCl(final double myCl, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCl(myCl);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCl(myCl);
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
	public void updateCl(final double myCl) {
		updateCl(myCl, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty correlationProperty(){
		if (this.correlationProperty == null) {
			this.correlationProperty = new SimpleDoubleProperty(mainStep.getCorrelation());
			this.correlationProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setCorrelation((Double) arg2);
				}
			});
		}
		return this.correlationProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getCorrelation(){
		return correlationProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setCorrelation(double myCorrelation){
		this.correlationProperty().set(myCorrelation);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateCorrelation(final double myCorrelation, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setCorrelation(myCorrelation);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setCorrelation(myCorrelation);
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
	public void updateCorrelation(final double myCorrelation) {
		updateCorrelation(myCorrelation, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public StringProperty directionProperty(){
		if (this.directionProperty == null) {
			this.directionProperty = new SimpleStringProperty(mainStep.getDirection());
			this.directionProperty.addListener(new ChangeListener<String>() {
				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					mainStep.setDirection((String) arg2);
				}
			});
		}
		return this.directionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public String getDirection(){
		return directionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(String myDirection){
		this.directionProperty().set(myDirection);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final String myDirection, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
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
	public void updateDirection(final String myDirection) {
		updateDirection(myDirection, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public DoubleProperty nProperty(){
		if (this.nProperty == null) {
			this.nProperty = new SimpleDoubleProperty(mainStep.getN());
			this.nProperty.addListener(new ChangeListener<Number>() {
				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
					mainStep.setN((Double) arg2);
				}
			});
		}
		return this.nProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public double getN(){
		return nProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setN(double myN){
		this.nProperty().set(myN);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateN(final double myN, final Object mutex) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setN(myN);
			if (mutex != null) {
				mutex.notify();
			}
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setN(myN);
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
	public void updateN(final double myN) {
		updateN(myN, null);
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	public String toXML(){
		XMLOutputter serializer = new XMLOutputter();
		serializer.setFormat(Format.getPrettyFormat());
		return getMainStepBean() != null ? serializer.outputString(this.toDomXML()) : "";
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Element toDomXML(){
		Element xmlElement = new Element("MainStep");
		xmlElement.setAttribute(new Attribute("status", String.valueOf(getStatus())));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("id", String.valueOf(getId())));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getUpdateDate() != null)
			xmlElement.setAttribute(new Attribute("updateDate", getUpdateDate().toString()));
		xmlElement.setAttribute(new Attribute("version", String.valueOf(getVersion())));
		if (getDirection() != null)
			xmlElement.setAttribute(new Attribute("direction", getDirection()));
		xmlElement.setAttribute(new Attribute("correlation", String.valueOf(getCorrelation())));
		xmlElement.setAttribute(new Attribute("calculatedELA", String.valueOf(getCalculatedELA())));
		xmlElement.setAttribute(new Attribute("cl", String.valueOf(getCl())));
		xmlElement.setAttribute(new Attribute("n", String.valueOf(getN())));
		
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
