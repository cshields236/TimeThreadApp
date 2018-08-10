package timer;



public class Lap {

	private int id;
	private float lapTime;
	
	public Lap(int id, float lapTime) {

		this.id = id;
		this.lapTime = lapTime;
	
	}
	
	public int getId() {
		
		return id;
		
	}
	
	public float getLapTime() {
		
		return lapTime;
		
	}
	
	}
