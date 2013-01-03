/*********************************************
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 17 December 2012
**********************************************/

package com.dooapp.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class FireaInit implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	
		// ----
		// Create Hibernate Sequence, uncomment if needed
		// ----
		// jdbcTemplate.execute("CREATE SEQUENCE IF NOT EXISTS HIBERNATE_SEQUENCE START WITH 1 INCREMENT BY 1");


		/*
		 *  Table structure Contact
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ContactBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"person VARCHAR(255)," +
						"adress1 VARCHAR(255)," +
						"address2 VARCHAR(255)," +
						"zipCode VARCHAR(255)," +
						"city VARCHAR(255)," +
						"email VARCHAR(255)," +
						"phone VARCHAR(255)," +
						"siret VARCHAR(255)," +
						"kind VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure PersistentImage
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageBean (" +
						"ID BIGINT PRIMARY KEY," +
						"title VARCHAR(255)," +
						"sourceFile VARCHAR(255)," +
						"preview VARCHAR(255)," +
						"error BOOLEAN," +
						"dataId VARCHAR(255)," +
						"uuid CHAR(36)," +
						"contact_ID BIGINT);");
		
		/*
		 *  Table structure Folder
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS FolderBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"displayOrder INTEGER," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure PersistentImageData
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PersistentImageDataBean (" +
						"ID BIGINT PRIMARY KEY," +
						"DATACOLUMN VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure Project
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ProjectBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"description VARCHAR(255)," +
						"kind VARCHAR(255)," +
						"Status VARCHAR(255)," +
						"uuid CHAR(36)," +
						"risque_ID BIGINT," +
						"image_ID BIGINT," +
						"gazconfiguration_ID BIGINT);");
		
		/*
		 *  Table structure Risque
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS RisqueBean (" +
						"ID BIGINT PRIMARY KEY," +
						"KEYCOLUMN VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure TestedRoom
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS TestedRoomBean (" +
						"ID BIGINT PRIMARY KEY," +
						"CommissioningDate TIMESTAMP," +
						"altitude INTEGER," +
						"unloadTime INTEGER," +
						"mecanicalStrength INTEGER," +
						"droppedCeiling INTEGER," +
						"mainHeight INTEGER," +
						"droppedFloor INTEGER," +
						"totalHeight INTEGER," +
						"indicatedVolume INTEGER," +
						"measuredVolume INTEGER," +
						"volumeCorrection INTEGER," +
						"netVolume INTEGER," +
						"risqueHeight INTEGER," +
						"risqueHeightPercent DOUBLE," +
						"minimalProtectedHeight INTEGER," +
						"choosenProtectedHeight INTEGER," +
						"NAMECOLUMN VARCHAR(255)," +
						"uniformHorizontality BOOLEAN," +
						"climWithNewAir BOOLEAN," +
						"climReclycle BOOLEAN," +
						"climVMC BOOLEAN," +
						"climDuct BOOLEAN," +
						"climWithNewAirAuto BOOLEAN," +
						"climReclycleAuto BOOLEAN," +
						"climVMCAuto VARCHAR(255)," +
						"clapetsCF BOOLEAN," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure BlowHole
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BlowHoleBean (" +
						"ID BIGINT PRIMARY KEY," +
						"Discharge VARCHAR(255)," +
						"quantity INTEGER," +
						"surface DOUBLE," +
						"uuid CHAR(36)," +
						"testedroom_ID BIGINT);");
		
		/*
		 *  Table structure Gaz
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"TYPECOLUMN VARCHAR(255)," +
						"density DOUBLE," +
						"weight VARCHAR(255)," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure BottleType
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleTypeBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"weight DOUBLE," +
						"volume DOUBLE," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure GazConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GazConfigurationBean (" +
						"ID BIGINT PRIMARY KEY," +
						"retentionInterface BOOLEAN," +
						"droppedFloorFull BOOLEAN," +
						"droppedCeilFull BOOLEAN," +
						"slowUnloading BOOLEAN," +
						"slowUnloadingValue DOUBLE," +
						"retentionGoal DOUBLE," +
						"leekRepartitionPercent DOUBLE," +
						"uuid CHAR(36)," +
						"gaz_ID BIGINT);");
		
		/*
		 *  Table structure BottleConfiguration
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS BottleConfigurationBean (" +
						"ID BIGINT PRIMARY KEY," +
						"quantity INTEGER," +
						"LOADCOLUMN DOUBLE," +
						"unit VARCHAR(255)," +
						"uuid CHAR(36)," +
						"gazconfiguration_ID BIGINT," +
						"bottletype_ID BIGINT);");
		
		/*
		 *  Table structure Sample
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS SampleBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"DATECOLUMN TIMESTAMP," +
						"status VARCHAR(255)," +
						"airPressure INTEGER," +
						"airPressureCalculationMethod VARCHAR(255)," +
						"beaufortScale VARCHAR(255)," +
						"phiEPercent DOUBLE," +
						"phiIPercent DOUBLE," +
						"roI DOUBLE," +
						"roE DOUBLE," +
						"tetaI DOUBLE," +
						"tetaE DOUBLE," +
						"windMeasure DOUBLE," +
						"uuid CHAR(36)," +
						"project_ID BIGINT);");
		
		/*
		 *  Table structure Step
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS StepBean (" +
						"ID BIGINT PRIMARY KEY," +
						"status VARCHAR(255)," +
						"DATECOLUMN TIMESTAMP," +
						"uuid CHAR(36)," +
						"sample_ID BIGINT);");
		
		/*
		 *  Table structure Point
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PointBean (" +
						"ID BIGINT PRIMARY KEY," +
						"pressureGoal DOUBLE," +
						"uuid CHAR(36)," +
						"step_ID BIGINT);");
		
		/*
		 *  Table structure Reading
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS ReadingBean (" +
						"ID BIGINT PRIMARY KEY," +
						"buildingPressure DOUBLE," +
						"fanPressure DOUBLE," +
						"lowFlow BOOLEAN," +
						"timeAverage INTEGER," +
						"uuid CHAR(36)," +
						"point_ID BIGINT," +
						"gaugemode_ID BIGINT);");
		
		/*
		 *  Table structure Device
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS DeviceBean (" +
						"ID BIGINT PRIMARY KEY," +
						"serialNumber VARCHAR(255)," +
						"lastCalibrationDate TIMESTAMP," +
						"uuid CHAR(36));");
		
		/*
		 *  Table structure CalibrationStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS CalibrationStepBean (" +
						"ID BIGINT PRIMARY KEY," +
						"status VARCHAR(255)," +
						"DATECOLUMN TIMESTAMP," +
						"uuid CHAR(36)," +
						"beforeHoleELA DOUBLE," +
						"afterHoleELA DOUBLE," +
						"errorPercent DOUBLE," +
						"sample_ID BIGINT);");
		
		/*
		 *  Table structure EventStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS EventStepBean (" +
						"ID BIGINT PRIMARY KEY," +
						"status VARCHAR(255)," +
						"DATECOLUMN TIMESTAMP," +
						"uuid CHAR(36)," +
						"direction VARCHAR(255)," +
						"sample_ID BIGINT);");
		
		/*
		 *  Table structure MainStep
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS MainStepBean (" +
						"ID BIGINT PRIMARY KEY," +
						"status VARCHAR(255)," +
						"DATECOLUMN TIMESTAMP," +
						"uuid CHAR(36)," +
						"direction VARCHAR(255)," +
						"calculatedELA DOUBLE," +
						"correlation DOUBLE," +
						"n DOUBLE," +
						"cl DOUBLE," +
						"sample_ID BIGINT);");
		
		/*
		 *  Table structure GaugeMode
		 */
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GaugeModeBean (" +
						"ID BIGINT PRIMARY KEY," +
						"NAMECOLUMN VARCHAR(255)," +
						"gaugeType VARCHAR(255)," +
						"uuid CHAR(36));");
		

		
		
		
		
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS PROJECT_CONTACTS (" +
						"ProjectBean_ID BIGINT PRIMARY KEY," +
						"contacts_ID BIGINT," +
						"FOREIGN KEY(contacts_ID) REFERENCES ContactBean(ID));");					
		
		
		
		
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS GAZ_BOTTLETYPES (" +
						"GazBean_ID BIGINT PRIMARY KEY," +
						"bottletypes_ID BIGINT," +
						"FOREIGN KEY(bottletypes_ID) REFERENCES BottleTypeBean(ID));");					
		
		
		
		
		
		
		
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS READING_DEVICE (" +
						"ReadingBean_ID BIGINT PRIMARY KEY," +
						"device_ID BIGINT," +
						"FOREIGN KEY(device_ID) REFERENCES DeviceBean(ID));");					
		
		
		
		
		
		

		/*
		 * Relationships
		 */
		
		jdbcTemplate.execute("ALTER TABLE PersistentImageBean ADD FOREIGN KEY(contact_ID) REFERENCES ContactBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(risque_ID) REFERENCES RisqueBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(image_ID) REFERENCES PersistentImageBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ProjectBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		
		
		jdbcTemplate.execute("ALTER TABLE BlowHoleBean ADD FOREIGN KEY(testedroom_ID) REFERENCES TestedRoomBean(ID);");
		
		
		
		jdbcTemplate.execute("ALTER TABLE GazConfigurationBean ADD FOREIGN KEY(gaz_ID) REFERENCES GazBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE BottleConfigurationBean ADD FOREIGN KEY(gazconfiguration_ID) REFERENCES GazConfigurationBean(ID);");
		jdbcTemplate.execute("ALTER TABLE BottleConfigurationBean ADD FOREIGN KEY(bottletype_ID) REFERENCES BottleTypeBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE SampleBean ADD FOREIGN KEY(project_ID) REFERENCES ProjectBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE StepBean ADD FOREIGN KEY(sample_ID) REFERENCES SampleBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE PointBean ADD FOREIGN KEY(step_ID) REFERENCES StepBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(point_ID) REFERENCES PointBean(ID);");
		jdbcTemplate.execute("ALTER TABLE ReadingBean ADD FOREIGN KEY(gaugemode_ID) REFERENCES GaugeModeBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE CalibrationStepBean ADD FOREIGN KEY(sample_ID) REFERENCES SampleBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE EventStepBean ADD FOREIGN KEY(sample_ID) REFERENCES SampleBean(ID);");
		
		jdbcTemplate.execute("ALTER TABLE MainStepBean ADD FOREIGN KEY(sample_ID) REFERENCES SampleBean(ID);");
		
	}
}
