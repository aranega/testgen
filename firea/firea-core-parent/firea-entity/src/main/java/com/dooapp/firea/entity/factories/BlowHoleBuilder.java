package com.dooapp.firea.entity.factories;


import com.dooapp.firea.wrapper.BlowHole;
import com.dooapp.firea.wrapper.TestedRoom;
import com.dooapp.firea.entity.Discharge;
//Start of user code for imports
// TODO: import me!
//End of user code




public class BlowHoleBuilder<BUILDER extends BlowHoleBuilder<?>>
{
	//Start of user code for attributes
	// Other attributes
	//End of user code
	
	private com.dooapp.firea.entity.Discharge Discharge;
	
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
	 */
	@javax.inject.Inject
	protected BlowHoleBuilder() {
	}
	
	protected BlowHole createValue() {
		return new BlowHole();
	}
	
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
	private void handleDefaultDischarge(BlowHole result) {
		//Start of user code default feature for handleDefaultDischarge
		result.setDischarge(Discharge.valueOf(cfg.getProperty("defaultValue.BlowHole.discharge", "Positive")));
		//End of user code
	}

	private void handleDefaultCreationDate(BlowHole result) {
		//Start of user code default feature for handleDefaultCreationDate
		try {
				result.setCreationDate(cfg.getProperty("defaultValue.BlowHole.creationDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHole.creationDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultId(BlowHole result) {
		//Start of user code default feature for handleDefaultId
		result.setId(Long.valueOf(cfg.getProperty("defaultValue.BlowHole.id", "0")));
		//End of user code
	}

	private void handleDefaultQuantity(BlowHole result) {
		//Start of user code default feature for handleDefaultQuantity
		result.setQuantity(Integer.valueOf(cfg.getProperty("defaultValue.BlowHole.quantity", "0")));
		//End of user code
	}

	private void handleDefaultSurface(BlowHole result) {
		//Start of user code default feature for handleDefaultSurface
		result.setSurface(Double.valueOf(cfg.getProperty("defaultValue.BlowHole.surface", "0")));
		//End of user code
	}

	private void handleDefaultTestedroom(BlowHole result) {
		//Start of user code default feature for handleDefaultTestedroom
		result.setTestedroom(testedRoomBuilder.build());
		//End of user code
	}

	private void handleDefaultUpdateDate(BlowHole result) {
		//Start of user code default feature for handleDefaultUpdateDate
		try {
				result.setUpdateDate(cfg.getProperty("defaultValue.BlowHole.updateDate") == null ? 
						null :
						 DATE_FORMAT.parse(cfg.getProperty("defaultValue.BlowHole.updateDate")));
			} catch (java.text.ParseException e) {
				throw new RuntimeException(e);
		}
		//End of user code
	}

	private void handleDefaultVersion(BlowHole result) {
		//Start of user code default feature for handleDefaultVersion
		result.setVersion(Integer.valueOf(cfg.getProperty("defaultValue.BlowHole.version", "0")));
		//End of user code
	}

	public BUILDER Discharge(com.dooapp.firea.entity.Discharge myDischarge) {
			this.Discharge = myDischarge;
			return (BUILDER) this;
	}

	public BUILDER creationDate(java.util.Date myCreationDate) {
			this.creationDate = myCreationDate;
			return (BUILDER) this;
	}

	public BUILDER id(Long myId) {
			this.id = myId;
			return (BUILDER) this;
	}

	public BUILDER quantity(Integer myQuantity) {
			this.quantity = myQuantity;
			return (BUILDER) this;
	}

	public BUILDER surface(Double mySurface) {
			this.surface = mySurface;
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
