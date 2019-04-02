package pl.zzpj2019.solid.ocp.usa.solution;

public class SouthCarolinaState implements State{
	
	private static final int maxSpeed = 100;
	@Override
	public double calculateFine(int speed) {
		if(speed > maxSpeed){
			return maxSpeed - speed;
		}
		return 0;
	}

}
