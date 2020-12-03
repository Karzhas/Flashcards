package kz.karzhas.flashcards.models;

public class FlashcardViewModel {
    private final int id;
    private String frontside;
    private String backside;
    private int rating;

    public FlashcardViewModel(int id, String frontside, String backside, int rating) {
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

    public void setFrontside(String frontside) {
        this.frontside = frontside;
    }

    public String getBackside() {
        return backside;
    }

    public void setBackside(String backside) {
        this.backside = backside;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
