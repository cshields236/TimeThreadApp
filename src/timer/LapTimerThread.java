package timer;
public class LapTimerThread implements Runnable {

	public boolean running;
	
	private float lapSeconds, totalSeconds;

	public LapTimer parent;
	
	private float increment = (float)0.1;

	/* The constructor takes the parent frame and the total
	   seconds that the application has been running for so
	   far as parameters, and then launches a thread. */
	public LapTimerThread(LapTimer parent, float totalSeconds) {

		this.parent = parent;
		
		this.running = true;
		
		lapSeconds = (float)0.0;
		
		this.totalSeconds = totalSeconds;
		//(new Thread(this)).start();
		
	}

	@Override
	/* This method should keep incrementing the two counters - 
	   lapSeconds and totalSeconds - by the increment each
	   tenth of a second. It should then update the corresponding
	   text fields in the main display. */
	public void run() {
		
		/* Insert code here */
		
		while (running){
			try{
				
				Thread.sleep(100);
				lapSeconds = (lapSeconds + increment);
				totalSeconds = (totalSeconds + increment);
				parent.updateLapDisplay(lapSeconds);			
				parent.updateTotalDisplay(totalSeconds);
				
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	/* This method stops the thread. */
	public void stop() {
			//stopping the Thread
			running = false;
		
			
	
		
	
	}
	
	public float getLapSeconds() {
		return lapSeconds;
		
	}
	
	public float getTotalSeconds() {
		
		return totalSeconds;
		
	}
	public void setLapSeconds(){
		//resetting the lap timer back to zero
		lapSeconds = 0;
	}
	
}
