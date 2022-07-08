package factory;

public class DogFactory {
    public  Dog getDog(String criteria)
    {
        if ( criteria.equals("small") )
            return new York();
        else if ( criteria.equals("big") )
            return new Haski();
        else if ( criteria.equals("working") )
            return new Puddle();

        return null;
    }
}
