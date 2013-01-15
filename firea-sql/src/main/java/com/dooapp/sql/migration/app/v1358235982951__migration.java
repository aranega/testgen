/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column adress1 is added to Contact
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Column date is added to Sample
		
		Addition: Column load is added to BottleConfiguration
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Column climVMC is added to TestedRoom
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Column lastCalibrationDate is added to Device
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Column phone is added to Contact
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Column status is added to Step
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Column direction is added to MainStep
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Column quantity is added to BottleConfiguration
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Table MainStep
		Addition: Column newAtt is added to Project
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: FK risque is added to Project
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Table EventStep
		Addition: Column key is added to Risque
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: Column data is added to PersistentImageData
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Column clapetsCF is added to TestedRoom
		Addition: Column tetaE is added to Sample
		Addition: Table Project
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: FK project is added to Sample
		Addition: Domain ContactKind (nothing to do)
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column calculatedELA is added to MainStep
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: Column tetaI is added to Sample
		
		Addition: Column lowFlow is added to Reading
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Column kind is added to Project
		Addition: FK point is added to Reading
		Addition: Entry PRESSURE in Direction (nothing to do)
		
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Table Step
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Table Reading
		Addition: Column date is added to Step
		Addition: Table Contact
		Addition: Column displayOrder is added to Folder
		Addition: Column person is added to Contact
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Column volume is added to BottleType
		Addition: Column netVolume is added to TestedRoom
		Addition: Table Risque
		Addition: Column altitude is added to TestedRoom
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Column unit is added to BottleConfiguration
		Addition: Table BottleConfiguration
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Domain ProjectKind (nothing to do)
		Addition: Entry VOLUME in BottleUnit (nothing to do)
		Addition: Column beaufortScale is added to Sample
		
		Addition: Column quantity is added to BlowHole
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Entry TO_PLANIF in ProjectStatus (nothing to do)
		Addition: Column windMeasure is added to Sample
		Addition: FK gaz is added to GazConfiguration
		Addition: Column roE is added to Sample
		Addition: Table Folder
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Column Status is added to Project
		Addition: Column name is added to Contact
		Addition: Column correlation is added to MainStep
		Addition: Domain SampleStatus (nothing to do)
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Domain GazWeight (nothing to do)
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Column name is added to GaugeMode
		Addition: Column city is added to Contact
		Addition: FK testedroom is added to BlowHole
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Table GazConfiguration
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Column unloadTime is added to TestedRoom
		Addition: Column totalHeight is added to TestedRoom
		Addition: Column zipCode is added to Contact
		
		Addition: Column name is added to Sample
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Column name is added to Gaz
		Addition: Column weight is added to Gaz
		Addition: Column weight is added to BottleType
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Domain BeaufortScale (nothing to do)
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Column timeAverage is added to Reading
		Addition: Column name is added to BottleType
		
		Addition: Column direction is added to EventStep
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Column kind is added to Contact
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Column risqueHeight is added to TestedRoom
		
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		
		Addition: Column cl is added to MainStep
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Column airPressure is added to Sample
		Addition: Table BlowHole
		Addition: Column phiEPercent is added to Sample
		Addition: Table PersistentImage
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Column email is added to Contact
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column buildingPressure is added to Reading
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: Column name is added to TestedRoom
		Addition: Column dataId is added to PersistentImage
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Table Gaz
		
		Addition: Column n is added to MainStep
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column climReclycle is added to TestedRoom
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Column error is added to PersistentImage
		Addition: Table Sample
		Addition: Column type is added to Gaz
		Addition: Column name is added to Project
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Column climDuct is added to TestedRoom
		Addition: Column fanPressure is added to Reading
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column sourceFile is added to PersistentImage
		Addition: Column description is added to Project
		Addition: Domain Discharge (nothing to do)
		Addition: Column pressureGoal is added to Point
		Addition: Column measuredVolume is added to TestedRoom
		Addition: FK step is added to Point
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column Discharge is added to BlowHole
		Addition: Column slowUnloading is added to GazConfiguration
		
		
		Addition: Table PersistentImageData
		Addition: Column density is added to Gaz
		Addition: Table GaugeMode
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Table Device
		Addition: Column surface is added to BlowHole
		Addition: FK image is added to Project
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column serialNumber is added to Device
		Addition: Table BottleType
		Addition: Column siret is added to Contact
		
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Column phiIPercent is added to Sample
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Domain StepStatus (nothing to do)
		Addition: Column status is added to Sample
		Addition: Domain Direction (nothing to do)
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Table CalibrationStep
		Addition: FK contact is added to PersistentImage
		Addition: Column roI is added to Sample
		Addition: Table TestedRoom
		Addition: Column name is added to Folder
		Addition: Domain BottleUnit (nothing to do)
		Addition: Column title is added to PersistentImage
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: FK gazconfiguration is added to Project
		Addition: FK gaugemode is added to Reading
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Table Point
		Addition: FK sample is added to Step
		Addition: Column preview is added to PersistentImage
		Addition: Column address2 is added to Contact
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column mainHeight is added to TestedRoom
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1358235982951__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		
		/**
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
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
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Folder
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table CalibrationStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Point
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PointBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		
		
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		
		/**
		 * Addition: Column newAtt is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN newAtt VARBINARY;");
		
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		
		
		
		
		
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		
		
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		
		/**
		 * Addition: Column Status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		
		
		
		
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto VARCHAR(255);");
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		/**
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column direction is added to EventStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		
		
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		
		
		
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		
		
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type VARCHAR(255);");
		/**
		 * Addition: Column name is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		
		
		/**
		 * Addition: Column density is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		
		
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		
		/**
		 * Addition: FK contact is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PersistentImageBean ADD FOREIGN KEY(contact_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		
		
		/**
		 * Addition: Column preview is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN preview VARCHAR(255);");
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");



	}
}


