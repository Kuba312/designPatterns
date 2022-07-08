package flyweight.model;

public abstract class ChessPiece {

    String name;
    String numberOfPosition;
    String letterPosition;
    String color;

    public ChessPiece(String name, String numberOfPosition, String letterPosition, String color) {
        this.name = name;
        this.numberOfPosition = numberOfPosition;
        this.letterPosition = letterPosition;
        if (color.toLowerCase().contains("black")){
            this.color = String.valueOf(ColorRepository.getBlack());
        }
        if (color.toLowerCase().contains("white")){
            this.color = String.valueOf(ColorRepository.getWhite());
        }
    }

    public String getName() {
        return name;
    }

    public String getNumberOfPosition() {
        return numberOfPosition;
    }

    public String getLetterPosition() {
        return letterPosition;
    }

    public String getColor() {
        return color;
    }
}
