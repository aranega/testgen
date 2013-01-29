/*********************************************
	@
	@ WARNING: DO NOT DELETE THIS FILE!
	@
	version GenMyModel
	http://www.genmymodel.com

	Generator version: 28 December 2012

	Operations :
		Addition: Column adress1 is added to Contact
		Addition: Column roI is added to Sample
		Addition: Entry MIXED in GazWeight (nothing to do)
		Addition: Column cl is added to MainStep
		Addition: FK firmMoe is added to Project
		Addition: Column retentionInterface is added to GazConfiguration
		Addition: Table PersistentImage
		Addition: Column minimalProtectedHeight is added to TestedRoom
		Addition: Entry ERROR in SampleStatus (nothing to do)
		Addition: Column title is added to PersistentImage
		Addition: Column afterHoleELA is added to CalibrationStep
		Addition: Column indicatedVolume is added to TestedRoom
		Addition: Column n is added to MainStep
		Addition: Table Folder
		Addition: Column id is added to BottleConfiguration
		Addition: Column kind is added to Contact
		Addition: Entry DONE in ProjectStatus (nothing to do)
		Addition: Column id is added to GazConfiguration
		Addition: Entry NFPA_2000 in ProjectKind (nothing to do)
		Addition: Column direction is added to EventStep
		Addition: Entry DEPRESSURE in Direction (nothing to do)
		Addition: FK technician is added to Project
		Addition: Entry WEIGHT in BottleUnit (nothing to do)
		Addition: Entry FORCE1 in BeaufortScale (nothing to do)
		Addition: Table Project
		
		Addition: Column slowUnloading is added to GazConfiguration
		Addition: Entry FIRM_CUSTOMER in ContactKind (nothing to do)
		Addition: Entry Positive in Discharge (nothing to do)
		Addition: Column volume is added to BottleType
		
		Addition: Table Gaz
		Addition: Column dataId is added to PersistentImage
		Addition: Column name is added to Sample
		Addition: Column unit is added to BottleConfiguration
		Addition: Entry TECHNICIAN in ContactKind (nothing to do)
		Addition: Column status is added to Step
		Addition: FK bottletype is added to BottleConfiguration
		Addition: Column id is added to Point
		Addition: Entry METEO_CENTER in AirPressureCalculationMethod (nothing to do)
		Addition: Domain invalid (nothing to do)
		
		Addition: Column calculatedELA is added to MainStep
		Addition: Column date is added to Step
		Addition: Column kind is added to Project
		
		Addition: Domain invalid (nothing to do)
		Addition: Column netVolume is added to TestedRoom
		Addition: Column weight is added to BottleType
		Addition: Column quantity is added to BlowHole
		Addition: Column id is added to Contact
		Addition: Table Point
		Addition: Domain invalid (nothing to do)
		Addition: Entry R13_APSAD in ProjectKind (nothing to do)
		Addition: Table PersistentImageData
		Addition: Column buildingPressure is added to Reading
		Addition: Domain invalid (nothing to do)
		Addition: Entry IN_PROGRESS in StepStatus (nothing to do)
		Addition: Column roE is added to Sample
		Addition: Table Step
		Addition: Column name is added to Folder
		Addition: FK image is added to Project
		Addition: Column name is added to Contact
		Addition: Column altitude is added to TestedRoom
		Addition: Column mecanicalStrength is added to TestedRoom
		Addition: Column id is added to Device
		Addition: Column uniformHorizontality is added to TestedRoom
		Addition: Table Reading
		Addition: Column person is added to Contact
		Addition: Column date is added to Sample
		Addition: Column unloadTime is added to TestedRoom
		Addition: Entry MEASURE in AirPressureCalculationMethod (nothing to do)
		Addition: Column airPressure is added to Sample
		Addition: Entry FIRM_MOE in ContactKind (nothing to do)
		Addition: Column name is added to GaugeMode
		Addition: Entry FORCE7 in BeaufortScale (nothing to do)
		Addition: Entry PRESSURE in Direction (nothing to do)
		
		Addition: Column tetaI is added to Sample
		Addition: FK firmMaintenance is added to Project
		Addition: Column measuredVolume is added to TestedRoom
		
		Addition: FK sample is added to Step
		Addition: Entry LIGHT in GazWeight (nothing to do)
		Addition: Entry FORCE8 in BeaufortScale (nothing to do)
		Addition: FK gaugemode is added to Reading
		Addition: Table Risque
		Addition: Column clapetsCF is added to TestedRoom
		Addition: Column fanPressure is added to Reading
		Addition: FK point is added to Reading
		Addition: Entry FORCE9 in BeaufortScale (nothing to do)
		Addition: Column phiEPercent is added to Sample
		Addition: Entry ISO_14520_2004 in ProjectKind (nothing to do)
		Addition: Column address2 is added to Contact
		Addition: FK project is added to TestedRoom
		Addition: Column nameDo is added to Project
		Addition: Entry VOLUME_NEW in BottleUnit (nothing to do)
		Addition: Column density is added to Gaz
		Addition: Column climWithNewAirAuto is added to TestedRoom
		Addition: Column climReclycle is added to TestedRoom
		Addition: Column quantity is added to BottleConfiguration
		Addition: Column name is added to Gaz
		Addition: Column name is added to BottleType
		Addition: Column description is added to Project
		Addition: Domain invalid (nothing to do)
		Addition: Column id is added to GaugeMode
		Addition: Column pressureGoal is added to Point
		Addition: Column beaufortScale is added to Sample
		Addition: Column lowFlow is added to Reading
		Addition: Column droppedCeiling is added to TestedRoom
		
		Addition: FK step is added to Point
		Addition: Table Device
		Addition: Column errorPercent is added to CalibrationStep
		Addition: Column id is added to Project
		Addition: Entry READY in StepStatus (nothing to do)
		Addition: Column highUp is added to Sample
		Addition: Column mainHeight is added to TestedRoom
		Addition: Table GazConfiguration
		Addition: Column airPressureCalculationMethod is added to Sample
		Addition: Column id is added to PersistentImageData
		Addition: FK gazconfiguration is added to BottleConfiguration
		Addition: Column city is added to Contact
		Addition: Column leekRepartitionPercent is added to GazConfiguration
		Addition: Entry ISO_14520_2006 in ProjectKind (nothing to do)
		Addition: Entry DONE in StepStatus (nothing to do)
		Addition: Column choosenProtectedHeight is added to TestedRoom
		Addition: Table GaugeMode
		Addition: Entry NO_STARTED in SampleStatus (nothing to do)
		Addition: Column key is added to Risque
		Addition: Column volumeCorrection is added to TestedRoom
		Addition: Domain invalid (nothing to do)
		Addition: FK firmCustomer is added to Project
		Addition: Entry FORCE2 in BeaufortScale (nothing to do)
		Addition: Column id is added to Risque
		Addition: Column status is added to Sample
		Addition: Entry WAIT_FOR_VALIDATION in StepStatus (nothing to do)
		Addition: Column timeAverage is added to Reading
		Addition: Column slowUnloadingValue is added to GazConfiguration
		
		Addition: Column risqueHeightPercent is added to TestedRoom
		Addition: Column surface is added to BlowHole
		Addition: Column phiIPercent is added to Sample
		Addition: Domain invalid (nothing to do)
		Addition: Column droppedCeilFull is added to GazConfiguration
		Addition: Column data is added to PersistentImageData
		Addition: Column id is added to Reading
		Addition: Entry FORCE4 in BeaufortScale (nothing to do)
		Addition: Table BottleConfiguration
		Addition: Column climVMCAuto is added to TestedRoom
		Addition: Column displayOrder is added to Folder
		Addition: FK testedroom is added to BlowHole
		Addition: Entry FORCE0 in BeaufortScale (nothing to do)
		Addition: Column climWithNewAir is added to TestedRoom
		Addition: Column retentionGoal is added to GazConfiguration
		Addition: Column reference is added to Project
		Addition: Table CalibrationStep
		Addition: Table TestedRoom
		Addition: Entry FORCE5 in BeaufortScale (nothing to do)
		Addition: Column lastCalibrationDate is added to Device
		
		Addition: Table BlowHole
		Addition: Entry ERROR in StepStatus (nothing to do)
		Addition: Column risqueHeight is added to TestedRoom
		Addition: Column direction is added to MainStep
		Addition: Entry HIGH_UP_CALCULATION in AirPressureCalculationMethod (nothing to do)
		Addition: Column id is added to BlowHole
		Addition: Column serialNumber is added to Device
		Addition: Column correlation is added to MainStep
		Addition: Column climReclycleAuto is added to TestedRoom
		Addition: FK image is added to Contact
		Addition: Entry DONE in SampleStatus (nothing to do)
		Addition: Column id is added to TestedRoom
		Addition: Entry Negative in Discharge (nothing to do)
		Addition: Entry FORCE6 in BeaufortScale (nothing to do)
		Addition: Table MainStep
		Addition: Column phone is added to Contact
		Addition: Column gaugeType is added to GaugeMode
		Addition: Column CommissioningDate is added to TestedRoom
		Addition: Column id is added to Folder
		Addition: Domain invalid (nothing to do)
		Addition: Table Contact
		Addition: Entry IN_PROGRESS in ProjectStatus (nothing to do)
		Addition: Column email is added to Contact
		Addition: Column windMeasure is added to Sample
		
		Addition: Column zipCode is added to Contact
		
		Addition: Column tetaE is added to Sample
		Addition: Entry TO_PLAN in ProjectStatus (nothing to do)
		Addition: Table BottleType
		Addition: Column droppedFloor is added to TestedRoom
		Addition: Column error is added to PersistentImage
		Addition: Column id is added to PersistentImage
		Addition: Domain invalid (nothing to do)
		Addition: Column id is added to Step
		Addition: Entry FIRM_MAINTENANCE in ContactKind (nothing to do)
		Addition: Column id is added to Gaz
		Addition: Column Status is added to Project
		Addition: Column load is added to BottleConfiguration
		Addition: Entry NO_STARTED in StepStatus (nothing to do)
		Addition: Entry NFPA_2008 in ProjectKind (nothing to do)
		Addition: Table EventStep
		Addition: Column climVMC is added to TestedRoom
		Addition: FK project is added to Sample
		Addition: FK gazconfiguration is added to Project
		Addition: Column droppedFloorFull is added to GazConfiguration
		Addition: Entry HEAVY in GazWeight (nothing to do)
		Addition: Table Sample
		Addition: Column Discharge is added to BlowHole
		Addition: FK risque is added to Project
		Addition: Entry STARTED in SampleStatus (nothing to do)
		Addition: Column id is added to BottleType
		Addition: Column id is added to Sample
		Addition: Column weight is added to Gaz
		Addition: Entry FORCE3 in BeaufortScale (nothing to do)
		Addition: Column climDuct is added to TestedRoom
		Addition: Column name is added to TestedRoom
		Addition: Column sourceFile is added to PersistentImage
		Addition: Domain invalid (nothing to do)
		Addition: Column siret is added to Contact
		Addition: Column beforeHoleELA is added to CalibrationStep
		Addition: Column type is added to Gaz
		Addition: Column totalHeight is added to TestedRoom
		Addition: Domain invalid (nothing to do)
**********************************************/

package invalid.sql.migration.app;

import org.springframework.jdbc.core.JdbcTemplate;

import com.googlecode.flyway.core.migration.java.JavaMigration;

/**
 * 
 * @author Genmymodel
 * 
 */
public class v1359449144145__migration implements JavaMigration {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void migrate(JdbcTemplate jdbcTemplate) throws Exception {	




	}
}


