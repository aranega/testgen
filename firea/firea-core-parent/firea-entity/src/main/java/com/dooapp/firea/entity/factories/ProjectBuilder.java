package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.Project;
import com.dooapp.firea.wrapper.PersistentImage;
import com.dooapp.firea.wrapper.Contact;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.wrapper.Sample;
import com.dooapp.firea.wrapper.GazConfiguration;
import com.dooapp.firea.wrapper.Risque;
import com.dooapp.firea.entity.ProjectStatus;
import com.dooapp.firea.entity.ProjectKind;
//Start of user code for imports
// TODO: import me!
//End of user code




public class ProjectBuilder<BUILDER extends ProjectBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private com.dooapp.firea.entity.ProjectStatus Status;
	
	private java.util.Date creationDate;
	
	private String description;
	
	private Contact firmCustomer;
	
	private Contact firmMaintenance;
	
	private Contact firmMoe;
	
	private GazConfiguration gazconfiguration;
	
	private Long id;
	
	private PersistentImage image;
	
	private com.dooapp.firea.entity.ProjectKind kind;
	
	private String nameDo;
	
	private String reference;
	
	private Risque risque;
	
	private java.util.Set<Sample> sample;
	
	private Contact technician;
	
	private TestedRoom testedroom;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	PersistentImageBuilder<?> persistentImageBuilder;
	@javax.inject.Inject
	GazConfigurationBuilder<?> gazConfigurationBuilder;
	@javax.inject.Inject
	TestedRoomBuilder<?> testedRoomBuilder;
	@javax.inject.Inject
	SampleBuilder<?> sampleBuilder;
	@javax.inject.Inject
	ContactBuilder<?> contactBuilder;
	@javax.inject.Inject
	RisqueBuilder<?> risqueBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	/*
	 * Constructors 
	 */
	@javax.inject.Inject
	protected ProjectBuilder() {
	}
	
	protected Project createValue() {
		return new Project();
	}
	
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
	private void handleDefaultStatus(Project result) {
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(ProjectStatus.valueOf(cfg.getProperty("defaultValue.Project.status", "TO_PLAN")));
		//End of user code
	}

	private void handleDefaultCreationDate(Project result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.Project.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultDescription(Project result) {
		//Start of user code default feature for handleDefaultDescription
		result.setDescription(cfg.getProperty("defaultValue.Project.description"));
		//End of user code
	}

	private void handleDefaultFirmCustomer(Project result) {
		//Start of user code default feature for handleDefaultFirmCustomer
		result.setFirmCustomer(contactBuilder.build());
		//End of user code
	}

	private void handleDefaultFirmMaintenance(Project result) {
		//Start of user code default feature for handleDefaultFirmMaintenance
		result.setFirmMaintenance(contactBuilder.build());
		//End of user code
	}

	private void handleDefaultFirmMoe(Project result) {
		//Start of user code default feature for handleDefaultFirmMoe
		result.setFirmMoe(contactBuilder.build());
		//End of user code
	}

	private void handleDefaultGazconfiguration(Project result) {
		//Start of user code default feature for handleDefaultGazconfiguration
		result.setGazconfiguration(gazConfigurationBuilder.project(result).build());
		//End of user code
	}

	private void handleDefaultId(Project result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Project.id", "0")));
		//End of user code
	}

	private void handleDefaultImage(Project result) {
		//Start of user code default feature for handleDefaultImage
		result.setImage(persistentImageBuilder.build());
		//End of user code
	}

	private void handleDefaultKind(Project result) {
		//Start of user code default feature for handleDefaultKind
		result.setKind(ProjectKind.valueOf(cfg.getProperty("defaultValue.Project.kind", "R13_APSAD")));
		//End of user code
	}

	private void handleDefaultNameDo(Project result) {
		//Start of user code default feature for handleDefaultNameDo
		result.setNameDo(cfg.getProperty("defaultValue.Project.nameDo"));
		//End of user code
	}

	private void handleDefaultReference(Project result) {
		//Start of user code default feature for handleDefaultReference
		result.setReference(cfg.getProperty("defaultValue.Project.reference"));
		//End of user code
	}

	private void handleDefaultRisque(Project result) {
		//Start of user code default feature for handleDefaultRisque
		result.setRisque(risqueBuilder.build());
		//End of user code
	}

	private void handleDefaultSample(Project result) {
		//Start of user code default feature for handleDefaultSample
		//do nothing
		//End of user code
	}

	private void handleDefaultTechnician(Project result) {
		//Start of user code default feature for handleDefaultTechnician
		result.setTechnician(contactBuilder.build());
		//End of user code
	}

	private void handleDefaultTestedroom(Project result) {
		//Start of user code default feature for handleDefaultTestedroom
		result.setTestedroom(testedRoomBuilder.project(result).build());
		//End of user code
	}

	private void handleDefaultUpdateDate(Project result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.Project.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.Project.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(Project result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Project.version", "0")));
		//End of user code
	}

	public BUILDER Status(com.dooapp.firea.entity.ProjectStatus myStatus) {
			this.Status = myStatus;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER description(String myDescription) {
			this.description = myDescription;
			return (BUILDER) this;
	}

	public BUILDER firmCustomer(Contact myFirmCustomer) {
			this.firmCustomer = myFirmCustomer;
			return (BUILDER) this;
	}

	public BUILDER firmMaintenance(Contact myFirmMaintenance) {
			this.firmMaintenance = myFirmMaintenance;
			return (BUILDER) this;
	}

	public BUILDER firmMoe(Contact myFirmMoe) {
			this.firmMoe = myFirmMoe;
			return (BUILDER) this;
	}

	public BUILDER gazconfiguration(GazConfiguration myGazconfiguration) {
			this.gazconfiguration = myGazconfiguration;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER image(PersistentImage myImage) {
			this.image = myImage;
			return (BUILDER) this;
	}

	public BUILDER kind(com.dooapp.firea.entity.ProjectKind myKind) {
			this.kind = myKind;
			return (BUILDER) this;
	}

	public BUILDER nameDo(String myNameDo) {
			this.nameDo = myNameDo;
			return (BUILDER) this;
	}

	public BUILDER reference(String myReference) {
			this.reference = myReference;
			return (BUILDER) this;
	}

	public BUILDER risque(Risque myRisque) {
			this.risque = myRisque;
			return (BUILDER) this;
	}

	public BUILDER sample(Sample... mySample) {
			this.sample = new java.util.HashSet<Sample>(java.util.Arrays.asList(mySample));
			return (BUILDER) this;
	}

	public BUILDER technician(Contact myTechnician) {
			this.technician = myTechnician;
			return (BUILDER) this;
	}

	public BUILDER testedroom(TestedRoom myTestedroom) {
			this.testedroom = myTestedroom;
			return (BUILDER) this;
	}

	public BUILDER updateDate(java.util.Date myUpdateDate) {
			this.updateDate = myUpdateDate;
			return (BUILDER) this;
	}

	public BUILDER version(Integer myVersion) {
			this.version = myVersion;
			return (BUILDER) this;
	}

	/*
	 * User Methods
     */
	//Start of user code for methods
	// Other methods
	//End of user code

}
