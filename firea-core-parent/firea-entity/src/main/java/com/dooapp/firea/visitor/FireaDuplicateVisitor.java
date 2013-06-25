package com.dooapp.firea.visitor;

import com.dooapp.firea.wrapper.Device;
import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.PersistentImageData;
import com.dooapp.firea.wrapper.Risque;
import com.dooapp.firea.wrapper.Gaz;
import com.dooapp.firea.wrapper.BlowHole;
import com.dooapp.firea.wrapper.Folder;
import com.dooapp.firea.wrapper.PersistentImage;
import com.dooapp.firea.wrapper.MainStep;
import com.dooapp.firea.wrapper.BottleConfiguration;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.BottleType;
import com.dooapp.firea.wrapper.Reading;
import com.dooapp.firea.wrapper.GaugeMode;
import com.dooapp.firea.wrapper.EventStep;
import com.dooapp.firea.wrapper.Point;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.wrapper.CalibrationStep;
import com.dooapp.firea.wrapper.Step;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.TestedRoom;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class FireaDuplicateVisitor implements FireaVisitor
{
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeDevice(Device device) {
	device.getBean().updateUUID();
	device.getBean().setId(0);
	device.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterDevice(Device device) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeProject(Project project) {
	project.getBean().updateUUID();
	project.getBean().setId(0);
	project.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterProject(Project project) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePersistentImageData(PersistentImageData persistentimagedata) {
	persistentimagedata.getBean().updateUUID();
	persistentimagedata.getBean().setId(0);
	persistentimagedata.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPersistentImageData(PersistentImageData persistentimagedata) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeRisque(Risque risque) {
	risque.getBean().updateUUID();
	risque.getBean().setId(0);
	risque.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterRisque(Risque risque) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGaz(Gaz gaz) {
	gaz.getBean().updateUUID();
	gaz.getBean().setId(0);
	gaz.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGaz(Gaz gaz) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBlowHole(BlowHole blowhole) {
	blowhole.getBean().updateUUID();
	blowhole.getBean().setId(0);
	blowhole.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBlowHole(BlowHole blowhole) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeFolder(Folder folder) {
	folder.getBean().updateUUID();
	folder.getBean().setId(0);
	folder.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterFolder(Folder folder) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePersistentImage(PersistentImage persistentimage) {
	persistentimage.getBean().updateUUID();
	persistentimage.getBean().setId(0);
	persistentimage.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPersistentImage(PersistentImage persistentimage) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeMainStep(MainStep mainstep) {
	mainstep.getBean().updateUUID();
	mainstep.getBean().setId(0);
	mainstep.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterMainStep(MainStep mainstep) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBottleConfiguration(BottleConfiguration bottleconfiguration) {
	bottleconfiguration.getBean().updateUUID();
	bottleconfiguration.getBean().setId(0);
	bottleconfiguration.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBottleConfiguration(BottleConfiguration bottleconfiguration) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeContact(Contact contact) {
	contact.getBean().updateUUID();
	contact.getBean().setId(0);
	contact.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterContact(Contact contact) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBottleType(BottleType bottletype) {
	bottletype.getBean().updateUUID();
	bottletype.getBean().setId(0);
	bottletype.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBottleType(BottleType bottletype) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeReading(Reading reading) {
	reading.getBean().updateUUID();
	reading.getBean().setId(0);
	reading.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterReading(Reading reading) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGaugeMode(GaugeMode gaugemode) {
	gaugemode.getBean().updateUUID();
	gaugemode.getBean().setId(0);
	gaugemode.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGaugeMode(GaugeMode gaugemode) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeEventStep(EventStep eventstep) {
	eventstep.getBean().updateUUID();
	eventstep.getBean().setId(0);
	eventstep.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterEventStep(EventStep eventstep) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePoint(Point point) {
	point.getBean().updateUUID();
	point.getBean().setId(0);
	point.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPoint(Point point) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeSample(Sample sample) {
	sample.getBean().updateUUID();
	sample.getBean().setId(0);
	sample.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterSample(Sample sample) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeCalibrationStep(CalibrationStep calibrationstep) {
	calibrationstep.getBean().updateUUID();
	calibrationstep.getBean().setId(0);
	calibrationstep.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterCalibrationStep(CalibrationStep calibrationstep) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeStep(Step step) {
	step.getBean().updateUUID();
	step.getBean().setId(0);
	step.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterStep(Step step) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGazConfiguration(GazConfiguration gazconfiguration) {
	gazconfiguration.getBean().updateUUID();
	gazconfiguration.getBean().setId(0);
	gazconfiguration.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGazConfiguration(GazConfiguration gazconfiguration) {
	// TODO : check other associations
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeTestedRoom(TestedRoom testedroom) {
	testedroom.getBean().updateUUID();
	testedroom.getBean().setId(0);
	testedroom.getBean().setVersion(0);
}

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterTestedRoom(TestedRoom testedroom) {
	// TODO : check other associations
}

}
