import java.util.HashMap;



public abstract class Patient {

	private HashMap<String, Patient> patientList = new HashMap<String, Patient>();
	public Patient(HashMap<Object, Object> hashMap) {
	
		// TODO Auto-generated constructor stub
	}

	public Patient(String string, int i, int j) {
		// TODO Auto-generated constructor stub
	}

	private int health;
	private int bloodLevel;
	
	



	public void Patient(String string, int health, int bloodLevel) {
		this.health = 50;
		this.bloodLevel = 100;
		// TODO Auto-generated constructor stub
	}



	public int getHealth() {
		return health;
		
	}

	public int getBloodLevel() {
		return bloodLevel;
	}

}
