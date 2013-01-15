/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column siret is added to Contact
		Addition: Column name is added to BottleType
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column pressureGoal is added to Point
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Column email is added to Contact
		Addition: Column id is added to PersistentImageData
		Addition: Column person is added to Contact
		
		Addition: Column id is added to Project
		
		Addition: Column zipCode is added to Contact
		Addition: Column phiIPercent is added to Sample
		Addition: FK step is added to Point
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Column address2 is added to Contact
		Addition: Column id is added to Device
		Addition: Domain ContactKind (nothing to do)
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Table Risque
		Addition: FK testedroom is added to BlowHole
		Addition: Column data is added to PersistentImageData
		Addition: Table Folder
		Addition: Column surface is added to BlowHole
		Addition: Table Point
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: Column city is added to Contact
		Addition: Column name is added to GaugeMode
		Addition: Column id is added to Folder
		Addition: Column name is added to Sample
		Addition: Column phone is added to Contact
		Addition: Column climVMC is added to TestedRoom
		Addition: Column Status is added to Project
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Domain ProjectKind (nothing to do)
		Addition: Column load is added to BottleConfiguration
		Addition: Column id is added to Point
		Addition: Column preview is added to PersistentImage
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column lowFlow is added to Reading
		Addition: Column direction is added to MainStep
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		
		Addition: Column name is added to Folder
		Addition: Column measuredVolume is added to TestedRoom
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Column density is added to Gaz
		Addition: Table Gaz
		Addition: Column id is added to Gaz
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Column weight is added to BottleType
		Addition: Column unit is added to BottleConfiguration
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Column buildingPressure is added to Reading
		Addition: Column id is added to BottleType
		Addition: Column netVolume is added to TestedRoom
		Addition: Table BottleConfiguration
		Addition: Domain Direction (nothing to do)
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Column adress1 is added to Contact
		Addition: Table BlowHole
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Column id is added to Sample
		Addition: Column id is added to BottleConfiguration
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Column lastCalibrationDate is added to Device
		Addition: Entry VOLUME in BottleUnit (nothing to do)
		Addition: Column title is added to PersistentImage
		Addition: Column direction is added to EventStep
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Column sourceFile is added to PersistentImage
		Addition: Domain Discharge (nothing to do)
		Addition: Column altitude is added to TestedRoom
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column id is added to GazConfiguration
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Column date is added to Step
		Addition: FK gazconfiguration is added to Project
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Column totalHeight is added to TestedRoom
		
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Column volume is added to BottleType
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: Column tetaI is added to Sample
		Addition: Column id is added to GaugeMode
		Addition: Column clapetsCF is added to TestedRoom
		Addition: Column kind is added to Contact
		Addition: Column description is added to Project
		Addition: Column phiEPercent is added to Sample
		Addition: Column id is added to Reading
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: Table GazConfiguration
		Addition: FK risque is added to Project
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: Column windMeasure is added to Sample
		Addition: Column timeAverage is added to Reading
		Addition: Column airPressure is added to Sample
		Addition: Column serialNumber is added to Device
		Addition: FK point is added to Reading
		Addition: Column dataId is added to PersistentImage
		Addition: Column roE is added to Sample
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Column name is added to Contact
		Addition: Table BottleType
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: Domain SampleStatus (nothing to do)
		
		
		Addition: Column fanPressure is added to Reading
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Table Project
		
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Column climDuct is added to TestedRoom
		Addition: Column tetaE is added to Sample
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column key is added to Risque
		Addition: FK sample is added to Step
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Column Discharge is added to BlowHole
		Addition: Column weight is added to Gaz
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Column id is added to BlowHole
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column name is added to Gaz
		Addition: FK gaz is added to GazConfiguration
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Column calculatedELA is added to MainStep
		Addition: Table EventStep
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Table Device
		Addition: Column type is added to Gaz
		
		
		Addition: Column id is added to Contact
		Addition: Column id is added to PersistentImage
		Addition: Column unloadTime is added to TestedRoom
		Addition: Table GaugeMode
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column date is added to Sample
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column climReclycle is added to TestedRoom
		Addition: Column mainHeight is added to TestedRoom
		Addition: Column quantity is added to BlowHole
		Addition: Table PersistentImage
		Addition: Column name is added to Project
		Addition: Table Step
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Column displayOrder is added to Folder
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column correlation is added to MainStep
		
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Table Reading
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column kind is added to Project
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column id is added to Step
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Domain StepStatus (nothing to do)
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Table CalibrationStep
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: FK contact is added to PersistentImage
		Addition: Table PersistentImageData
		Addition: Domain BottleUnit (nothing to do)
		Addition: Column id is added to Risque
		Addition: Column status is added to Step
		Addition: Domain GazWeight (nothing to do)
		Addition: Domain ProjectStatus (nothing to do)
		Addition: FK image is added to Project
		Addition: Table TestedRoom
		Addition: Table Contact
		Addition: Table Sample
		Addition: Column cl is added to MainStep
		Addition: Column status is added to Sample
		
		Addition: FK gaugemode is added to Reading
		Addition: Table MainStep
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: FK project is added to Sample
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Column n is added to MainStep
		
		Addition: Column name is added to TestedRoom
		Addition: Domain BeaufortScale (nothing to do)
		Addition: Column id is added to TestedRoom
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Column quantity is added to BottleConfiguration
		
		Addition: Column error is added to PersistentImage
		Addition: Column beaufortScale is added to Sample
		Addition: Column roI is added to Sample
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358264043850__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		/**
		 * Addition: Table Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Folder
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Point
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PointBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Reading
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table CalibrationStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		
		/**
		 * Addition: Table TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		

		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		/**
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		
		
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		/**
		 * Addition: Column id is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		
		/**
		 * Addition: Column id is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		
		
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		/**
		 * Addition: Column id is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column id is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		/**
		 * Addition: Column Status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		/**
		 * Addition: Column id is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column preview is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN preview VARCHAR(255);");
		
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		
		
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		
		/**
		 * Addition: Column density is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		/**
		 * Addition: Column id is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column id is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		
		
		/**
		 * Addition: Column id is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column direction is added to EventStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		
		/**
		 * Addition: Column id is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		/**
		 * Addition: Column id is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		/**
		 * Addition: Column id is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		
		
		
		
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		
		
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		
		
		
		
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		
		
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		/**
		 * Addition: Column id is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type VARCHAR(255);");
		
		
		/**
		 * Addition: Column id is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column name is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto VARCHAR(255);");
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		
		
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		/**
		 * Addition: Column id is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: FK contact is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PersistentImageBean ADD FOREIGN KEY(contact_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column id is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		
		
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column id is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");



	}
}


