package flyweight.model;


//Pyłek to wzorzec,  który powoduje zachowanie większej pamięci przy tworzeniu wielu obiektów, poniewąż 'wynosi' wspólna
//część atrybutów wyżej

//1. Implement class, which contains common attributes for the next objects.
//2. Create repository and there create static field and getters for them.
//3. Create abstract class with fields which will applications to classes which will extends abstract class
//4. In class Main create instances of this class and transfer parameters

public class Color {

    int red;
    int green;
    int white;

    public Color(int red, int green, int white) {
        this.red = red;
        this.green = green;
        this.white = white;
    }


}
