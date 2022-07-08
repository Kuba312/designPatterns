package observer3;

import observer3.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {
    int temperature;
    int pressure;
    private final Set<Observer> registeredObservers;

    public WeatherForecast(int temperature, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.registeredObservers = new HashSet<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer registeredObserver : registeredObservers) {
            registeredObserver.update(this);
        }

    }

    public void changeStatusI(int temperature){
        setTemperature(temperature);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


}
