package visitor;

import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;
import visitor.transport.Transportable;
import visitor.visit.NameTransportVisitor;
import visitor.visit.PriceTransportVisitor;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("dog", 30);
        Person person = new Person("Dawid", "Nowak", true);
        Shipment shipment = new Shipment("PL", "4325452", false);
        NameTransportVisitor nameTransportVisitor = new NameTransportVisitor();
        PriceTransportVisitor priceTransportVisitor = new PriceTransportVisitor();


        List<Transportable> transportableList = Arrays.asList(animal, person, shipment);

        transportableList.forEach(transportable -> transportable.accept(nameTransportVisitor));

        transportableList.forEach(transportable -> transportable.accept(priceTransportVisitor));




    }
}
