package marsmission;

public class Stage3EngineModel extends EngineModel  {
	/*
	 * Class Instance Variables
	 * 
	 */
	
	private LaunchVehicleStageAdapterModel  launchVehicleStageAdapterModel;

	/*
	 * Class Constants
	 * 
	 */
	
	public static final String STAGE3		= "STAGE3";
	
	/*
	 * Construcutors
	 * 
	 */
	public Stage3EngineModel(int type, String model, String organization) {
		super(type, model, organization);
	}

}
