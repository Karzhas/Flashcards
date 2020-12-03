package kz.karzhas.domain.model;

public class Flashcard {
    private final int id;
    private String frontside;
    private String backside;
    private int rating;

    public Flashcard(int id, String frontside, String backside, int rating) {
        this.id = id;
        this.frontside = frontside;
        this.backside = backside;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getFrontside() {
        return frontside;
    }

    public String getBackside() {
        return backside;
    }

    public int getRating() {
        return rating;
    }
}
