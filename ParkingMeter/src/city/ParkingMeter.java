package city;

public class ParkingMeter {
	private int minutesPQ;
	private int maxTime;
	private int quartersTotal;
	private int minutesLeft;
	
	public ParkingMeter(int minutesPerQuarter, int maximumTime) {
		minutesPQ = minutesPerQuarter;
		maxTime = maximumTime;
		quartersTotal = 0;
		minutesLeft = 0;
	}
	public void insertCoin(int howMany) {
		minutesLeft += minutesPQ * howMany;
		minutesLeft = Math.min(minutesLeft, maxTime);
		quartersTotal += howMany;
	}
	public void passTime(int minutes) {
		minutesLeft -= minutes;
		minutesLeft = Math.max(minutesLeft, 0);
	}
	public int getTimeRemaining() {
		return minutesLeft;
	}
	public double getTotal() {
		return quartersTotal * 0.25;
	}

}
