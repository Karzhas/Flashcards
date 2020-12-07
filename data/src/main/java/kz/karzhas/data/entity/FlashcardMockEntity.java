package kz.karzhas.data.entity;

public class FlashcardMockEntity {
    int id;
    String frontside;
    String backside;
    String hint;
    int rating;

    public FlashcardMockEntity(){

    }

    public FlashcardMockEntity(String frontside, String backside, String hint) {
        this.frontside = frontside;
        this.backside = backside;
        this.hint = hint;
    }

    public FlashcardMockEntity(String frontside, String backside) {
        this.frontside = frontside;
        this.backside = backside;
    }

    public String getFrontside() {
        return frontside;
    }

    public FlashcardMockEntity(int id, String frontside, String backside) {
        this.id = id;
        this.frontside = frontside;
        this.backside = backside;
    }

    public void setFrontside(String frontside) {
        this.frontside = frontside;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBackside() {
        return backside;
    }

    public void setBackside(String backside) {
        this.backside = backside;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
