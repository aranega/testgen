package com.dooapp.fireaOLD.entity.factories;


import com.dooapp.fireaOLD.wrapper.Project;
import com.dooapp.fireaOLD.wrapper.Sample;
import com.dooapp.fireaOLD.wrapper.GazConfiguration;
import com.dooapp.fireaOLD.wrapper.PersistentImage;
import com.dooapp.fireaOLD.wrapper.Contact;
import com.dooapp.fireaOLD.wrapper.Risque;
import com.dooapp.fireaOLD.entity.ProjectKind;
//Start of user code for imports
// TODO: import me!
//End of user code


/*
 * Class
 * <!-- Start of user code comment for Project Builder
 * End of user code -->
 */

public class ProjectBuilder<BUILDER extends ProjectBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private com.dooapp.fireaOLD.entity.ProjectKind Status;
	
	private java.util.Set<Contact> contacts;
	
	private java.util.Date creationDate;
	
	private String description;
	
	private GazConfiguration gazconfiguration;
	
	private Long id;
	
	private PersistentImage image;
	
	private com.dooapp.fireaOLD.entity.ProjectKind kind;
	
	private String name;
	
	private Risque risque;
	
	private java.util.Set<Sample> sample;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	GazConfigurationBuilder<?> gazConfigurationBuilder;
	@javax.inject.Inject
	SampleBuilder<?> sampleBuilder;
	@javax.inject.Inject
	RisqueBuilder<?> risqueBuilder;
	@javax.inject.Inject
	PersistentImageBuilder<?> persistentImageBuilder;
	@javax.inject.Inject
	ContactBuilder<?> contactBuilder;
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
		if (contacts == null) {
			handleDefaultContacts(result);
		} else {
			result.contactsProperty().get().addAll(contacts);
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
		if (name == null) {
			handleDefaultName(result);
		} else {
			result.setName(name);
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
		//Start of user code default feature for handleDefaultStatus
		result.setStatus(ProjectKind.valueOf(cfg.getProperty("defaultValue.Project.status", "R13_APSAD")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for contacts default method
	 * End of user code -->
	 */
	private void handleDefaultContacts(Project result) {
		//Start of user code default feature for handleDefaultContacts
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for description default method
	 * End of user code -->
	 */
	private void handleDefaultDescription(Project result) {
		//Start of user code default feature for handleDefaultDescription
		result.setDescription(cfg.getProperty("defaultValue.Project.description"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for gazconfiguration default method
	 * End of user code -->
	 */
	private void handleDefaultGazconfiguration(Project result) {
		//Start of user code default feature for handleDefaultGazconfiguration
		result.setGazconfiguration(gazConfigurationBuilder.project(result).build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(Project result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.Project.id", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for image default method
	 * End of user code -->
	 */
	private void handleDefaultImage(Project result) {
		//Start of user code default feature for handleDefaultImage
		result.setImage(persistentImageBuilder.build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for kind default method
	 * End of user code -->
	 */
	private void handleDefaultKind(Project result) {
		//Start of user code default feature for handleDefaultKind
		result.setKind(ProjectKind.valueOf(cfg.getProperty("defaultValue.Project.kind", "R13_APSAD")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for name default method
	 * End of user code -->
	 */
	private void handleDefaultName(Project result) {
		//Start of user code default feature for handleDefaultName
		result.setName(cfg.getProperty("defaultValue.Project.name"));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for risque default method
	 * End of user code -->
	 */
	private void handleDefaultRisque(Project result) {
		//Start of user code default feature for handleDefaultRisque
		result.setRisque(risqueBuilder.build());
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for sample default method
	 * End of user code -->
	 */
	private void handleDefaultSample(Project result) {
		//Start of user code default feature for handleDefaultSample
		//do nothing
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
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

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(Project result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.Project.version", "0")));
		//End of user code
	}

	/*
	 * <!-- Start of user code comment for Status
	 * End of user code -->
	 */
	public BUILDER Status(com.dooapp.fireaOLD.entity.ProjectKind myStatus) {
			this.Status = myStatus;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for contacts
	 * End of user code -->
	 */
	public BUILDER contacts(Contact... myContacts) {
			this.contacts = new java.util.HashSet<Contact>(java.util.Arrays.asList(myContacts));
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
	public BUILDER kind(com.dooapp.fireaOLD.entity.ProjectKind myKind) {
			this.kind = myKind;
			return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for name
	 * End of user code -->
	 */
	public BUILDER name(String myName) {
			this.name = myName;
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
	//Start of user code for methods
	// Other methods
	//End of user code

}
