package app.spending.spending.Entity;

public enum Category {
    FOOD("Alimentation"),
    HOUSING("Logement"),
    UTILITIES("Charges"),
    TRANSPORT("Transport"),
    HEALTH("Santé"),
    ENTERTAINMENT("Loisirs"),
    EDUCATION("Éducation"),
    CLOTHING("Vêtements"),
    TRAVEL("Voyages"),
    SAVINGS("Épargne"),
    TAXES("Impôts"),
    OTHER("Autre");

    private final String label;

    Category(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
