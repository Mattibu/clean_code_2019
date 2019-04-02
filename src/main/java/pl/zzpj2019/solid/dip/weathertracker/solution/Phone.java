package pl.zzpj2019.solid.dip.weathertracker.solution;

public class Phone implements Device{
	
	@Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
