package adapter;

import adapter.api.LibraryAPI;
import adapter.api.LibraryAPIImpl;
import adapter.api.LibraryAPIv2;
import adapter.api.LibraryAPIv2Impl;

public class Main {

    public static void main(String[] args) {


        LibraryAPI api = new LibraryAPIImpl();

        User user = new User("Paweł", "Cwik", "32131212");

        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();

        Adapter adapter = new Adapter(user, libraryAPIv2);

        BookConnector connector = new BookConnector(user, adapter);

        connector.checkAviability("Harry Potter i Zakon Feniksa");

    }

}
