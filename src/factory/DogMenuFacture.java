package factory;

public class DogMenuFacture {
    private final DogFactory dogFactory;

    public DogMenuFacture(DogFactory dogFactory) {
        this.dogFactory = dogFactory;
    }

    public void menufactureDog(String type){
        Dog dog = dogFactory.getDog(type);
        dog.speak();
    }
}
