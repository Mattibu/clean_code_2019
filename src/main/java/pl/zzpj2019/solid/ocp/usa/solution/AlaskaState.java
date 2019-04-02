package pl.zzpj2019.solid.ocp.usa.solution;

public class AlaskaState implements State{
	
	private static final int maxSpeed = 75;
	@Override
	public double calculateFine(int speed) {
		if(speed > maxSpeed){
			return 200;
		}else if(speed > 2*maxSpeed){
			return 400;
		}
		return 0;
	}

}
