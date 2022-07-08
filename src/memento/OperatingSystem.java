package memento;

import java.util.Date;

//Memento wykorzystywany jest, wtedy kiedy chcemy zapmiętać jeden lub wiele stanów obiektu.
//Memnto allows to us, to remember state of one or meany objects.

// 1. Create class when we have for example backupNumber and some date, create method createBuckup and save(), load()
// 2. Create class Memento variables backupNumber nad date, constructor, and getters
// 3. Crreate class - Caretaker -addMemento(), getMemento()

public class OperatingSystem {
    private int backupNumber = 0;
    private Date backupDate;


    public void createBackup() {
        this.backupNumber++;
        this.backupDate = new Date();
        System.out.println("Utworzono backup nr: " + this.backupNumber + " z datą: " + backupDate);
    }

    public OperatingSystemMemento save() {
        return new OperatingSystemMemento(this.backupNumber, this.backupDate);
    }

    public void load(OperatingSystemMemento operatingSystemMemento) {

        this.backupNumber = operatingSystemMemento.getBackupNumber();

        this.backupDate = operatingSystemMemento.getBackupDate();
    }
}


