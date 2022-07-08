package observer3;

import observer3.notification.InternetNews;
import observer3.notification.RadioNews;
import observer3.notification.TvNews;

public class Main {
    public static void main(String[] args) {

        WeatherForecast weatherForecast = new WeatherForecast(25, 1000);

        TvNews tvNews = new TvNews();
        RadioNews radioNews = new RadioNews();
        InternetNews internetNews = new InternetNews();

        weatherForecast.registerObserver(tvNews);
        weatherForecast.registerObserver(radioNews);
        weatherForecast.registerObserver(internetNews);

        weatherForecast.notifyObservers();

    }
}
