/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column id is added to Gaz
		Addition: Table Sample
		Addition: Column key is added to Risque
		Addition: Table CalibrationStep
		Addition: Table BottleType
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Column direction is added to MainStep
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: FK gaugemode is added to Reading
		Addition: Table StaticStep
		Addition: Column address2 is added to Contact
		Addition: Column zipCode is added to Contact
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: FK postStaticStep is added to Sample
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: FK depressureMainStep is added to Sample
		
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Column name is added to Folder
		Addition: FK blowholeconfiguration is added to BlowHole
		Addition: Table Device
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column climReclycle is added to TestedRoom
		Addition: Domain StepStatus (nothing to do)
		Addition: Column email is added to Contact
		Addition: Column id is added to ReportTemplate
		Addition: Column status is added to Point
		Addition: Column discharge is added to BlowHole
		Addition: Entry VOLUME in BottleUnit (nothing to do)
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Column climVMC is added to TestedRoom
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: FK project is added to Sample
		Addition: Table BottleConfiguration
		Addition: Entry DESC in PointDirection (nothing to do)
		Addition: Column chosenInitialConcentration is added to GazConfiguration
		Addition: Column roI is added to Sample
		Addition: Column id is added to Project
		Addition: Table ReportTemplate
		Addition: Column measuredTemperature is added to TestedRoom
		Addition: Column pressureGoal is added to BlowHoleStep
		Addition: Column totalHeight is added to TestedRoom
		Addition: Column buildingPressure is added to Reading
		Addition: Column id is added to BlowHole
		Addition: FK project is added to TestedRoom
		Addition: Column measuredVolume is added to TestedRoom
		Addition: FK blowholeconfiguration is added to TestedRoom
		Addition: Column numberOfPoint is added to Sample
		Addition: Domain PointStatus (nothing to do)
		Addition: Entry STANDARD in PressureType (nothing to do)
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Entry CAPTURING in PointStatus (nothing to do)
		Addition: Column windMeasure is added to Sample
		Addition: Domain BottleUnit (nothing to do)
		Addition: Column unloadTime is added to TestedRoom
		Addition: Column city is added to Contact
		Addition: Column name is added to Project
		Addition: Column kind is added to Project
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Entry ASC in PointDirection (nothing to do)
		Addition: Column prescribedFinalConcentration is added to GazConfiguration
		
		Addition: FK technician is added to Project
		Addition: Column description is added to Project
		Addition: Column person is added to Contact
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column chosenFinalConcentration is added to GazConfiguration
		Addition: Column beaufortScale is added to Sample
		Addition: Table TestedRoom
		Addition: Column quantity is added to BottleConfiguration
		Addition: Column dataId is added to PersistentImage
		Addition: Column id is added to TestedRoom
		Addition: Column tetaI is added to Sample
		Addition: Column name is added to ReportTemplate
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: Column description is added to ReportTemplate
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column quantity is added to BlowHole
		Addition: Column n is added to MainStep
		Addition: Column id is added to BottleConfiguration
		Addition: Column airPressure is added to Sample
		
		Addition: Column id is added to GaugeMode
		Addition: Column forcedGazWeight is added to GazConfiguration
		Addition: Domain Direction (nothing to do)
		Addition: FK gazConfiguration is added to BottleConfiguration
		Addition: Column id is added to Sample
		Addition: Column phiIPercent is added to Sample
		Addition: Table MainStep
		Addition: Column lowTarget is added to Sample
		Addition: Column kind is added to Contact
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		
		Addition: Column serialNumber is added to Device
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column pressureGoal is added to Point
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Entry DONE in PointStatus (nothing to do)
		Addition: Column boundInitialConcentration is added to GazConfiguration
		Addition: Column name is added to TestedRoom
		Addition: Column status is added to Sample
		Addition: Column calculatedELA is added to MainStep
		Addition: FK gaz is added to GazConfiguration
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Domain Discharge (nothing to do)
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Table Step
		Addition: Column id is added to BottleType
		Addition: Column name is added to Gaz
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: FK image is added to ReportTemplate
		Addition: Table PersistentImageData
		Addition: FK firmMoe is added to Project
		Addition: Column correlation is added to MainStep
		Addition: FK firmCustomer is added to Project
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Column pointDirection is added to Sample
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Entry NEGATIVE in Discharge (nothing to do)
		Addition: Column volume is added to BottleType
		Addition: Table Risque
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Table Project
		Addition: Column id is added to Contact
		Addition: Table Point
		Addition: Column lastCalibrationDate is added to Device
		
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Column unit is added to BottleConfiguration
		Addition: Column id is added to Device
		Addition: Column weight is added to Gaz
		Addition: Column blowHoleSafetyFactor is added to BlowHoleConfiguration
		Addition: Column lowFlow is added to Reading
		Addition: Column siret is added to Contact
		Addition: Column elaIncluded is added to BlowHoleConfiguration
		Addition: Column weight is added to BottleType
		Addition: FK pressureEventStep is added to Sample
		Addition: Column phiEPercent is added to Sample
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Column netVolume is added to TestedRoom
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Column phone is added to Contact
		Addition: Column id is added to PersistentImageData
		Addition: FK image is added to Contact
		Addition: Table Gaz
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Column id is added to Point
		Addition: Column reference is added to Project
		Addition: Entry NO_STARTED in PointStatus (nothing to do)
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Column status is added to Project
		Addition: Column measuredPressure is added to TestedRoom
		Addition: Table GaugeMode
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Column ela is added to Point
		Addition: Table BlowHoleConfiguration
		Addition: Column altitude is added to TestedRoom
		Addition: Column id is added to Reading
		Addition: Table Contact
		Addition: Column id is added to BlowHoleConfiguration
		Addition: Column name is added to GaugeMode
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column cl is added to Point
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column loaelConcentration is added to Gaz
		Addition: Column highTarget is added to Sample
		Addition: Column timeAverage is added to Reading
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column prescribedTemperature is added to TestedRoom
		Addition: Column name is added to BottleType
		Addition: Column totalLoadToInstall is added to GazConfiguration
		Addition: Column roE is added to Sample
		Addition: Column id is added to PersistentImage
		Addition: FK pressureMainStep is added to Sample
		Addition: Column fanPressure is added to Reading
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Entry FINISHING in PointStatus (nothing to do)
		Addition: Column kind is added to ReportTemplate
		Addition: Column vl is added to Point
		Addition: Column deltaPm is added to Point
		Addition: Column load is added to BottleConfiguration
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Column referencePressureType is added to BlowHoleConfiguration
		Addition: Column name is added to Sample
		Addition: FK gazconfiguration is added to Project
		Addition: FK risque is added to Project
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Column prescribedPressure is added to TestedRoom
		
		Addition: Column direction is added to BlowHoleStep
		Addition: Column referencePressure is added to BlowHoleConfiguration
		Addition: Column id is added to GazConfiguration
		Addition: Domain BeaufortScale (nothing to do)
		Addition: Column id is added to Folder
		Addition: Table PersistentImage
		Addition: Column file is added to ReportTemplate
		Addition: Table BlowHoleStep
		Addition: Column data is added to PersistentImageData
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: FK depressureEventStep is added to Sample
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column highUp is added to Sample
		Addition: Column fanFlow is added to Reading
		Addition: Column date is added to Step
		Addition: Column climDuct is added to TestedRoom
		Addition: Table Folder
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Column status is added to Step
		Addition: Entry ERROR in PointStatus (nothing to do)
		Addition: Column prescribedRetention is added to GazConfiguration
		Addition: FK firmMaintenance is added to Project
		
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Domain SampleStatus (nothing to do)
		Addition: Column id is added to Step
		Addition: Column title is added to PersistentImage
		Addition: Column n is added to Point
		
		Addition: Column cl is added to MainStep
		Addition: Table BlowHole
		
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Column name is added to Contact
		Addition: Column surface is added to BlowHole
		Addition: Column tetaE is added to Sample
		Addition: Column error is added to PersistentImage
		Addition: FK bottletype is added to BottleConfiguration
		Addition: FK calibrationStep is added to Sample
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Domain ProjectKind (nothing to do)
		Addition: Entry OTHER in PressureType (nothing to do)
		Addition: Column adress1 is added to Contact
		Addition: Column deltaP is added to StaticStep
		Addition: Column displayOrder is added to Folder
		Addition: Column sourceFile is added to PersistentImage
		Addition: Domain GazWeight (nothing to do)
		Addition: Table Reading
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column droppedCeiling is added to TestedRoom
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Column id is added to Risque
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: FK image is added to Project
		Addition: FK sample is added to Step
		Addition: Table GazConfiguration
		Addition: Column commissioningDate is added to TestedRoom
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Domain PointDirection (nothing to do)
		Addition: FK preStaticStep is added to Sample
		Addition: Column elevation is added to Sample
		Addition: Entry POSITIVE in Discharge (nothing to do)
		Addition: Domain ContactKind (nothing to do)
		Addition: Column referencePressureJustification is added to BlowHoleConfiguration
		Addition: Entry COLUMN_PRESSURE in PressureType (nothing to do)
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Column preview is added to PersistentImage
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column prescribedInitialConcentration is added to GazConfiguration
		Addition: Column date is added to Sample
		Addition: Column installedInitialConcentration is added to GazConfiguration
		Addition: Column openingPressure is added to BlowHole
		Addition: Column type is added to Gaz
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Column holeSize is added to CalibrationStep
		Addition: FK point is added to Reading
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Entry MECHANICAL_RESISTANCE in PressureType (nothing to do)
		Addition: Domain PressureType (nothing to do)
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: FK step is added to Point
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column mainHeight is added to TestedRoom
		Addition: Column clapetsCF is added to TestedRoom
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1361452091219__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		/**
		 * Addition: Table Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table CalibrationStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table StaticStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StaticStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table ReportTemplate
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReportTemplateBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		/**
		 * Addition: Table Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
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
		 * Addition: Table GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BlowHoleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		
		
		/**
		 * Addition: Table PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		/**
		 * Addition: Table BlowHoleStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleStepBean (" +
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
		 * Addition: Column id is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column key is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		/**
		 * Addition: Column direction is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		
		/**
		 * Addition: Column address2 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		
		/**
		 * Addition: FK postStaticStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		
		/**
		 * Addition: FK depressureMainStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		
		
		/**
		 * Addition: Column name is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		
		
		
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		/**
		 * Addition: Column email is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		/**
		 * Addition: Column id is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReportTemplateBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column status is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column discharge is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN discharge VARCHAR(255);");
		
		
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection DOUBLE;");
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		
		
		
		
		/**
		 * Addition: Column chosenInitialConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN chosenInitialConcentration DOUBLE;");
		/**
		 * Addition: Column roI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		/**
		 * Addition: Column id is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column measuredTemperature is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredTemperature DOUBLE;");
		/**
		 * Addition: Column pressureGoal is added to BlowHoleStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleStepBean ADD COLUMN pressureGoal DOUBLE;");
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight DOUBLE;");
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		/**
		 * Addition: Column id is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK project is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(blowholeconfiguration_ID) REFERENCES BlowHoleConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume DOUBLE;");
		/**
		 * Addition: FK blowholeconfiguration is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(blowholeconfiguration_ID) REFERENCES BlowHoleConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		
		/**
		 * Addition: Column numberOfPoint is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN numberOfPoint INTEGER;");
		
		
		
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime DOUBLE;");
		/**
		 * Addition: Column city is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		/**
		 * Addition: Column name is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column kind is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		
		
		/**
		 * Addition: Column prescribedFinalConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN prescribedFinalConcentration DOUBLE;");
		
		/**
		 * Addition: FK technician is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column description is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column person is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		
		/**
		 * Addition: Column chosenFinalConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN chosenFinalConcentration DOUBLE;");
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		/**
		 * Addition: Column id is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		/**
		 * Addition: Column name is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReportTemplateBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		/**
		 * Addition: Column description is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReportTemplateBean ADD COLUMN description VARCHAR(255);");
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume DOUBLE;");
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		/**
		 * Addition: Column n is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		/**
		 * Addition: Column id is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		
		/**
		 * Addition: Column id is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column forcedGazWeight is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN forcedGazWeight VARCHAR(255);");
		
		/**
		 * Addition: Column id is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		/**
		 * Addition: Column lowTarget is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN lowTarget DOUBLE;");
		/**
		 * Addition: Column kind is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		
		
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		
		
		/**
		 * Addition: Column boundInitialConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN boundInitialConcentration BOOLEAN;");
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column status is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		/**
		 * Addition: FK gaz is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_ID) REFERENCES GazBean(ID);");
		
		
		
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		/**
		 * Addition: Column id is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: FK image is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE ReportTemplateBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: FK firmMoe is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		/**
		 * Addition: FK firmCustomer is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight DOUBLE;");
		/**
		 * Addition: Column pointDirection is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN pointDirection VARCHAR(255);");
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		
		/**
		 * Addition: Column volume is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto BOOLEAN;");
		/**
		 * Addition: Column id is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		/**
		 * Addition: Column id is added to Device
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column weight is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		/**
		 * Addition: Column blowHoleSafetyFactor is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN blowHoleSafetyFactor DOUBLE;");
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		/**
		 * Addition: Column siret is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		/**
		 * Addition: Column elaIncluded is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN elaIncluded BOOLEAN;");
		/**
		 * Addition: Column weight is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		/**
		 * Addition: FK pressureEventStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume DOUBLE;");
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		
		/**
		 * Addition: Column phone is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		/**
		 * Addition: Column id is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK image is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE ContactBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		
		
		/**
		 * Addition: Column id is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column reference is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN reference VARCHAR(255);");
		
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight DOUBLE;");
		/**
		 * Addition: Column status is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN status VARCHAR(255);");
		/**
		 * Addition: Column measuredPressure is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredPressure DOUBLE;");
		
		/**
		 * Addition: Column ela is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN ela DOUBLE;");
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		/**
		 * Addition: Column id is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		/**
		 * Addition: Column cl is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN cl DOUBLE;");
		
		/**
		 * Addition: Column loaelConcentration is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN loaelConcentration DOUBLE;");
		/**
		 * Addition: Column highTarget is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN highTarget DOUBLE;");
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		
		
		
		/**
		 * Addition: Column prescribedTemperature is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN prescribedTemperature DOUBLE;");
		/**
		 * Addition: Column name is added to BottleType
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column totalLoadToInstall is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN totalLoadToInstall DOUBLE;");
		/**
		 * Addition: Column roE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		/**
		 * Addition: Column id is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: FK pressureMainStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor DOUBLE;");
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		
		/**
		 * Addition: Column kind is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReportTemplateBean ADD COLUMN kind VARCHAR(255);");
		/**
		 * Addition: Column vl is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN vl DOUBLE;");
		/**
		 * Addition: Column deltaPm is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN deltaPm DOUBLE;");
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		
		/**
		 * Addition: Column referencePressureType is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN referencePressureType VARCHAR(255);");
		/**
		 * Addition: Column name is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: FK risque is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		
		/**
		 * Addition: Column prescribedPressure is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN prescribedPressure DOUBLE;");
		
		/**
		 * Addition: Column direction is added to BlowHoleStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleStepBean ADD COLUMN direction VARCHAR(255);");
		/**
		 * Addition: Column referencePressure is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN referencePressure DOUBLE;");
		/**
		 * Addition: Column id is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column id is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column file is added to ReportTemplate
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReportTemplateBean ADD COLUMN file VARCHAR(255);");
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		
		/**
		 * Addition: FK depressureEventStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		/**
		 * Addition: Column highUp is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN highUp INTEGER;");
		/**
		 * Addition: Column fanFlow is added to Reading
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanFlow DOUBLE;");
		/**
		 * Addition: Column date is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		
		/**
		 * Addition: Column status is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		
		/**
		 * Addition: Column prescribedRetention is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN prescribedRetention DOUBLE;");
		/**
		 * Addition: FK firmMaintenance is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		
		
		/**
		 * Addition: Column id is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StepBean ADD COLUMN id BIGINT;");
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		/**
		 * Addition: Column n is added to Point
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PointBean ADD COLUMN n DOUBLE;");
		
		/**
		 * Addition: Column cl is added to MainStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		
		
		/**
		 * Addition: Column name is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		/**
		 * Addition: FK bottletype is added to BottleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE BottleConfigurationBean ADD FOREIGN KEY(gazConfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE BottleConfigurationBean ADD FOREIGN KEY(bottletype_ID) REFERENCES BottleTypeBean(ID);");
		
		/**
		 * Addition: FK calibrationStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		
		
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		/**
		 * Addition: Column deltaP is added to StaticStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.StaticStepBean ADD COLUMN deltaP DOUBLE;");
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling DOUBLE;");
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		/**
		 * Addition: Column id is added to Risque
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN id BIGINT;");
		
		/**
		 * Addition: FK image is added to Project
		 */
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		
		/**
		 * Addition: FK sample is added to Step
		 */
		jdbcTemplate.execute("ALTER TABLE StepBean ADD FOREIGN KEY(sample_ID) REFERENCES SampleBean(ID);");
		
		/**
		 * Addition: Column commissioningDate is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN commissioningDate INTEGER;");
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight DOUBLE;");
		
		/**
		 * Addition: FK preStaticStep is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureEventStep_ID) REFERENCES BlowHoleStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(calibrationStep_ID) REFERENCES CalibrationStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(postStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(preStaticStep_ID) REFERENCES StaticStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(depressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(pressureMainStep_ID) REFERENCES MainStepBean(ID) ON DELETE CASCADE;");
		
		/**
		 * Addition: Column elevation is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN elevation INTEGER;");
		
		/**
		 * Addition: Column referencePressureJustification is added to BlowHoleConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleConfigurationBean ADD COLUMN referencePressureJustification VARCHAR(255);");
		
		
		/**
		 * Addition: Column preview is added to PersistentImage
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN preview VARCHAR(255);");
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		/**
		 * Addition: Column prescribedInitialConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN prescribedInitialConcentration DOUBLE;");
		/**
		 * Addition: Column date is added to Sample
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		/**
		 * Addition: Column installedInitialConcentration is added to GazConfiguration
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN installedInitialConcentration DOUBLE;");
		/**
		 * Addition: Column openingPressure is added to BlowHole
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN openingPressure DOUBLE;");
		/**
		 * Addition: Column type is added to Gaz
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GazBean ADD COLUMN type VARCHAR(255);");
		
		/**
		 * Addition: Column holeSize is added to CalibrationStep
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN holeSize DOUBLE;");
		
		
		
		
		
		
		
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight DOUBLE;");
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		jdbcTemplate.execute("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");



	}
}


