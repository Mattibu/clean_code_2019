package pl.zzpj2019.solid.dip.weathertracker.solution;

import java.util.ArrayList;
import java.util.List;

public class WeatherTracker {
    String currentConditions;
    List<Device> devices;

    public WeatherTracker() {
    	devices = new ArrayList<Device>();
    	devices.add(new Phone());
    	devices.add(new Emailer());
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        for(int i=0; i< devices.size();i++){
        	devices.get(i).generateWeatherAlert(weatherDescription);
        }
    }
}
