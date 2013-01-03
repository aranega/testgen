/*********************************************
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Table Step
		Addition: FK project is added to GazConfiguration
		Addition: Column type is added to Gaz
		Addition: Column cl is added to MainStep
		Addition: Column id is added to GazConfiguration
		Addition: Domain GazWeight (nothing to do)
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Column id is added to BottleConfiguration
		Addition: FK readings is added to Point
		Addition: FK bottleconfigurations is added to GazConfiguration
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Column lowFlow is added to Reading
		Addition: Column climReclycle is added to TestedRoom
		Addition: Table MainStep
		Addition: Column person is added to Contact
		Addition: Column timeAverage is added to Reading
		Addition: Column id is added to BottleType
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: FK step is added to Point
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column tetaE is added to Sample
		Addition: Column direction is added to MainStep
		Addition: Column pressureGoal is added to Point
		Addition: Column id is added to GaugeMode
		Addition: Column name is added to TestedRoom
		Addition: Table Folder
		Addition: Column id is added to TestedRoom
		Addition: Table Device
		Addition: Domain SampleStatus (nothing to do)
		Addition: Column quantity is added to BottleConfiguration
		Addition: Column name is added to BottleType
		Addition: Table EventStep
		Addition: Table PersistentImageData
		Addition: Column displayOrder is added to Folder
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Column clapetsCF is added to TestedRoom
		Addition: Column sourceFile is added to PersistentImage
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column Discharge is added to BlowHole
		Addition: Domain ProjectKind (nothing to do)
		Addition: FK contact is added to PersistentImage
		Addition: Column Status is added to Project
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: FK testedroom is added to BlowHole
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Column date is added to Step
		Addition: Table Reading
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Column beaufortScale is added to Sample
		Addition: Column volume is added to BottleType
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Column dataId is added to PersistentImage
		Addition: Column roE is added to Sample
		Addition: FK project is added to Sample
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Column phiEPercent is added to Sample
		Addition: Column address2 is added to Contact
		Addition: Column name is added to GaugeMode
		Addition: Column id is added to PersistentImage
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Column error is added to PersistentImage
		Addition: Column date is added to Sample
		Addition: Table Project
		Addition: Column key is added to Risque
		Addition: Column unloadTime is added to TestedRoom
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: FK image is added to Contact
		Addition: Column density is added to Gaz
		Addition: Table GazConfiguration
		Addition: Column description is added to Project
		Addition: FK points is added to Step
		Addition: Column name is added to Gaz
		Addition: Table Contact
		Addition: FK contacts is added to Project
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Column status is added to Sample
		Addition: FK blowholes is added to TestedRoom
		Addition: FK image is added to Project
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Column direction is added to EventStep
		Addition: Domain ContactKind (nothing to do)
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column adress1 is added to Contact
		Addition: Column id is added to PersistentImageData
		Addition: Column id is added to Folder
		Addition: Column kind is added to Contact
		Addition: Column siret is added to Contact
		Addition: Column id is added to Sample
		Addition: Column tetaI is added to Sample
		Addition: Column lastCalibrationDate is added to Device
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column measuredVolume is added to TestedRoom
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Column id is added to Reading
		Addition: Column weight is added to Gaz
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Column id is added to Risque
		Addition: Column phiIPercent is added to Sample
		Addition: Column name is added to Contact
		Addition: Column title is added to PersistentImage
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Column n is added to MainStep
		Addition: Column name is added to Folder
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Domain BottleUnit (nothing to do)
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Column unit is added to BottleConfiguration
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: FK gaz is added to GazConfiguration
		Addition: Column climDuct is added to TestedRoom
		Addition: Table GaugeMode
		Addition: Table PersistentImage
		Addition: Column fanPressure is added to Reading
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: FK step is added to Sample
		Addition: Column correlation is added to MainStep
		Addition: Domain Direction (nothing to do)
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: FK sample is added to Project
		Addition: Entry VOLUME in BottleUnit (nothing to do)
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: Domain BeaufortScale (nothing to do)
		Addition: FK sample is added to Step
		Addition: Column netVolume is added to TestedRoom
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Column altitude is added to TestedRoom
		Addition: Table Point
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Column city is added to Contact
		Addition: FK risque is added to Project
		Addition: Column phone is added to Contact
		Addition: Column calculatedELA is added to MainStep
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Domain Discharge (nothing to do)
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column totalHeight is added to TestedRoom
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: Column quantity is added to BlowHole
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column buildingPressure is added to Reading
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: FK gaugemode is added to Reading
		Addition: Column id is added to Project
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Table CalibrationStep
		Addition: Domain StepStatus (nothing to do)
		Addition: Column data is added to PersistentImageData
		Addition: Column preview is added to PersistentImage
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Table BottleType
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: Table TestedRoom
		Addition: FK bottletypes is added to Gaz
		Addition: FK gazconfiguration is added to Project
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Table Risque
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Column kind is added to Project
		Addition: Column weight is added to BottleType
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: FK gazconfiguration is added to Gaz
		Addition: Table BlowHole
		Addition: Column mainHeight is added to TestedRoom
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Column zipCode is added to Contact
		Addition: FK point is added to Reading
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Column name is added to Project
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Column id is added to Step
		Addition: FK device is added to Reading
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: FK bottleconfiguration is added to BottleType
		Addition: Column serialNumber is added to Device
		Addition: Column email is added to Contact
		Addition: Column id is added to Contact
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column surface is added to BlowHole
		Addition: Column id is added to Device
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column name is added to Sample
		Addition: Table Gaz
		Addition: Column id is added to Gaz
		Addition: Column status is added to Step
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column windMeasure is added to Sample
		Addition: Column id is added to BlowHole
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Table Sample
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Column roI is added to Sample
		Addition: Column load is added to BottleConfiguration
		Addition: Table BottleConfiguration
		Addition: Column airPressure is added to Sample
		Addition: Column id is added to Point
		Addition: Column climVMC is added to TestedRoom
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1357210600962__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"id BIGINT PRIMARY KEY);");
		
		/**
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Folder
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"id BIGINT PRIMARY KEY);");
		
		/**
		 * Addition: Table EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"id BIGINT PRIMARY KEY);");
		
		/**
		 * Addition: Table Reading
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"id BIGINT PRIMARY KEY);");
		
		
		
		
		/**
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"id BIGINT PRIMARY KEY);");
		
		
		/**
		 * Addition: Table Point
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PointBean (" +
						"id BIGINT PRIMARY KEY);");
		
		/**
		 * Addition: Table CalibrationStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"id BIGINT PRIMARY KEY);");
		
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"id BIGINT PRIMARY KEY);");
		/**
		 * Addition: Table BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"id BIGINT PRIMARY KEY);");

		/**
		 * Addition: FK project is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(project_id) REFERENCES ProjectBean(id);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_id) REFERENCES GazBean(id);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(bottleconfigurations_id) REFERENCES BottleConfigurationBean(id);");
		
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type VARCHAR(255);");
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		/**
		 * Addition: Column id is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column id is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK readings is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PointBean ADD FOREIGN KEY(step_id) REFERENCES StepBean(id);");
		jdbcTemplate.execute("ALTER TABLE PointBean ADD FOREIGN KEY(readings_id) REFERENCES ReadingBean(id);");
		
		/**
		 * Addition: FK bottleconfigurations is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(project_id) REFERENCES ProjectBean(id);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_id) REFERENCES GazBean(id);");
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(bottleconfigurations_id) REFERENCES BottleConfigurationBean(id);");
		
		
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		/**
		 * Addition: Column id is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN id BIGINT;");
		
		
		
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		/**
		 * Addition: Column id is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN id BIGINT;");
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
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		/**
		 * Addition: FK contact is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PersistentImageBean ADD FOREIGN KEY(contact_id) REFERENCES ContactBean(id);");
		
		/**
		 * Addition: Column Status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		
		
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column id is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		
		/**
		 * Addition: FK image is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE ContactBean ADD FOREIGN KEY(image_id) REFERENCES PersistentImageBean(id);");
		
		/**
		 * Addition: Column density is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: FK points is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE StepBean ADD FOREIGN KEY(sample_id) REFERENCES SampleBean(id);");
		jdbcTemplate.execute("ALTER TABLE StepBean ADD FOREIGN KEY(points_id) REFERENCES PointBean(id);");
		
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: FK contacts is added to Project
		 */
		// Join table generation
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  PROJECT_CONTACTS (" +
						"ProjectBean_id BIGINT PRIMARY KEY," +
						"contacts_id BIGINT," +
						"FOREIGN KEY(contacts_id) REFERENCES ContactBean(id));");					
		
		
		
		
		
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: FK blowholes is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(blowholes_id) REFERENCES BlowHoleBean(id);");
		
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_id) REFERENCES RisqueBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_id) REFERENCES PersistentImageBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_id) REFERENCES ContactBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_id) REFERENCES GazConfigurationBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(sample_id) REFERENCES SampleBean(id);");
		
		
		/**
		 * Addition: Column direction is added to EventStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		/**
		 * Addition: Column id is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		/**
		 * Addition: Column id is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		
		/**
		 * Addition: Column id is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		/**
		 * Addition: Column id is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		
		
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		
		
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		
		
		/**
		 * Addition: FK step is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_id) REFERENCES ProjectBean(id);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(step_id) REFERENCES StepBean(id);");
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		
		
		/**
		 * Addition: FK sample is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_id) REFERENCES RisqueBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_id) REFERENCES PersistentImageBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_id) REFERENCES ContactBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_id) REFERENCES GazConfigurationBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(sample_id) REFERENCES SampleBean(id);");
		
		
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_id) REFERENCES RisqueBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_id) REFERENCES PersistentImageBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_id) REFERENCES ContactBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_id) REFERENCES GazConfigurationBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(sample_id) REFERENCES SampleBean(id);");
		
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto VARCHAR(255);");
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_id) REFERENCES PointBean(id);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(device_id) REFERENCES DeviceBean(id);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_id) REFERENCES GaugeModeBean(id);");
		
		/**
		 * Addition: Column id is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		/**
		 * Addition: Column preview is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN preview VARCHAR(255);");
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		
		/**
		 * Addition: FK bottletypes is added to Gaz
		 */
		// Join table generation
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  GAZ_BOTTLETYPES (" +
						"GazBean_id BIGINT PRIMARY KEY," +
						"bottletypes_id BIGINT," +
						"FOREIGN KEY(bottletypes_id) REFERENCES BottleTypeBean(id));");					
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_id) REFERENCES RisqueBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_id) REFERENCES PersistentImageBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(contacts_id) REFERENCES ContactBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_id) REFERENCES GazConfigurationBean(id);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(sample_id) REFERENCES SampleBean(id);");
		
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		
		/**
		 * Addition: FK gazconfiguration is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE GazBean ADD FOREIGN KEY(bottletypes_id) REFERENCES BottleTypeBean(id);");
		jdbcTemplate.execute("ALTER TABLE GazBean ADD FOREIGN KEY(gazconfiguration_id) REFERENCES GazConfigurationBean(id);");
		
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		/**
		 * Addition: Column name is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN name VARCHAR(255);");
		
		
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		
		
		/**
		 * Addition: Column id is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK device is added to Reading
		 */
		// Join table generation
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  READING_DEVICE (" +
						"ReadingBean_id BIGINT PRIMARY KEY," +
						"device_id BIGINT," +
						"FOREIGN KEY(device_id) REFERENCES DeviceBean(id));");					
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		/**
		 * Addition: FK bottleconfiguration is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE BottleTypeBean ADD FOREIGN KEY(bottleconfiguration_id) REFERENCES BottleConfigurationBean(id);");
		
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		/**
		 * Addition: Column id is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		/**
		 * Addition: Column id is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column id is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		/**
		 * Addition: Column id is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN id BIGINT;");
		
		
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		/**
		 * Addition: Column id is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");



	}
}


