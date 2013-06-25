package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.entity.ProjectBean;
import com.dooapp.firea.wrapper.PersistentImage;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.Risque;


import com.dooapp.firea.enumeration.ProjectKind;
import com.dooapp.firea.enumeration.ProjectStatus;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public class ProjectBuilder<BUILDER extends ProjectBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ProjectStatus Status;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date creationDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private String description;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Contact firmCustomer;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Contact firmMaintenance;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Contact firmMoe;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private GazConfiguration gazconfiguration;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Long id;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private PersistentImage image;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private ProjectKind kind;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private String nameDo;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private String reference;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Risque risque;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Set<Sample> sample;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Contact technician;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private TestedRoom testedroom;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private java.util.Date updateDate;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private Integer version;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private GazConfigurationBuilder<?> gazConfigurationBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private SampleBuilder<?> sampleBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private TestedRoomBuilder<?> testedRoomBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private ContactBuilder<?> contactBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private PersistentImageBuilder<?> persistentImageBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
 	 */
	@javax.inject.Inject
	private RisqueBuilder<?> risqueBuilder;
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	java.util.Properties cfg;
	
	/**
	 * Just a helpful {@link DateFormat}
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@javax.inject.Inject
	protected ProjectBuilder() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected Project createValue() {
		return new Project(new ProjectBean());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Project build() throws NullPointerException {
		Project result =  this.createValue() ;
		if (Status == null) {
			handleDefaultStatus(result);
		} else {
			result.setStatus(Status);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (description == null) {
			handleDefaultDescription(result);
		} else {
			result.setDescription(description);
		}
		if (firmCustomer == null) {
			handleDefaultFirmCustomer(result);
		} else {
			result.setFirmCustomer(firmCustomer);
		}
		if (firmMaintenance == null) {
			handleDefaultFirmMaintenance(result);
		} else {
			result.setFirmMaintenance(firmMaintenance);
		}
		if (firmMoe == null) {
			handleDefaultFirmMoe(result);
		} else {
			result.setFirmMoe(firmMoe);
		}
		if (gazconfiguration == null) {
			handleDefaultGazconfiguration(result);
		} else {
				gazconfiguration.setProject(result);
			result.setGazconfiguration(gazconfiguration);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (image == null) {
			handleDefaultImage(result);
		} else {
			result.setImage(image);
		}
		if (kind == null) {
			handleDefaultKind(result);
		} else {
			result.setKind(kind);
		}
		if (nameDo == null) {
			handleDefaultNameDo(result);
		} else {
			result.setNameDo(nameDo);
		}
		if (reference == null) {
			handleDefaultReference(result);
		} else {
			result.setReference(reference);
		}
		if (risque == null) {
			handleDefaultRisque(result);
		} else {
			result.setRisque(risque);
		}
		if (sample == null) {
			handleDefaultSample(result);
		} else {
			result.getSample().addAll(sample);
		}
		if (technician == null) {
			handleDefaultTechnician(result);
		} else {
			result.setTechnician(technician);
		}
		if (testedroom == null) {
			handleDefaultTestedroom(result);
		} else {
			result.setTestedroom(testedroom);
		}
		if (updateDate == null) {
			handleDefaultUpdateDate(result);
		} else {
			result.setUpdateDate(updateDate);
		}
		if (version == null) {
			handleDefaultVersion(result);
		} else {
			result.setVersion(version);
		}
		return result;	
	}

	/*
	 * Generated getters and setters
	 */

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultStatus(Project result) {
		result.setStatus(ProjectStatus.valueOf(cfg.getProperty("defaultValue.Project.status", "TO_PLAN")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultCreationDate(Project result) {
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Project.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultDescription(Project result) {
		result.setDescription(cfg.getProperty("defaultValue.Project.description"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultFirmCustomer(Project result) throws NullPointerException {
		throw new NullPointerException("Project must be linked to a Contact via firmCustomer which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultFirmMaintenance(Project result) throws NullPointerException {
		throw new NullPointerException("Project must be linked to a Contact via firmMaintenance which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultFirmMoe(Project result) throws NullPointerException {
		throw new NullPointerException("Project must be linked to a Contact via firmMoe which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultGazconfiguration(Project result) throws RuntimeException {
		result.setGazconfiguration(gazConfigurationBuilder.project(result).build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultId(Project result) {
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Project.id", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultImage(Project result) throws RuntimeException {
		result.setImage(persistentImageBuilder.build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultKind(Project result) {
		result.setKind(ProjectKind.valueOf(cfg.getProperty("defaultValue.Project.kind", "R13_APSAD")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultNameDo(Project result) {
		result.setNameDo(cfg.getProperty("defaultValue.Project.nameDo"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultReference(Project result) {
		result.setReference(cfg.getProperty("defaultValue.Project.reference"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultRisque(Project result) throws NullPointerException {
		throw new NullPointerException("Project must be linked to a Risque via risque which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultSample(Project result) throws NullPointerException {
		// do nothing
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultTechnician(Project result) throws NullPointerException {
		throw new NullPointerException("Project must be linked to a Contact via technician which has not been set.");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultTestedroom(Project result) throws RuntimeException {
		result.setTestedroom(testedRoomBuilder.project(result).build());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultUpdateDate(Project result) {
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Project.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	protected void handleDefaultVersion(Project result) {
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Project.version", "0")));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER Status(ProjectStatus myStatus) {
		this.Status = myStatus;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER description(String myDescription) {
		this.description = myDescription;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER firmCustomer(Contact myFirmCustomer) {
		this.firmCustomer = myFirmCustomer;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER firmMaintenance(Contact myFirmMaintenance) {
		this.firmMaintenance = myFirmMaintenance;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER firmMoe(Contact myFirmMoe) {
		this.firmMoe = myFirmMoe;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER gazconfiguration(GazConfiguration myGazconfiguration) {
		this.gazconfiguration = myGazconfiguration;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER image(PersistentImage myImage) {
		this.image = myImage;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER kind(ProjectKind myKind) {
		this.kind = myKind;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER nameDo(String myNameDo) {
		this.nameDo = myNameDo;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER reference(String myReference) {
		this.reference = myReference;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER risque(Risque myRisque) {
		this.risque = myRisque;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER sample(Sample... mySample) {
		this.sample = new java.util.HashSet<Sample>(java.util.Arrays.asList(mySample));
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER technician(Contact myTechnician) {
		this.technician = myTechnician;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER testedroom(TestedRoom myTestedroom) {
		this.testedroom = myTestedroom;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

}
