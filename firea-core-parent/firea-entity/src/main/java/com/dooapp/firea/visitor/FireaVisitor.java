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
public interface FireaVisitor
{
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeDevice(Device device);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterDevice(Device device);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeProject(Project project);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterProject(Project project);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePersistentImageData(PersistentImageData persistentimagedata);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPersistentImageData(PersistentImageData persistentimagedata);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeRisque(Risque risque);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterRisque(Risque risque);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGaz(Gaz gaz);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGaz(Gaz gaz);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBlowHole(BlowHole blowhole);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBlowHole(BlowHole blowhole);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeFolder(Folder folder);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterFolder(Folder folder);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePersistentImage(PersistentImage persistentimage);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPersistentImage(PersistentImage persistentimage);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeMainStep(MainStep mainstep);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterMainStep(MainStep mainstep);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBottleConfiguration(BottleConfiguration bottleconfiguration);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBottleConfiguration(BottleConfiguration bottleconfiguration);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeContact(Contact contact);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterContact(Contact contact);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeBottleType(BottleType bottletype);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterBottleType(BottleType bottletype);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeReading(Reading reading);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterReading(Reading reading);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGaugeMode(GaugeMode gaugemode);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGaugeMode(GaugeMode gaugemode);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeEventStep(EventStep eventstep);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterEventStep(EventStep eventstep);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforePoint(Point point);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterPoint(Point point);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeSample(Sample sample);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterSample(Sample sample);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeCalibrationStep(CalibrationStep calibrationstep);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterCalibrationStep(CalibrationStep calibrationstep);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeStep(Step step);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterStep(Step step);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeGazConfiguration(GazConfiguration gazconfiguration);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterGazConfiguration(GazConfiguration gazconfiguration);

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitBeforeTestedRoom(TestedRoom testedroom);
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public void visitAfterTestedRoom(TestedRoom testedroom);

}
