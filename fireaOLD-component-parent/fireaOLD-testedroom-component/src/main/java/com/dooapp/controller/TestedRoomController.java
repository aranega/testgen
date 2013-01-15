package com.dooapp.controller;

import fireaOLD.wrapper.TestedRoom;

import com.dooapp.lib.controller.AbstractController;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.scene.Node;
import java.util.ResourceBundle;
import java.net.URL;
import  javafx.scene.control.TableView;
import  javafx.scene.control.ComboBox;
import  javafx.scene.control.TextField;
import fireaOLD.wrappers.BlowHole;

//Start of user code for imports
// TODO: import me!
//End of user code

//



@Singleton
public class TestedRoomController extends AbstractController<Node> implements javafx.fxml.Initializable 
{
	/**
	 * The logger
	 */
	private static final Logger logger = LoggerFactory.getLogger(TestedRoomController.class);
	@javafx.fxml.FXML
	private TextField altitude_data;
	@javafx.fxml.FXML
	private ComboBox<BlowHole> blowholes_data;
	@javafx.fxml.FXML
	private TableView<BlowHole> blowholes_dataview;
	@javafx.fxml.FXML
	private TextField choosenProtectedHeight_data;
	@javafx.fxml.FXML
	private TextField clapetsCF_data;
	@javafx.fxml.FXML
	private TextField climDuct_data;
	@javafx.fxml.FXML
	private TextField climReclycleAuto_data;
	@javafx.fxml.FXML
	private TextField climReclycle_data;
	@javafx.fxml.FXML
	private TextField climVMCAuto_data;
	@javafx.fxml.FXML
	private TextField climVMC_data;
	@javafx.fxml.FXML
	private TextField climWithNewAirAuto_data;
	@javafx.fxml.FXML
	private TextField climWithNewAir_data;
	@javafx.fxml.FXML
	private TextField commissioningDate_data;
	@javafx.fxml.FXML
	private TextField creationDate_data;
	@javafx.fxml.FXML
	private TextField droppedCeiling_data;
	@javafx.fxml.FXML
	private TextField droppedFloor_data;
	@javafx.fxml.FXML
	private TextField id_data;
	@javafx.fxml.FXML
	private TextField indicatedVolume_data;
	@javafx.fxml.FXML
	private TextField mainHeight_data;
	@javafx.fxml.FXML
	private TextField measuredVolume_data;
	@javafx.fxml.FXML
	private TextField mecanicalStrength_data;
	@javafx.fxml.FXML
	private TextField minimalProtectedHeight_data;
	@javafx.fxml.FXML
	private TextField name_data;
	@javafx.fxml.FXML
	private TextField netVolume_data;
	@javafx.fxml.FXML
	private TextField risqueHeightPercent_data;
	@javafx.fxml.FXML
	private TextField risqueHeight_data;
	@javafx.fxml.FXML
	private TextField totalHeight_data;
	@javafx.fxml.FXML
	private TextField uniformHorizontality_data;
	@javafx.fxml.FXML
	private TextField unloadTime_data;
	@javafx.fxml.FXML
	private TextField updateDate_data;
	@javafx.fxml.FXML
	private TextField version_data;
	@javafx.fxml.FXML
	private TextField volumeCorrection_data;
	//Start of user code for attributes
	// Other attributes
	//End of user code

	/*
 	 * Handled Wrapper
	 *
	 */
	private TestedRoom testedRoom;

	/*
 	 * Handled ResourceBundle
	 *
	 */
	@Inject
	private ResourceBundle rb;

	public void setTestedRoom(TestedRoom wrapper){
		this.testedRoom = wrapper;
	}
	
	public void initialize(URL args0, ResourceBundle args1){
		altitude_data.setText(String.valueOf(testedRoom.getAltitude()));
		this.binder.configureBindingBidirectional(altitude_data.textProperty(), testedRoom.altitudeProperty());
		choosenProtectedHeight_data.setText(String.valueOf(testedRoom.getChoosenProtectedHeight()));
		this.binder.configureBindingBidirectional(choosenProtectedHeight_data.textProperty(), testedRoom.choosenProtectedHeightProperty());
		clapetsCF_data.setText(String.valueOf(testedRoom.getClapetsCF()));
		this.binder.configureBindingBidirectional(clapetsCF_data.textProperty(), testedRoom.clapetsCFProperty());
		climDuct_data.setText(String.valueOf(testedRoom.getClimDuct()));
		this.binder.configureBindingBidirectional(climDuct_data.textProperty(), testedRoom.climDuctProperty());
		climReclycleAuto_data.setText(String.valueOf(testedRoom.getClimReclycleAuto()));
		this.binder.configureBindingBidirectional(climReclycleAuto_data.textProperty(), testedRoom.climReclycleAutoProperty());
		climReclycle_data.setText(String.valueOf(testedRoom.getClimReclycle()));
		this.binder.configureBindingBidirectional(climReclycle_data.textProperty(), testedRoom.climReclycleProperty());
		climVMCAuto_data.setText(String.valueOf(testedRoom.getClimVMCAuto()));
		this.binder.configureBindingBidirectional(climVMCAuto_data.textProperty(), testedRoom.climVMCAutoProperty());
		climVMC_data.setText(String.valueOf(testedRoom.getClimVMC()));
		this.binder.configureBindingBidirectional(climVMC_data.textProperty(), testedRoom.climVMCProperty());
		climWithNewAirAuto_data.setText(String.valueOf(testedRoom.getClimWithNewAirAuto()));
		this.binder.configureBindingBidirectional(climWithNewAirAuto_data.textProperty(), testedRoom.climWithNewAirAutoProperty());
		climWithNewAir_data.setText(String.valueOf(testedRoom.getClimWithNewAir()));
		this.binder.configureBindingBidirectional(climWithNewAir_data.textProperty(), testedRoom.climWithNewAirProperty());
		commissioningDate_data.setText(String.valueOf(testedRoom.getCommissioningDate()));
		this.binder.configureBindingBidirectional(commissioningDate_data.textProperty(), testedRoom.commissioningDateProperty());
		creationDate_data.setText(String.valueOf(testedRoom.getCreationDate()));
		this.binder.configureBindingBidirectional(creationDate_data.textProperty(), testedRoom.creationDateProperty());
		droppedCeiling_data.setText(String.valueOf(testedRoom.getDroppedCeiling()));
		this.binder.configureBindingBidirectional(droppedCeiling_data.textProperty(), testedRoom.droppedCeilingProperty());
		droppedFloor_data.setText(String.valueOf(testedRoom.getDroppedFloor()));
		this.binder.configureBindingBidirectional(droppedFloor_data.textProperty(), testedRoom.droppedFloorProperty());
		id_data.setText(String.valueOf(testedRoom.getId()));
		this.binder.configureBindingBidirectional(id_data.textProperty(), testedRoom.idProperty());
		indicatedVolume_data.setText(String.valueOf(testedRoom.getIndicatedVolume()));
		this.binder.configureBindingBidirectional(indicatedVolume_data.textProperty(), testedRoom.indicatedVolumeProperty());
		mainHeight_data.setText(String.valueOf(testedRoom.getMainHeight()));
		this.binder.configureBindingBidirectional(mainHeight_data.textProperty(), testedRoom.mainHeightProperty());
		measuredVolume_data.setText(String.valueOf(testedRoom.getMeasuredVolume()));
		this.binder.configureBindingBidirectional(measuredVolume_data.textProperty(), testedRoom.measuredVolumeProperty());
		mecanicalStrength_data.setText(String.valueOf(testedRoom.getMecanicalStrength()));
		this.binder.configureBindingBidirectional(mecanicalStrength_data.textProperty(), testedRoom.mecanicalStrengthProperty());
		minimalProtectedHeight_data.setText(String.valueOf(testedRoom.getMinimalProtectedHeight()));
		this.binder.configureBindingBidirectional(minimalProtectedHeight_data.textProperty(), testedRoom.minimalProtectedHeightProperty());
		name_data.setText(String.valueOf(testedRoom.getName()));
		this.binder.configureBindingBidirectional(name_data.textProperty(), testedRoom.nameProperty());
		netVolume_data.setText(String.valueOf(testedRoom.getNetVolume()));
		this.binder.configureBindingBidirectional(netVolume_data.textProperty(), testedRoom.netVolumeProperty());
		risqueHeightPercent_data.setText(String.valueOf(testedRoom.getRisqueHeightPercent()));
		this.binder.configureBindingBidirectional(risqueHeightPercent_data.textProperty(), testedRoom.risqueHeightPercentProperty());
		risqueHeight_data.setText(String.valueOf(testedRoom.getRisqueHeight()));
		this.binder.configureBindingBidirectional(risqueHeight_data.textProperty(), testedRoom.risqueHeightProperty());
		totalHeight_data.setText(String.valueOf(testedRoom.getTotalHeight()));
		this.binder.configureBindingBidirectional(totalHeight_data.textProperty(), testedRoom.totalHeightProperty());
		uniformHorizontality_data.setText(String.valueOf(testedRoom.getUniformHorizontality()));
		this.binder.configureBindingBidirectional(uniformHorizontality_data.textProperty(), testedRoom.uniformHorizontalityProperty());
		unloadTime_data.setText(String.valueOf(testedRoom.getUnloadTime()));
		this.binder.configureBindingBidirectional(unloadTime_data.textProperty(), testedRoom.unloadTimeProperty());
		updateDate_data.setText(String.valueOf(testedRoom.getUpdateDate()));
		this.binder.configureBindingBidirectional(updateDate_data.textProperty(), testedRoom.updateDateProperty());
		version_data.setText(String.valueOf(testedRoom.getVersion()));
		this.binder.configureBindingBidirectional(version_data.textProperty(), testedRoom.versionProperty());
		volumeCorrection_data.setText(String.valueOf(testedRoom.getVolumeCorrection()));
		this.binder.configureBindingBidirectional(volumeCorrection_data.textProperty(), testedRoom.volumeCorrectionProperty());
	}

	@javafx.fxml.FXML
	public void handleCancelButtonAction () 
	{
		//Start of user code handleCancelButtonAction
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void handleSubmitButtonAction () 
	{
		//Start of user code handleSubmitButtonAction
		// TODO: implement me! 
		//End of user code	
	}

	@javafx.fxml.FXML
	public void selectBlowholes () 
	{
		//Start of user code selectBlowholes
		// TODO: implement me! 
		//End of user code	
	}


	

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void registerObservables() {
		//Start of user code user code register observables
		//End of user code
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void onFirstView() {
		//Start of user code user code first view
		//End of user code
	}
	

	

	//Start of user code for methods
	// Other methods
	//End of user code
}
