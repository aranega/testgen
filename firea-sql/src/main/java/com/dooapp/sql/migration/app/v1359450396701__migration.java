/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Table BottleConfiguration
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Column id is added to Step
		Addition: Column calculatedELA is added to MainStep
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Column id is added to PersistentImageData
		Addition: Domain ContactKind (nothing to do)
		Addition: Table Folder
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column id is added to Risque
		Addition: Column fanPressure is added to Reading
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Table Contact
		Addition: Column windMeasure is added to Sample
		Addition: Column tetaI is added to Sample
		Addition: Table GazConfiguration
		Addition: Column displayOrder is added to Folder
		Addition: Column surface is added to BlowHole
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column person is added to Contact
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Domain Discharge (nothing to do)
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: Column quantity is added to BottleConfiguration
		Addition: Table Gaz
		Addition: FK technician is added to Project
		Addition: Column description is added to Project
		Addition: Column error is added to PersistentImage
		Addition: Column email is added to Contact
		Addition: Domain BottleUnit (nothing to do)
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Column pressureGoal is added to Point
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Column siret is added to Contact
		Addition: Column name is added to BottleType
		Addition: Column airPressure is added to Sample
		Addition: Column phiIPercent is added to Sample
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: FK image is added to Contact
		Addition: Column direction is added to EventStep
		
		Addition: FK firmCustomer is added to Project
		Addition: Column date is added to Sample
		Addition: Column highUp is added to Sample
		Addition: Column unloadTime is added to TestedRoom
		Addition: Table TestedRoom
		
		Addition: FK testedroom is added to BlowHole
		Addition: FK project is added to Sample
		Addition: Column kind is added to Project
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Column city is added to Contact
		Addition: Column load is added to BottleConfiguration
		Addition: Column density is added to Gaz
		
		Addition: Column id is added to BottleType
		Addition: Column key is added to Risque
		Addition: Column totalHeight is added to TestedRoom
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: FK firmMaintenance is added to Project
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Column correlation is added to MainStep
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Domain BeaufortScale (nothing to do)
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Column type is added to Gaz
		Addition: Column address2 is added to Contact
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column name is added to Folder
		Addition: Column roE is added to Sample
		Addition: Column id is added to PersistentImage
		Addition: Column clapetsCF is added to TestedRoom
		Addition: FK project is added to TestedRoom
		Addition: Column zipCode is added to Contact
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: FK sample is added to Step
		Addition: Column phiEPercent is added to Sample
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Column name is added to GaugeMode
		Addition: Column nameDo is added to Project
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Table Point
		Addition: Column measuredVolume is added to TestedRoom
		
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Table GaugeMode
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Column netVolume is added to TestedRoom
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: FK image is added to Project
		Addition: Column id is added to TestedRoom
		
		Addition: Column id is added to GazConfiguration
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Table BlowHole
		Addition: Column Status is added to Project
		Addition: Column roI is added to Sample
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Table Sample
		Addition: Column id is added to GaugeMode
		Addition: Column name is added to Gaz
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column status is added to Sample
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Column weight is added to BottleType
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Table Reading
		Addition: Column tetaE is added to Sample
		Addition: Column id is added to Folder
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Column title is added to PersistentImage
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Column altitude is added to TestedRoom
		Addition: Column id is added to Contact
		Addition: Column n is added to MainStep
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: Column serialNumber is added to Device
		Addition: Domain GazWeight (nothing to do)
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Column Discharge is added to BlowHole
		Addition: Column timeAverage is added to Reading
		Addition: Column reference is added to Project
		
		Addition: Entry DONE in ProjectStatus (nothing to do)
		
		Addition: Column id is added to Point
		Addition: Column name is added to Contact
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Column adress1 is added to Contact
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Domain ProjectKind (nothing to do)
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column sourceFile is added to PersistentImage
		Addition: Column id is added to Project
		Addition: FK firmMoe is added to Project
		Addition: Column buildingPressure is added to Reading
		Addition: Table MainStep
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Column unit is added to BottleConfiguration
		Addition: Domain StepStatus (nothing to do)
		Addition: FK gaugemode is added to Reading
		Addition: Table Device
		Addition: Column lastCalibrationDate is added to Device
		
		Addition: Column volume is added to BottleType
		Addition: Column data is added to PersistentImageData
		Addition: Column name is added to Sample
		Addition: Table Step
		Addition: Column status is added to Step
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: FK point is added to Reading
		Addition: Column kind is added to Contact
		Addition: Table BottleType
		Addition: Column id is added to Device
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		
		Addition: Column retentionGoal is added to GazConfiguration
		
		Addition: Column weight is added to Gaz
		Addition: Domain SampleStatus (nothing to do)
		Addition: FK risque is added to Project
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Table Risque
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Column id is added to BlowHole
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: Table CalibrationStep
		Addition: Column cl is added to MainStep
		Addition: Column id is added to BottleConfiguration
		Addition: Column direction is added to MainStep
		Addition: Table Project
		Addition: Domain Direction (nothing to do)
		Addition: Column quantity is added to BlowHole
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column climReclycle is added to TestedRoom
		Addition: Column name is added to TestedRoom
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Column lowFlow is added to Reading
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column climVMC is added to TestedRoom
		Addition: Column beaufortScale is added to Sample
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column phone is added to Contact
		Addition: Column date is added to Step
		Addition: Table PersistentImageData
		Addition: Column mainHeight is added to TestedRoom
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Column dataId is added to PersistentImage
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		
		Addition: FK gazconfiguration is added to Project
		Addition: Column id is added to Sample
		Addition: Entry VOLUME_NEW in BottleUnit (nothing to do)
		Addition: FK step is added to Point
		Addition: Table PersistentImage
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column climDuct is added to TestedRoom
		Addition: Table EventStep
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column id is added to Gaz
		Addition: Column id is added to Reading
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1359450396701__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
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
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
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
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Reading
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
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
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");

		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		/**
		 * Addition: Column id is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		/**
		 * Addition: Column id is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		/**
		 * Addition: Column id is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: FK technician is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		
		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		/**
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		
		
		/**
		 * Addition: FK image is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE ContactBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column direction is added to EventStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		
		/**
		 * Addition: FK firmCustomer is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column highUp is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN highUp INTEGER;");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		
		
		
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		/**
		 * Addition: Column density is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		
		/**
		 * Addition: Column id is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		/**
		 * Addition: FK firmMaintenance is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type INTEGER;");
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		/**
		 * Addition: Column id is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		/**
		 * Addition: FK project is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		
		
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column nameDo is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN nameDo VARCHAR(255);");
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		
		
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		
		
		
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		
		
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column id is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column id is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column Status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		
		/**
		 * Addition: Column id is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto BOOLEAN;");
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		/**
		 * Addition: Column id is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		/**
		 * Addition: Column id is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		
		
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		/**
		 * Addition: Column reference is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN reference VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column id is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		/**
		 * Addition: Column id is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK firmMoe is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		
		
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column id is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		
		
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		
		
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		/**
		 * Addition: Column id is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		/**
		 * Addition: Column id is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		
		
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");
		
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		
		
		
		
		
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column id is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		
		
		
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		
		/**
		 * Addition: Column id is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN id BIGINT;");



	}
}


