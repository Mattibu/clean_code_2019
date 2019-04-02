package pl.zzpj2019.solid.ocp.usa.solution;

public class GeorgiaState implements State{

	private static final int maxSpeed = 50;
	@Override
	public double calculateFine(int speed) {
		if(speed > maxSpeed){
			return 1500;
		}
		return 0;
	}
	

}
