package visitor.visit;

import visitor.transport.Animal;
import visitor.transport.Person;
import visitor.transport.Shipment;

public class NameTransportVisitor implements TransportVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("is transported animal and his type is: " + animal.getKind());
    }

    @Override
    public void visit(Person person) {
        System.out.println("is transported person: " + person.getFirstName() + " " + person.getLastName());
    }

    @Override
    public void visit(Shipment shipment) {
        System.out.println(shipment.getPrefix() + " " + shipment.getSerialNumber());

    }
}
