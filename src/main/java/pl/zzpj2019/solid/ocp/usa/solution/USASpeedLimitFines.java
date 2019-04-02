package pl.zzpj2019.solid.ocp.usa.solution;

public class USASpeedLimitFines {

	public double calcualateSpeedLimitFine(State state, int speed) {

		return state.calculateFine(speed);

	}

}