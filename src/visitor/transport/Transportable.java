package visitor.transport;

import visitor.visit.TransportVisitor;

public interface Transportable {

    void accept(TransportVisitor transportVisitor);

}
