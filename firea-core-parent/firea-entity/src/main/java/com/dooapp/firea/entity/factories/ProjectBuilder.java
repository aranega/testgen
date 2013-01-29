package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.PersistentImage;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.wrapper.Risque;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for Project Builder
 * End of user code -->
 */

public class ProjectBuilder<BUILDER extends ProjectBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	
	private String Status;
	
	private java.util.Date creationDate;
	
	private String description;
	
	private Contact firmCustomer;
	
	private Contact firmMaintenance;
	
	private Contact firmMoe;
	
	private GazConfiguration gazconfiguration;
	
	private Long id;
	
	private PersistentImage image;
	
	private String kind;
	
	private String nameDo;
	
	private String reference;
	
	private Risque risque;
	
	private java.util.Set<Sample> sample;
	
	private Contact technician;
	
	private TestedRoom testedroom;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	TestedRoomBuilder<?> testedRoomBuilder;
	@javax.inject.Inject
	PersistentImageBuilder<?> persistentImageBuilder;
	@javax.inject.Inject
	ContactBuilder<?> contactBuilder;
	@javax.inject.Inject
	RisqueBuilder<?> risqueBuilder;
	@javax.inject.Inject
	SampleBuilder<?> sampleBuilder;
	@javax.inject.Inject
	GazConfigurationBuilder<?> gazConfigurationBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for Project getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected ProjectBuilder() {
	}
	
	protected Project createValue() {
		return new Project();
	}
	
	/*
	 * <!-- Start of user code comment for Project build method
	 * End of user code -->
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
			result.sampleProperty().get().addAll(sample);
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
	/*
	 * <!-- Start of user code comment for Status default method
	 * End of user code -->
	 */
	private void handleDefaultStatus(Project result) {
		// Start of user code default feature for handleDefaultStatus
		result.setStatus(cfg.getProperty("defaultValue.Project.status"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(Project result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Project.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for description default method
	 * End of user code -->
	 */
	private void handleDefaultDescription(Project result) {
		// Start of user code default feature for handleDefaultDescription
		result.setDescription(cfg.getProperty("defaultValue.Project.description"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for firmCustomer default method
	 * End of user code -->
	 */
	private void handleDefaultFirmCustomer(Project result) {
		// Start of user code default feature for handleDefaultFirmCustomer
		result.setFirmCustomer(contactBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for firmMaintenance default method
	 * End of user code -->
	 */
	private void handleDefaultFirmMaintenance(Project result) {
		// Start of user code default feature for handleDefaultFirmMaintenance
		result.setFirmMaintenance(contactBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for firmMoe default method
	 * End of user code -->
	 */
	private void handleDefaultFirmMoe(Project result) {
		// Start of user code default feature for handleDefaultFirmMoe
		result.setFirmMoe(contactBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration default method
	 * End of user code -->
	 */
	private void handleDefaultGazconfiguration(Project result) {
		// Start of user code default feature for handleDefaultGazconfiguration
		result.setGazconfiguration(gazConfigurationBuilder.project(result).build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Project result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Project.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for image default method
	 * End of user code -->
	 */
	private void handleDefaultImage(Project result) {
		// Start of user code default feature for handleDefaultImage
		result.setImage(persistentImageBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for kind default method
	 * End of user code -->
	 */
	private void handleDefaultKind(Project result) {
		// Start of user code default feature for handleDefaultKind
		result.setKind(cfg.getProperty("defaultValue.Project.kind"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for nameDo default method
	 * End of user code -->
	 */
	private void handleDefaultNameDo(Project result) {
		// Start of user code default feature for handleDefaultNameDo
		result.setNameDo(cfg.getProperty("defaultValue.Project.nameDo"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for reference default method
	 * End of user code -->
	 */
	private void handleDefaultReference(Project result) {
		// Start of user code default feature for handleDefaultReference
		result.setReference(cfg.getProperty("defaultValue.Project.reference"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for risque default method
	 * End of user code -->
	 */
	private void handleDefaultRisque(Project result) {
		// Start of user code default feature for handleDefaultRisque
		result.setRisque(risqueBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for sample default method
	 * End of user code -->
	 */
	private void handleDefaultSample(Project result) {
		// Start of user code default feature for handleDefaultSample
		// result.setSample(null);
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for technician default method
	 * End of user code -->
	 */
	private void handleDefaultTechnician(Project result) {
		// Start of user code default feature for handleDefaultTechnician
		result.setTechnician(contactBuilder.build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for testedroom default method
	 * End of user code -->
	 */
	private void handleDefaultTestedroom(Project result) {
		// Start of user code default feature for handleDefaultTestedroom
		result.setTestedroom(testedRoomBuilder.project(result).build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(Project result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Project.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Project result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Project.version", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for Status
	 * End of user code -->
	 */
	public BUILDER Status(String myStatus) {
		this.Status = myStatus;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for creationDate
	 * End of user code -->
	 */
	public BUILDER creationDate(java.util.Date myCreationDate) {
		this.creationDate = myCreationDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for description
	 * End of user code -->
	 */
	public BUILDER description(String myDescription) {
		this.description = myDescription;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for firmCustomer
	 * End of user code -->
	 */
	public BUILDER firmCustomer(Contact myFirmCustomer) {
		this.firmCustomer = myFirmCustomer;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for firmMaintenance
	 * End of user code -->
	 */
	public BUILDER firmMaintenance(Contact myFirmMaintenance) {
		this.firmMaintenance = myFirmMaintenance;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for firmMoe
	 * End of user code -->
	 */
	public BUILDER firmMoe(Contact myFirmMoe) {
		this.firmMoe = myFirmMoe;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration
	 * End of user code -->
	 */
	public BUILDER gazconfiguration(GazConfiguration myGazconfiguration) {
		this.gazconfiguration = myGazconfiguration;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for image
	 * End of user code -->
	 */
	public BUILDER image(PersistentImage myImage) {
		this.image = myImage;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for kind
	 * End of user code -->
	 */
	public BUILDER kind(String myKind) {
		this.kind = myKind;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for nameDo
	 * End of user code -->
	 */
	public BUILDER nameDo(String myNameDo) {
		this.nameDo = myNameDo;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for reference
	 * End of user code -->
	 */
	public BUILDER reference(String myReference) {
		this.reference = myReference;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for risque
	 * End of user code -->
	 */
	public BUILDER risque(Risque myRisque) {
		this.risque = myRisque;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for sample
	 * End of user code -->
	 */
	public BUILDER sample(Sample... mySample) {
		this.sample = new java.util.HashSet<Sample>(java.util.Arrays.asList(mySample));
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for technician
	 * End of user code -->
	 */
	public BUILDER technician(Contact myTechnician) {
		this.technician = myTechnician;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for testedroom
	 * End of user code -->
	 */
	public BUILDER testedroom(TestedRoom myTestedroom) {
		this.testedroom = myTestedroom;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for updateDate
	 * End of user code -->
	 */
	public BUILDER updateDate(java.util.Date myUpdateDate) {
		this.updateDate = myUpdateDate;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for version
	 * End of user code -->
	 */
	public BUILDER version(Integer myVersion) {
		this.version = myVersion;
		return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	// Start of user code for methods
	// Other methods
	// End of user code

}
