/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column surface is added to BlowHole
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Table Reading
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Table Point
		Addition: Column climDuct is added to TestedRoom
		Addition: Table Project
		Addition: Column netVolume is added to TestedRoom
		Addition: Column volume is added to BottleType
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Domain ProjectKind (nothing to do)
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column load is added to BottleConfiguration
		Addition: FK project is added to TestedRoom
		Addition: Column direction is added to EventStep
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: FK gazconfiguration is added to Project
		Addition: Entry PRESSURE in Direction (nothing to do)
		Addition: Domain ContactKind (nothing to do)
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column name is added to BottleType
		Addition: FK step is added to Point
		Addition: Column density is added to Gaz
		Addition: Column climReclycle is added to TestedRoom
		Addition: Domain AirPressureCalculationMethod (nothing to do)
		Addition: Column status is added to Step
		Addition: Table PersistentImageData
		Addition: Column weight is added to Gaz
		Addition: FK firmMoe is added to Project
		Addition: FK image is added to Contact
		
		Addition: Column quantity is added to BottleConfiguration
		Addition: Column name is added to Folder
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Column city is added to Contact
		Addition: Column kind is added to Contact
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: Column n is added to MainStep
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Entry VOLUME_NEW in BottleUnit (nothing to do)
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Table Folder
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Column lastCalibrationDate is added to Device
		Addition: Column dataId is added to PersistentImage
		Addition: FK gaugemode is added to Reading
		Addition: Domain BottleUnit (nothing to do)
		
		Addition: Table Contact
		Addition: Entry MIXED in GazWeight (nothing to do)
		
		Addition: Table Gaz
		Addition: Column phiIPercent is added to Sample
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: Table BottleConfiguration
		Addition: Column altitude is added to TestedRoom
		Addition: Column description is added to Project
		Addition: Column kind is added to Project
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column unit is added to BottleConfiguration
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Column date is added to Step
		Addition: Column roI is added to Sample
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: Column person is added to Contact
		Addition: Column slowUnloadingValue is added to GazConfiguration
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Column quantity is added to BlowHole
		Addition: Domain SampleStatus (nothing to do)
		Addition: FK image is added to Project
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Column pressureGoal is added to Point
		Addition: Column highUp is added to Sample
		Addition: Table BottleType
		Addition: Column gaugeType is added to GaugeMode
		Addition: Domain Direction (nothing to do)
		Addition: Column tetaI is added to Sample
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Column tetaE is added to Sample
		Addition: Table MainStep
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Column weight is added to BottleType
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column sourceFile is added to PersistentImage
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Column climVMC is added to TestedRoom
		Addition: Column cl is added to MainStep
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Column name is added to GaugeMode
		Addition: Column calculatedELA is added to MainStep
		Addition: Table CalibrationStep
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Domain GazWeight (nothing to do)
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: FK firmCustomer is added to Project
		Addition: Column title is added to PersistentImage
		Addition: Column displayOrder is added to Folder
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Column name is added to Gaz
		
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Column date is added to Sample
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Column email is added to Contact
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column airPressure is added to Sample
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Column name is added to Sample
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column Discharge is added to BlowHole
		Addition: Table EventStep
		Addition: Column name is added to Contact
		Addition: Column totalHeight is added to TestedRoom
		Addition: Table Sample
		Addition: Column phone is added to Contact
		Addition: Column name is added to TestedRoom
		Addition: Column buildingPressure is added to Reading
		Addition: FK point is added to Reading
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Table BlowHole
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Column lowFlow is added to Reading
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Table TestedRoom
		Addition: Table Device
		Addition: Table Risque
		
		Addition: Column zipCode is added to Contact
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Domain BeaufortScale (nothing to do)
		Addition: FK firmMaintenance is added to Project
		Addition: Column siret is added to Contact
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Table GaugeMode
		Addition: Column phiEPercent is added to Sample
		Addition: FK sample is added to Step
		
		Addition: Domain StepStatus (nothing to do)
		Addition: FK testedroom is added to BlowHole
		Addition: Column timeAverage is added to Reading
		Addition: Column key is added to Risque
		Addition: Column type is added to Gaz
		Addition: Column adress1 is added to Contact
		Addition: FK technician is added to Project
		Addition: FK risque is added to Project
		Addition: Column address2 is added to Contact
		Addition: Table GazConfiguration
		Addition: Table Step
		Addition: Column risqueHeight is added to TestedRoom
		Addition: FK project is added to Sample
		Addition: Column status is added to Sample
		Addition: Column direction is added to MainStep
		Addition: Column clapetsCF is added to TestedRoom
		
		Addition: Column correlation is added to MainStep
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: Domain Discharge (nothing to do)
		Addition: Column nameDo is added to Project
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Column roE is added to Sample
		Addition: Table PersistentImage
		Addition: Column error is added to PersistentImage
		Addition: Column data is added to PersistentImageData
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Column reference is added to Project
		
		
		Addition: Domain ProjectStatus (nothing to do)
		Addition: Column fanPressure is added to Reading
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column Status is added to Project
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Column measuredVolume is added to TestedRoom
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Column unloadTime is added to TestedRoom
		Addition: Column droppedCeiling is added to TestedRoom
		
		Addition: Column serialNumber is added to Device
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Column beaufortScale is added to Sample
		
		Addition: Column windMeasure is added to Sample
		Addition: Column mainHeight is added to TestedRoom
		Delete: FK a in D
		Delete: Table B
		Delete: Table D
		Delete: FK c in E
		Delete: Table C
		Delete: Table E
		Delete: Table A
		Delete: FK b in C
		Delete: FK d in A
		Delete: FK a in B
		Delete: FK e in C
		Delete: FK c in B
		Delete: FK b in A
**********************************************/

package com.dooapp.sql.migration.app;

import com.googlecode.flyway.core.api.migration.jdbc.JdbcMigration;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * 
 * @author Genmymodel
 *
 */
public class v1372164697226__migration implements JdbcMigration {
	/**
	 * {@inheritDoc}
	 */
	@Override
 	public void migrate(Connection connection) throws Exception {
     	PreparedStatement statement = null;
		
		/**
		 * Addition: Table Reading
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Point
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS PointBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Project
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		
		/**
		 * Addition: Table PersistentImageData
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Folder
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table Contact
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Gaz
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS GazBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table BottleConfiguration
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table BottleType
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table MainStep
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table CalibrationStep
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table EventStep
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Sample
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table BlowHole
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table TestedRoom
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Device
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Risque
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table GaugeMode
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table GazConfiguration
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Table Step
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Table PersistentImage
		 */
		statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY);" +
						"CREATE SEQUENCE IF NOT EXISTS seq START WITH 1;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column surface is added to BlowHole
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN surface DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		
		/**
		 * Addition: Column climDuct is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climDuct BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column netVolume is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN netVolume INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column volume is added to BottleType
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN volume DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column load is added to BottleConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN load DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK project is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE TestedRoomBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column direction is added to EventStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.EventStepBean ADD COLUMN direction VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column afterHoleELA is added to CalibrationStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN afterHoleELA DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK gazconfiguration is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column climWithNewAir is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAir BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to BottleType
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column density is added to Gaz
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazBean ADD COLUMN density DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column climReclycle is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycle BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column status is added to Step
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.StepBean ADD COLUMN status VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column weight is added to Gaz
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazBean ADD COLUMN weight VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK firmMoe is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: FK image is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE ContactBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column quantity is added to BottleConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN quantity INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to Folder
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.FolderBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column city is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN city VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column kind is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN kind VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column n is added to MainStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN n DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column CommissioningDate is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN CommissioningDate TIMESTAMP;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column climWithNewAirAuto is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climWithNewAirAuto BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column minimalProtectedHeight is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN minimalProtectedHeight INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column lastCalibrationDate is added to Device
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN lastCalibrationDate TIMESTAMP;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column dataId is added to PersistentImage
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN dataId VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK gaugemode is added to Reading
		 */
		statement = connection.prepareStatement("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		
		
		/**
		 * Addition: Column phiIPercent is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiIPercent DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column climReclycleAuto is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climReclycleAuto BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column altitude is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN altitude INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column description is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN description VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column kind is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN kind VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column indicatedVolume is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN indicatedVolume INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column unit is added to BottleConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleConfigurationBean ADD COLUMN unit VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column date is added to Step
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.StepBean ADD COLUMN date TIMESTAMP;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column roI is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roI DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column person is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN person VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column slowUnloadingValue is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloadingValue DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column quantity is added to BlowHole
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN quantity INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK image is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column leekRepartitionPercent is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN leekRepartitionPercent DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column pressureGoal is added to Point
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PointBean ADD COLUMN pressureGoal DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column highUp is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN highUp INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column gaugeType is added to GaugeMode
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN gaugeType VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column tetaI is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaI DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column risqueHeightPercent is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeightPercent DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column volumeCorrection is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN volumeCorrection INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column tetaE is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN tetaE DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column slowUnloading is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN slowUnloading BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column weight is added to BottleType
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BottleTypeBean ADD COLUMN weight DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column climVMCAuto is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMCAuto BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column droppedCeilFull is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedCeilFull BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column sourceFile is added to PersistentImage
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN sourceFile VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column retentionGoal is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionGoal DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column climVMC is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN climVMC BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column cl is added to MainStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN cl DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column droppedFloor is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedFloor INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column name is added to GaugeMode
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GaugeModeBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column calculatedELA is added to MainStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN calculatedELA DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column droppedFloorFull is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN droppedFloorFull BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: FK firmCustomer is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column title is added to PersistentImage
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN title VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column displayOrder is added to Folder
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.FolderBean ADD COLUMN displayOrder INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column airPressureCalculationMethod is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressureCalculationMethod VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to Gaz
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column date is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN date TIMESTAMP;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column errorPercent is added to CalibrationStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN errorPercent DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column email is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN email VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column airPressure is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN airPressure INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column beforeHoleELA is added to CalibrationStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.CalibrationStepBean ADD COLUMN beforeHoleELA DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column mecanicalStrength is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mecanicalStrength INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column Discharge is added to BlowHole
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.BlowHoleBean ADD COLUMN Discharge VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column totalHeight is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN totalHeight INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column phone is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN phone VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column name is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN name VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column buildingPressure is added to Reading
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN buildingPressure DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column uniformHorizontality is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN uniformHorizontality BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column lowFlow is added to Reading
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN lowFlow BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column zipCode is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN zipCode VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: FK firmMaintenance is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column siret is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN siret VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column phiEPercent is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN phiEPercent DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		
		/**
		 * Addition: Column timeAverage is added to Reading
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN timeAverage INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column key is added to Risque
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.RisqueBean ADD COLUMN key VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column type is added to Gaz
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazBean ADD COLUMN type INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column adress1 is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN adress1 VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: FK technician is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: FK risque is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMaintenance_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmCustomer_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(technician_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(firmMoe_ID) REFERENCES ContactBean(ID);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		statement = connection.prepareStatement("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID) ON DELETE CASCADE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column address2 is added to Contact
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ContactBean ADD COLUMN address2 VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column risqueHeight is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN risqueHeight INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column status is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN status VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column direction is added to MainStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN direction VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column clapetsCF is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN clapetsCF BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column correlation is added to MainStep
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.MainStepBean ADD COLUMN correlation DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column nameDo is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN nameDo VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column roE is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN roE DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column error is added to PersistentImage
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PersistentImageBean ADD COLUMN error BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column data is added to PersistentImageData
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.PersistentImageDataBean ADD COLUMN data VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column choosenProtectedHeight is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN choosenProtectedHeight INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column retentionInterface is added to GazConfiguration
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.GazConfigurationBean ADD COLUMN retentionInterface BOOLEAN;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column reference is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN reference VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column fanPressure is added to Reading
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ReadingBean ADD COLUMN fanPressure DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column Status is added to Project
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.ProjectBean ADD COLUMN Status VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column measuredVolume is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN measuredVolume INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column unloadTime is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN unloadTime INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column droppedCeiling is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN droppedCeiling INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column serialNumber is added to Device
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.DeviceBean ADD COLUMN serialNumber VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		
		/**
		 * Addition: Column beaufortScale is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN beaufortScale VARCHAR(255);");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		
		/**
		 * Addition: Column windMeasure is added to Sample
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.SampleBean ADD COLUMN windMeasure DOUBLE;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}
		/**
		 * Addition: Column mainHeight is added to TestedRoom
		 */
		statement = connection.prepareStatement("ALTER TABLE PUBLIC.TestedRoomBean ADD COLUMN mainHeight INTEGER;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}

		/**
		 * Delete: FK a in D
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.DBean DROP CONSTRAINT IF EXISTS a;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK c in E
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.EBean DROP CONSTRAINT IF EXISTS c;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK b in C
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.CBean DROP CONSTRAINT IF EXISTS b;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK d in A
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.ABean DROP CONSTRAINT IF EXISTS d;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK a in B
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.BBean DROP CONSTRAINT IF EXISTS a;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK e in C
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.CBean DROP CONSTRAINT IF EXISTS e;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK c in B
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.BBean DROP CONSTRAINT IF EXISTS c;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: FK b in A
		 */
		/**
		 * WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A FK IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/*statement = connection.prepareStatement("ALTER TABLE PUBLIC.ABean DROP CONSTRAINT IF EXISTS b;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/


		/**
		 * Delete: Table B
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/* statement = connection.prepareStatement("DROP TABLE PUBLIC.BBean;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: Table D
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/* statement = connection.prepareStatement("DROP TABLE PUBLIC.DBean;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: Table C
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/* statement = connection.prepareStatement("DROP TABLE PUBLIC.CBean;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: Table E
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/* statement = connection.prepareStatement("DROP TABLE PUBLIC.EBean;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
		/**
		 * Delete: Table A
		 */
		/**
		 * WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!
		 */
		throw new UnsupportedOperationException("WARNING A TABLE IS REMOVED, CHECK IF YOU REALLY WANT TO ERASE IT!");
		/* statement = connection.prepareStatement("DROP TABLE PUBLIC.ABean;");
		try {
			statement.execute();
		} finally {
			statement.close();
		}*/
       
    }
}


