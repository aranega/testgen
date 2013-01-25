/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column id is added to PersistentImageData
		Addition: Column totalHeight is added to TestedRoom
		Addition: FK gaz is added to GazConfiguration
		Addition: Column weight is added to Gaz
		Addition: Column kind is added to Project
		Addition: Table Gaz
		
		Addition: Column gaugeType is added to GaugeMode
		Addition: Table Point
		Addition: Domain GazWeight (nothing to do)
		Addition: Table PersistentImage
		Addition: Column measuredVolume is added to TestedRoom
		Addition: FK risque is added to Project
		Addition: Table BottleConfiguration
		Addition: Column serialNumber is added to Device
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Column roE is added to Sample
		Addition: Column phone is added to Contact
		Addition: FK point is added to Reading
		Addition: Column title is added to PersistentImage
		Addition: Table EventStep
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Column id is added to BlowHole
		Addition: Column id is added to GaugeMode
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Table Risque
		Addition: Column description is added to Project
		Addition: Column address2 is added to Contact
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column quantity is added to BlowHole
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column id is added to Folder
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column Status is added to Project
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: Column direction is added to MainStep
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Column netVolume is added to TestedRoom
		Addition: Column name is added to Folder
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Domain BottleUnit (nothing to do)
		Addition: Column buildingPressure is added to Reading
		Addition: Domain StepStatus (nothing to do)
		Addition: Column id is added to BottleConfiguration
		Addition: Column climVMC is added to TestedRoom
		
		
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Column n is added to MainStep
		Addition: Column unloadTime is added to TestedRoom
		Addition: Column cl is added to MainStep
		Addition: Column phiIPercent is added to Sample
		Addition: Column phiEPercent is added to Sample
		Addition: Column city is added to Contact
		Addition: Table CalibrationStep
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Column quantity is added to BottleConfiguration
		Addition: Domain SampleStatus (nothing to do)
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Column volume is added to BottleType
		Addition: Column fanPressure is added to Reading
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Column adress1 is added to Contact
		Addition: FK image is added to Project
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Table PersistentImageData
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: FK contacts is added to Project
		Addition: Table MainStep
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column calculatedELA is added to MainStep
		Addition: Column name is added to BottleType
		Addition: Table Reading
		
		Addition: FK bottleconfigurations is added to GazConfiguration
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Table GazConfiguration
		Addition: Column tetaI is added to Sample
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Column siret is added to Contact
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Column preview is added to PersistentImage
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column lowFlow is added to Reading
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Column id is added to Step
		Addition: Column status is added to Step
		Addition: Domain BeaufortScale (nothing to do)
		Addition: Table Contact
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Column id is added to Risque
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Column type is added to Gaz
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Domain Discharge (nothing to do)
		Addition: Domain ContactKind (nothing to do)
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Column pressureGoal is added to Point
		Addition: Column id is added to GazConfiguration
		Addition: Column id is added to Device
		Addition: Column name is added to Contact
		Addition: Column date is added to Step
		Addition: Column climReclycle is added to TestedRoom
		Addition: FK gaugemode is added to Reading
		Addition: Column roI is added to Sample
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column name is added to GaugeMode
		Addition: Column person is added to Contact
		Addition: Column name is added to Sample
		Addition: Table TestedRoom
		Addition: Column altitude is added to TestedRoom
		
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: FK contact is added to PersistentImage
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Column name is added to TestedRoom
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Column displayOrder is added to Folder
		Addition: Domain ProjectKind (nothing to do)
		Addition: Column id is added to BottleType
		Addition: Column data is added to PersistentImageData
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Table Folder
		Addition: Column airPressure is added to Sample
		Addition: FK step is added to Sample
		Addition: FK gazconfiguration is added to Project
		Addition: Column unit is added to BottleConfiguration
		
		Addition: Column clapetsCF is added to TestedRoom
		Addition: Column error is added to PersistentImage
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Column kind is added to Contact
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Column surface is added to BlowHole
		Addition: Column timeAverage is added to Reading
		
		Addition: Table BlowHole
		Addition: Column lastCalibrationDate is added to Device
		Addition: Column direction is added to EventStep
		Addition: Column date is added to Sample
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column climDuct is added to TestedRoom
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Column id is added to Point
		Addition: Entry ERROR in SampleStatus (nothing to do)
		
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: FK blowholes is added to TestedRoom
		Addition: FK bottleconfiguration is added to BottleType
		Addition: Table GaugeMode
		Addition: Column id is added to PersistentImage
		Addition: Column name is added to Gaz
		Addition: Column dataId is added to PersistentImage
		Addition: Table Step
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Entry VOLUME in BottleUnit (nothing to do)
		Addition: Column status is added to Sample
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Column tetaE is added to Sample
		Addition: Column load is added to BottleConfiguration
		Addition: Table Project
		Addition: Domain Direction (nothing to do)
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Column id is added to Gaz
		Addition: Column sourceFile is added to PersistentImage
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Column beaufortScale is added to Sample
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Table Sample
		Addition: Column email is added to Contact
		Addition: Column windMeasure is added to Sample
		Addition: Column tab is added to Risque
		
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: FK step is added to Point
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Table BottleType
		Addition: Column key is added to Risque
		Addition: Column weight is added to BottleType
		Addition: Column id is added to Contact
		Addition: FK bottletypes is added to Gaz
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Column correlation is added to MainStep
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: FK device is added to Reading
		Addition: Column zipCode is added to Contact
		Addition: Column id is added to Sample
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Column id is added to Reading
		Addition: Column id is added to TestedRoom
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		
		Addition: Column name is added to Project
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Column mainHeight is added to TestedRoom
		Addition: Column density is added to Gaz
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: Column id is added to Project
		Addition: Table Device
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Column Discharge is added to BlowHole
		Addition: FK project is added to Sample
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1359124987187__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Point
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PointBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
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
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Reading
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		
		/**
		 * Addition: Table TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Folder
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column id is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		/**
		 * Addition: FK gaz is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_ID) REFERENCES GazBean(ID);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(bottleconfigurations_ID) REFERENCES BottleConfigurationBean(ID);");
		
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: FK point is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(device_ID) REFERENCES DeviceBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		
		/**
		 * Addition: Column id is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		/**
		 * Addition: Column id is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto VARCHAR(255);");
		
		/**
		 * Addition: Column Status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column id is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		
		
		
		
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		/**
		 * Addition: FK contacts is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		
		
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		/**
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: FK bottleconfigurations is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_ID) REFERENCES GazBean(ID);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(bottleconfigurations_ID) REFERENCES BottleConfigurationBean(ID);");
		
		
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		
		/**
		 * Addition: Column preview is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN preview VARCHAR(255);");
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		/**
		 * Addition: Column id is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		/**
		 * Addition: Column id is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type VARCHAR(255);");
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		/**
		 * Addition: Column id is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(device_ID) REFERENCES DeviceBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		/**
		 * Addition: FK contact is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PersistentImageBean ADD FOREIGN KEY(contact_ID) REFERENCES ContactBean(ID);");
		
		
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		
		
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		/**
		 * Addition: Column id is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		/**
		 * Addition: FK step is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(step_ID) REFERENCES StepBean(ID);");
		
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		/**
		 * Addition: Column direction is added to EventStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		/**
		 * Addition: Column id is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		
		/**
		 * Addition: FK blowholes is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(blowholes_ID) REFERENCES BlowHoleBean(ID);");
		
		/**
		 * Addition: FK bottleconfiguration is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE BottleTypeBean ADD FOREIGN KEY(bottleconfiguration_ID) REFERENCES BottleConfigurationBean(ID);");
		
		/**
		 * Addition: Column id is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		/**
		 * Addition: Column id is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		/**
		 * Addition: Column tab is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN tab VARBINARY;");
		
		
		/**
		 * Addition: FK step is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PointBean ADD FOREIGN KEY(step_ID) REFERENCES StepBean(ID);");
		
		
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		/**
		 * Addition: Column id is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK bottletypes is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE GazBean ADD FOREIGN KEY(bottletypes_ID) REFERENCES BottleTypeBean(ID);");
		
		
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		
		
		/**
		 * Addition: FK device is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(device_ID) REFERENCES DeviceBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		/**
		 * Addition: Column id is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN id BIGINT;");
		
		
		
		/**
		 * Addition: Column id is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column name is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");
		/**
		 * Addition: Column density is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		
		/**
		 * Addition: Column id is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		/**
		 * Addition: FK project is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(step_ID) REFERENCES StepBean(ID);");
		



	}
}


