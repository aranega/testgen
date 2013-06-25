package com.dooapp.firea.wrapper;

import com.dooapp.firea.entity.EventStepBean;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.ObjectProperty;


import com.dooapp.firea.enumeration.Direction;
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
@BeanClass(EventStepBean.class)
public class EventStep
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
	private ObjectProperty<Direction> directionProperty;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public EventStep(EventStepBean entity) {
		super(entity);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public EventStepBean getBean() {
		return (EventStepBean)super.getBean();
	}

	/*
	 * Generated getters and setters
	 */
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ObjectProperty<Direction> directionProperty() {
		if (directionProperty == null) {
			directionProperty = createDirectionProperty();
			getBean().setDirection(getBean().getDirection());
			directionProperty.addListener(new ChangeListener<Direction>() {
				@Override
				public void changed(ObservableValue<? extends Direction> arg0, Direction arg1, Direction arg2) {
					getBean().setDirection(arg2);
				}
			});
		}
		return directionProperty;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected ObjectProperty<Direction> createDirectionProperty(){
		return  new SimpleObjectProperty<Direction>(getBean().getDirection());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Direction getDirection(){
		return directionProperty().get();
	} 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void setDirection(Direction myDirection){
		if (directionProperty == null) {
				getBean().setDirection(myDirection);
			} else {
				this.directionProperty().set(myDirection);
			}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirection(final Direction myDirection) {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
		} else {
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
				}
			});
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public void updateDirectionAndWait(final Direction myDirection) throws InterruptedException {
		if (javafx.application.Platform.isFxApplicationThread()) {
			setDirection(myDirection);
		} else {
			final Object mutex=new Object();
			javafx.application.Platform.runLater(new Runnable() {
				@Override
				public void run() {
					setDirection(myDirection);
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
		Element xmlElement = new Element("EventStep");
		if (this.getBean().getUUID() != null)
			xmlElement.setAttribute(new Attribute("uuid", this.getBean().getUUID()));
		if (getCreationDate() != null)
			xmlElement.setAttribute(new Attribute("creationDate", getCreationDate().toString()));
		if (getDate() != null)
			xmlElement.setAttribute(new Attribute("date", getDate().toString()));
		xmlElement.setAttribute(new Attribute("direction", String.valueOf(getDirection())));
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
		visitor.visitBeforeEventStep(this);
		
		this.visitInternal(visitor);
		
		visitor.visitAfterEventStep(this);
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
