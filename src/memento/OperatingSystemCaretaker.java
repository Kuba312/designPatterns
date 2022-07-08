package memento;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento operatingSystemMemento;


    public void addMemento(OperatingSystemMemento operatingSystemMemento) {
        System.out.println("Zapisana wersja: " +
                operatingSystemMemento.getBackupNumber() + "z datą: "
                + operatingSystemMemento.getBackupDate());
        this.operatingSystemMemento = operatingSystemMemento;

    }


    public OperatingSystemMemento getMemento() {
        System.out.println("Wczytano wersję: " + operatingSystemMemento.getBackupNumber() + "z datą: "
                + operatingSystemMemento.getBackupDate());
        return operatingSystemMemento;
    }
}
