/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Delete: Entry NO_STARTED in StepStatus (nothing to do)
		Delete: Table Device
		Delete: Entry NFPA_2000 in ProjectKind (nothing to do)
		Delete: FK bottleconfiguration in BottleType
		Delete: Column choosenProtectedHeight in TestedRoom
		Delete: FK gazconfiguration in BottleConfiguration
		Delete: Column unloadTime in TestedRoom
		Delete: FK sample in Step
		Delete: Column timeAverage in Reading
		Delete: Entry FORCE2 in BeaufortScale (nothing to do)
		Delete: Table Point
		Delete: Table Contact
		Delete: Entry WEIGHT in BottleUnit (nothing to do)
		Delete: Entry TECHNICIAN in ContactKind (nothing to do)
		Delete: Column type in Gaz
		Delete: Column lowFlow in Reading
		Delete: Column climDuct in TestedRoom
		Delete: Column clapetsCF in TestedRoom
		Delete: Column climWithNewAir in TestedRoom
		Delete: Entry PRESSURE in Direction (nothing to do)
		Delete: Entry FORCE0 in BeaufortScale (nothing to do)
		Delete: Column leekRepartitionPercent in GazConfiguration
		Delete: Column correlation in MainStep
		Delete: Entry ERROR in SampleStatus (nothing to do)
		Delete: Table CalibrationStep
		Delete: Entry FIRM_MOE in ContactKind (nothing to do)
		Delete: Entry R13_APSAD in ProjectKind (nothing to do)
		Delete: Column climWithNewAirAuto in TestedRoom
		Delete: Table EventStep
		Delete: Column description in Project
		Delete: Column weight in BottleType
		Delete: Column windMeasure in Sample
		Delete: Entry FORCE6 in BeaufortScale (nothing to do)
		Delete: Table BeaufortScale (nothing to do)
		Delete: FK project in GazConfiguration
		Delete: Entry DONE in StepStatus (nothing to do)
		Delete: Column indicatedVolume in TestedRoom
		Delete: Entry FORCE4 in BeaufortScale (nothing to do)
		Delete: Entry Negative in Discharge (nothing to do)
		Delete: Column droppedFloorFull in GazConfiguration
		Delete: Column date in Sample
		Delete: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Delete: Column sourceFile in PersistentImage
		Delete: Column beaufortScale in Sample
		Delete: Table TestedRoom
		Delete: FK testedroom in BlowHole
		Delete: Column altitude in TestedRoom
		Delete: FK contact in PersistentImage
		Delete: Column uniformHorizontality in TestedRoom
		Delete: Entry MIXED in GazWeight (nothing to do)
		Delete: Column dataId in PersistentImage
		Delete: FK point in Reading
		Delete: Table Folder
		Delete: Column errorPercent in CalibrationStep
		Delete: Column retentionInterface in GazConfiguration
		Delete: Column name in GaugeMode
		Delete: Table ContactKind (nothing to do)
		Delete: Column volume in BottleType
		Delete: Entry LIGHT in GazWeight (nothing to do)
		Delete: Column lastCalibrationDate in Device
		Delete: Entry HEAVY in GazWeight (nothing to do)
		Delete: Entry DONE in SampleStatus (nothing to do)
		Delete: Entry DEPRESSURE in Direction (nothing to do)
		Delete: Column displayOrder in Folder
		Delete: Column beforeHoleELA in CalibrationStep
		Delete: FK gaz in GazConfiguration
		Delete: FK points in Step
		Delete: FK bottletype in BottleConfiguration
		Delete: Entry NO_STARTED in SampleStatus (nothing to do)
		Delete: Column airPressure in Sample
		Delete: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Delete: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Delete: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Delete: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Delete: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Delete: Column n in MainStep
		Delete: Entry FORCE1 in BeaufortScale (nothing to do)
		Delete: FK gaugemode in Reading
		Delete: Column Discharge in BlowHole
		Delete: Table Direction (nothing to do)
		Delete: Entry STARTED in SampleStatus (nothing to do)
		Delete: Column zipCode in Contact
		Delete: Table BlowHole
		Delete: Column direction in MainStep
		Delete: Column afterHoleELA in CalibrationStep
		Delete: FK project in Sample
		Delete: Column pressureGoal in Point
		Delete: FK image in Contact
		Delete: Column retentionGoal in GazConfiguration
		Delete: FK risque in Project
		Delete: Column gaugeType in GaugeMode
		Delete: Column climVMCAuto in TestedRoom
		Delete: Column surface in BlowHole
		Delete: Column key in Risque
		Delete: Entry IN_PROGRESS in StepStatus (nothing to do)
		Delete: Table Gaz
		Delete: FK contacts in Project
		Delete: Table GazWeight (nothing to do)
		Delete: Column quantity in BlowHole
		Delete: Column adress1 in Contact
		Delete: Entry FORCE7 in BeaufortScale (nothing to do)
		Delete: FK blowholes in TestedRoom
		Delete: Column calculatedELA in MainStep
		Delete: Column buildingPressure in Reading
		Delete: Column tetaE in Sample
		Delete: Column date in Step
		Delete: Column data in PersistentImageData
		Delete: Column cl in MainStep
		Delete: Column address2 in Contact
		Delete: Column name in Sample
		Delete: Table BottleType
		Delete: Column person in Contact
		Delete: Column kind in Project
		Delete: Table Reading
		Delete: Column preview in PersistentImage
		Delete: Column roI in Sample
		Delete: FK readings in Point
		Delete: Table Discharge (nothing to do)
		Delete: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Delete: Table Risque
		Delete: Entry FORCE3 in BeaufortScale (nothing to do)
		Delete: FK device in Reading
		Delete: Column quantity in BottleConfiguration
		Delete: Column tetaI in Sample
		Delete: Table AirPressureCalculationMethod (nothing to do)
		Delete: Column climReclycleAuto in TestedRoom
		Delete: Column slowUnloadingValue in GazConfiguration
		Delete: Table Project
		Delete: Column mecanicalStrength in TestedRoom
		Delete: Column direction in EventStep
		Delete: Table GaugeMode
		Delete: FK bottleconfigurations in GazConfiguration
		Delete: Column climVMC in TestedRoom
		Delete: Column name in Project
		Delete: Column droppedFloor in TestedRoom
		Delete: Column risqueHeight in TestedRoom
		Delete: Column weight in Gaz
		Delete: Column measuredVolume in TestedRoom
		Delete: Entry VOLUME in BottleUnit (nothing to do)
		Delete: Column slowUnloading in GazConfiguration
		Delete: Column name in BottleType
		Delete: FK sample in Project
		Delete: Column phiEPercent in Sample
		Delete: Entry FORCE5 in BeaufortScale (nothing to do)
		Delete: Column CommissioningDate in TestedRoom
		Delete: Column minimalProtectedHeight in TestedRoom
		Delete: FK step in Point
		Delete: Table Step
		Delete: Table GazConfiguration
		Delete: Column mainHeight in TestedRoom
		Delete: Entry TO_PLAN in ProjectStatus (nothing to do)
		Delete: Column droppedCeilFull in GazConfiguration
		Delete: Table Sample
		Delete: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Delete: Column city in Contact
		Delete: Column netVolume in TestedRoom
		Delete: Column phiIPercent in Sample
		Delete: Column totalHeight in TestedRoom
		Delete: Table StepStatus (nothing to do)
		Delete: Entry READY in StepStatus (nothing to do)
		Delete: FK image in Project
		Delete: Column Status in Project
		Delete: Column droppedCeiling in TestedRoom
		Delete: Entry DONE in ProjectStatus (nothing to do)
		Delete: Column name in Folder
		Delete: Column status in Step
		Delete: Column fanPressure in Reading
		Delete: Column status in Sample
		Delete: FK step in Sample
		Delete: Column name in TestedRoom
		Delete: Column airPressureCalculationMethod in Sample
		Delete: Table BottleConfiguration
		Delete: Entry NFPA_2008 in ProjectKind (nothing to do)
		Delete: Table BottleUnit (nothing to do)
		Delete: Table SampleStatus (nothing to do)
		Delete: Column email in Contact
		Delete: Column kind in Contact
		Delete: Column title in PersistentImage
		Delete: Entry ERROR in StepStatus (nothing to do)
		Delete: Column serialNumber in Device
		Delete: Column climReclycle in TestedRoom
		Delete: Table ProjectStatus (nothing to do)
		Delete: Table ProjectKind (nothing to do)
		Delete: Table PersistentImage
		Delete: Column siret in Contact
		Delete: Entry Positive in Discharge (nothing to do)
		Delete: Column roE in Sample
		Delete: Column risqueHeightPercent in TestedRoom
		Delete: Table PersistentImageData
		Delete: FK gazconfiguration in Gaz
		Delete: Column volumeCorrection in TestedRoom
		Delete: Entry FORCE9 in BeaufortScale (nothing to do)
		Delete: Column name in Gaz
		Delete: Column error in PersistentImage
		Delete: Column name in Contact
		Delete: FK bottletypes in Gaz
		Delete: Column phone in Contact
		Delete: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Delete: Table MainStep
		Delete: Column load in BottleConfiguration
		Delete: Column unit in BottleConfiguration
		Delete: Entry FORCE8 in BeaufortScale (nothing to do)
		Delete: Column density in Gaz
		Delete: FK gazconfiguration in Project
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358234917982__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	


		
		
		/**
		 * Delete: FK bottleconfiguration in BottleType
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean DROP CONSTRAINT IF EXISTS bottleconfiguration;");
		/**
		 * Delete: Column choosenProtectedHeight in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS choosenProtectedHeight;");
		/**
		 * Delete: FK gazconfiguration in BottleConfiguration
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean DROP CONSTRAINT IF EXISTS gazconfiguration;");
		/**
		 * Delete: Column unloadTime in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS unloadTime;");
		/**
		 * Delete: FK sample in Step
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean DROP CONSTRAINT IF EXISTS sample;");
		/**
		 * Delete: Column timeAverage in Reading
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP COLUMN IF EXISTS timeAverage;");
		
		
		
		/**
		 * Delete: Column type in Gaz
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP COLUMN IF EXISTS type;");
		/**
		 * Delete: Column lowFlow in Reading
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP COLUMN IF EXISTS lowFlow;");
		/**
		 * Delete: Column climDuct in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climDuct;");
		/**
		 * Delete: Column clapetsCF in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS clapetsCF;");
		/**
		 * Delete: Column climWithNewAir in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climWithNewAir;");
		
		
		/**
		 * Delete: Column leekRepartitionPercent in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS leekRepartitionPercent;");
		/**
		 * Delete: Column correlation in MainStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean DROP COLUMN IF EXISTS correlation;");
		
		
		
		/**
		 * Delete: Column climWithNewAirAuto in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climWithNewAirAuto;");
		/**
		 * Delete: Column description in Project
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP COLUMN IF EXISTS description;");
		/**
		 * Delete: Column weight in BottleType
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean DROP COLUMN IF EXISTS weight;");
		/**
		 * Delete: Column windMeasure in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS windMeasure;");
		
		/**
		 * Delete: FK project in GazConfiguration
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP CONSTRAINT IF EXISTS project;");
		
		/**
		 * Delete: Column indicatedVolume in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS indicatedVolume;");
		
		
		/**
		 * Delete: Column droppedFloorFull in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS droppedFloorFull;");
		/**
		 * Delete: Column date in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS date;");
		
		/**
		 * Delete: Column sourceFile in PersistentImage
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP COLUMN IF EXISTS sourceFile;");
		/**
		 * Delete: Column beaufortScale in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS beaufortScale;");
		/**
		 * Delete: FK testedroom in BlowHole
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean DROP CONSTRAINT IF EXISTS testedroom;");
		/**
		 * Delete: Column altitude in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS altitude;");
		/**
		 * Delete: FK contact in PersistentImage
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP CONSTRAINT IF EXISTS contact;");
		/**
		 * Delete: Column uniformHorizontality in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS uniformHorizontality;");
		
		/**
		 * Delete: Column dataId in PersistentImage
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP COLUMN IF EXISTS dataId;");
		/**
		 * Delete: FK point in Reading
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP CONSTRAINT IF EXISTS point;");
		/**
		 * Delete: Column errorPercent in CalibrationStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean DROP COLUMN IF EXISTS errorPercent;");
		/**
		 * Delete: Column retentionInterface in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS retentionInterface;");
		/**
		 * Delete: Column name in GaugeMode
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column volume in BottleType
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean DROP COLUMN IF EXISTS volume;");
		
		/**
		 * Delete: Column lastCalibrationDate in Device
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean DROP COLUMN IF EXISTS lastCalibrationDate;");
		
		
		
		/**
		 * Delete: Column displayOrder in Folder
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean DROP COLUMN IF EXISTS displayOrder;");
		/**
		 * Delete: Column beforeHoleELA in CalibrationStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean DROP COLUMN IF EXISTS beforeHoleELA;");
		/**
		 * Delete: FK gaz in GazConfiguration
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP CONSTRAINT IF EXISTS gaz;");
		/**
		 * Delete: FK points in Step
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean DROP CONSTRAINT IF EXISTS points;");
		/**
		 * Delete: FK bottletype in BottleConfiguration
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean DROP CONSTRAINT IF EXISTS bottletype;");
		
		/**
		 * Delete: Column airPressure in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS airPressure;");
		
		
		
		
		
		/**
		 * Delete: Column n in MainStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean DROP COLUMN IF EXISTS n;");
		
		/**
		 * Delete: FK gaugemode in Reading
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP CONSTRAINT IF EXISTS gaugemode;");
		/**
		 * Delete: Column Discharge in BlowHole
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean DROP COLUMN IF EXISTS Discharge;");
		
		/**
		 * Delete: Column zipCode in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS zipCode;");
		/**
		 * Delete: Column direction in MainStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean DROP COLUMN IF EXISTS direction;");
		/**
		 * Delete: Column afterHoleELA in CalibrationStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean DROP COLUMN IF EXISTS afterHoleELA;");
		/**
		 * Delete: FK project in Sample
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP CONSTRAINT IF EXISTS project;");
		/**
		 * Delete: Column pressureGoal in Point
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean DROP COLUMN IF EXISTS pressureGoal;");
		/**
		 * Delete: FK image in Contact
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP CONSTRAINT IF EXISTS image;");
		/**
		 * Delete: Column retentionGoal in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS retentionGoal;");
		/**
		 * Delete: FK risque in Project
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP CONSTRAINT IF EXISTS risque;");
		/**
		 * Delete: Column gaugeType in GaugeMode
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean DROP COLUMN IF EXISTS gaugeType;");
		/**
		 * Delete: Column climVMCAuto in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climVMCAuto;");
		/**
		 * Delete: Column surface in BlowHole
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean DROP COLUMN IF EXISTS surface;");
		/**
		 * Delete: Column key in Risque
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean DROP COLUMN IF EXISTS key;");
		
		/**
		 * Delete: FK contacts in Project
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP CONSTRAINT IF EXISTS contacts;");
		/**
		 * Delete: Column quantity in BlowHole
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean DROP COLUMN IF EXISTS quantity;");
		/**
		 * Delete: Column adress1 in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS adress1;");
		
		/**
		 * Delete: FK blowholes in TestedRoom
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP CONSTRAINT IF EXISTS blowholes;");
		/**
		 * Delete: Column calculatedELA in MainStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean DROP COLUMN IF EXISTS calculatedELA;");
		/**
		 * Delete: Column buildingPressure in Reading
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP COLUMN IF EXISTS buildingPressure;");
		/**
		 * Delete: Column tetaE in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS tetaE;");
		/**
		 * Delete: Column date in Step
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean DROP COLUMN IF EXISTS date;");
		/**
		 * Delete: Column data in PersistentImageData
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean DROP COLUMN IF EXISTS data;");
		/**
		 * Delete: Column cl in MainStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean DROP COLUMN IF EXISTS cl;");
		/**
		 * Delete: Column address2 in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS address2;");
		/**
		 * Delete: Column name in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column person in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS person;");
		/**
		 * Delete: Column kind in Project
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP COLUMN IF EXISTS kind;");
		/**
		 * Delete: Column preview in PersistentImage
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP COLUMN IF EXISTS preview;");
		/**
		 * Delete: Column roI in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS roI;");
		/**
		 * Delete: FK readings in Point
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean DROP CONSTRAINT IF EXISTS readings;");
		
		
		/**
		 * Delete: FK device in Reading
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP CONSTRAINT IF EXISTS device;");
		/**
		 * Delete: Column quantity in BottleConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean DROP COLUMN IF EXISTS quantity;");
		/**
		 * Delete: Column tetaI in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS tetaI;");
		/**
		 * Delete: Column climReclycleAuto in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climReclycleAuto;");
		/**
		 * Delete: Column slowUnloadingValue in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS slowUnloadingValue;");
		/**
		 * Delete: Column mecanicalStrength in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS mecanicalStrength;");
		/**
		 * Delete: Column direction in EventStep
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean DROP COLUMN IF EXISTS direction;");
		/**
		 * Delete: FK bottleconfigurations in GazConfiguration
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP CONSTRAINT IF EXISTS bottleconfigurations;");
		/**
		 * Delete: Column climVMC in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climVMC;");
		/**
		 * Delete: Column name in Project
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column droppedFloor in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS droppedFloor;");
		/**
		 * Delete: Column risqueHeight in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS risqueHeight;");
		/**
		 * Delete: Column weight in Gaz
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP COLUMN IF EXISTS weight;");
		/**
		 * Delete: Column measuredVolume in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS measuredVolume;");
		
		/**
		 * Delete: Column slowUnloading in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS slowUnloading;");
		/**
		 * Delete: Column name in BottleType
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: FK sample in Project
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP CONSTRAINT IF EXISTS sample;");
		/**
		 * Delete: Column phiEPercent in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS phiEPercent;");
		
		/**
		 * Delete: Column CommissioningDate in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS CommissioningDate;");
		/**
		 * Delete: Column minimalProtectedHeight in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS minimalProtectedHeight;");
		/**
		 * Delete: FK step in Point
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean DROP CONSTRAINT IF EXISTS step;");
		/**
		 * Delete: Column mainHeight in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS mainHeight;");
		
		/**
		 * Delete: Column droppedCeilFull in GazConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean DROP COLUMN IF EXISTS droppedCeilFull;");
		
		/**
		 * Delete: Column city in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS city;");
		/**
		 * Delete: Column netVolume in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS netVolume;");
		/**
		 * Delete: Column phiIPercent in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS phiIPercent;");
		/**
		 * Delete: Column totalHeight in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS totalHeight;");
		
		/**
		 * Delete: FK image in Project
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP CONSTRAINT IF EXISTS image;");
		/**
		 * Delete: Column Status in Project
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP COLUMN IF EXISTS Status;");
		/**
		 * Delete: Column droppedCeiling in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS droppedCeiling;");
		
		/**
		 * Delete: Column name in Folder
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column status in Step
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean DROP COLUMN IF EXISTS status;");
		/**
		 * Delete: Column fanPressure in Reading
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean DROP COLUMN IF EXISTS fanPressure;");
		/**
		 * Delete: Column status in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS status;");
		/**
		 * Delete: FK step in Sample
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP CONSTRAINT IF EXISTS step;");
		/**
		 * Delete: Column name in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column airPressureCalculationMethod in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS airPressureCalculationMethod;");
		
		/**
		 * Delete: Column email in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS email;");
		/**
		 * Delete: Column kind in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS kind;");
		/**
		 * Delete: Column title in PersistentImage
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP COLUMN IF EXISTS title;");
		
		/**
		 * Delete: Column serialNumber in Device
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean DROP COLUMN IF EXISTS serialNumber;");
		/**
		 * Delete: Column climReclycle in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS climReclycle;");
		/**
		 * Delete: Column siret in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS siret;");
		
		/**
		 * Delete: Column roE in Sample
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean DROP COLUMN IF EXISTS roE;");
		/**
		 * Delete: Column risqueHeightPercent in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS risqueHeightPercent;");
		/**
		 * Delete: FK gazconfiguration in Gaz
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP CONSTRAINT IF EXISTS gazconfiguration;");
		/**
		 * Delete: Column volumeCorrection in TestedRoom
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean DROP COLUMN IF EXISTS volumeCorrection;");
		
		/**
		 * Delete: Column name in Gaz
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: Column error in PersistentImage
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean DROP COLUMN IF EXISTS error;");
		/**
		 * Delete: Column name in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS name;");
		/**
		 * Delete: FK bottletypes in Gaz
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP CONSTRAINT IF EXISTS bottletypes;");
		/**
		 * Delete: Column phone in Contact
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean DROP COLUMN IF EXISTS phone;");
		
		/**
		 * Delete: Column load in BottleConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean DROP COLUMN IF EXISTS load;");
		/**
		 * Delete: Column unit in BottleConfiguration
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean DROP COLUMN IF EXISTS unit;");
		
		/**
		 * Delete: Column density in Gaz
		 */
		/**
		 * WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A COLUMN IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean DROP COLUMN IF EXISTS density;");
		/**
		 * Delete: FK gazconfiguration in Project
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean DROP CONSTRAINT IF EXISTS gazconfiguration;");


		/**
		 * Delete: Table Device
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.DeviceBean;");
		/**
		 * Delete: Table Point
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.PointBean;");
		/**
		 * Delete: Table Contact
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.ContactBean;");
		/**
		 * Delete: Table CalibrationStep
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.CalibrationStepBean;");
		/**
		 * Delete: Table EventStep
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.EventStepBean;");
		
		/**
		 * Delete: Table TestedRoom
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.TestedRoomBean;");
		/**
		 * Delete: Table Folder
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.FolderBean;");
		
		
		/**
		 * Delete: Table BlowHole
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.BlowHoleBean;");
		/**
		 * Delete: Table Gaz
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.GazBean;");
		
		/**
		 * Delete: Table BottleType
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.BottleTypeBean;");
		/**
		 * Delete: Table Reading
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.ReadingBean;");
		
		/**
		 * Delete: Table Risque
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.RisqueBean;");
		
		/**
		 * Delete: Table Project
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.ProjectBean;");
		/**
		 * Delete: Table GaugeMode
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.GaugeModeBean;");
		/**
		 * Delete: Table Step
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.StepBean;");
		/**
		 * Delete: Table GazConfiguration
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.GazConfigurationBean;");
		/**
		 * Delete: Table Sample
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.SampleBean;");
		
		/**
		 * Delete: Table BottleConfiguration
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.BottleConfigurationBean;");
		
		
		
		
		/**
		 * Delete: Table PersistentImage
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.PersistentImageBean;");
		/**
		 * Delete: Table PersistentImageData
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.PersistentImageDataBean;");
		/**
		 * Delete: Table MainStep
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		//jdbcTemplate.execute("DROP TABLE PUBLIC.MainStepBean;");
	}
}


