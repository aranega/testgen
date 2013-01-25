package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.BlowHole;
import com.dooapp.firea.wrapper.TestedRoom;

//Start of user code for imports
// TODO: import me!
//End of user code




/*
 * Class
 * <!-- Start of user code comment for BlowHole Builder
 * End of user code -->
 */

public class BlowHoleBuilder<BUILDER extends BlowHoleBuilder<?>>
// Start of user code bloc for inerithance

// End of user code
// Start of user code bloc for interfaces

// End of user code
{
	// Start of user code for attributes
	// Other attributes
	// End of user code
	/**
	 * fdfddd 
	 */
	private String Discharge;
	
	private java.util.Date creationDate;
	
	private Long id;
	
	private Integer quantity;
	
	private Double surface;
	
	private TestedRoom testedroom;
	
	private java.util.Date updateDate;
	
	private Integer version;
	@javax.inject.Inject
	TestedRoomBuilder<?> testedRoomBuilder;
	@javax.inject.Inject
	java.util.Properties cfg;
	/**
	 * Just a helpful {@link DateFormat}
	 */
	private static final java.text.DateFormat DATE_FORMAT = new java.text.SimpleDateFormat();
	
	
	/*
	 * Constructors
	 * <!-- Start of user code comment for BlowHole getter
	 * End of user code -->
	 */
	@javax.inject.Inject
	protected BlowHoleBuilder() {
	}
	
	protected BlowHole createValue() {
		return new BlowHole();
	}
	
	/*
	 * <!-- Start of user code comment for BlowHole build method
	 * End of user code -->
	 */
	public BlowHole build() throws NullPointerException {
		BlowHole result =  this.createValue() ;
		if (Discharge == null) {
			handleDefaultDischarge(result);
		} else {
			result.setDischarge(Discharge);
		}
		if (creationDate == null) {
			handleDefaultCreationDate(result);
		} else {
			result.setCreationDate(creationDate);
		}
		if (id == null) {
			handleDefaultId(result);
		} else {
			result.setId(id);
		}
		if (quantity == null) {
			handleDefaultQuantity(result);
		} else {
			result.setQuantity(quantity);
		}
		if (surface == null) {
			handleDefaultSurface(result);
		} else {
			result.setSurface(surface);
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
	 * <!-- Start of user code comment for Discharge default method
	 * End of user code -->
	 */
	private void handleDefaultDischarge(BlowHole result) {
		// Start of user code default feature for handleDefaultDischarge
		result.setDischarge(cfg.getProperty("defaultValue.BlowHole.discharge"));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for creationDate default method
	 * End of user code -->
	 */
	private void handleDefaultCreationDate(BlowHole result) {
		// Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.BlowHole.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHole.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for id default method
	 * End of user code -->
	 */
	private void handleDefaultId(BlowHole result) {
		// Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.BlowHole.id", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for quantity default method
	 * End of user code -->
	 */
	private void handleDefaultQuantity(BlowHole result) {
		// Start of user code default feature for handleDefaultQuantity
		result.setQuantity(Integer.valueOf(cfg.getProperty("defaultValue.BlowHole.quantity", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for surface default method
	 * End of user code -->
	 */
	private void handleDefaultSurface(BlowHole result) {
		// Start of user code default feature for handleDefaultSurface
		result.setSurface(Double.valueOf(cfg.getProperty("defaultValue.BlowHole.surface", "0.0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for testedroom default method
	 * End of user code -->
	 */
	private void handleDefaultTestedroom(BlowHole result) {
		// Start of user code default feature for handleDefaultTestedroom
		result.setTestedroom(testedRoomBuilder.blowholes(result).build());
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for updateDate default method
	 * End of user code -->
	 */
	private void handleDefaultUpdateDate(BlowHole result) {
		// Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.BlowHole.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHole.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for version default method
	 * End of user code -->
	 */
	private void handleDefaultVersion(BlowHole result) {
		// Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.BlowHole.version", "0")));
		// End of user code
	}

	/*
	 * <!-- Start of user code comment for Discharge
	 * End of user code -->
	 */
	public BUILDER Discharge(String myDischarge) {
		this.Discharge = myDischarge;
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
	 * <!-- Start of user code comment for id
	 * End of user code -->
	 */
	public BUILDER id(Long myId) {
		this.id = myId;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for quantity
	 * End of user code -->
	 */
	public BUILDER quantity(Integer myQuantity) {
		this.quantity = myQuantity;
		return (BUILDER) this;
	}

	/*
	 * <!-- Start of user code comment for surface
	 * End of user code -->
	 */
	public BUILDER surface(Double mySurface) {
		this.surface = mySurface;
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
