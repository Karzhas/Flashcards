package kz.karzhas.flashcards.models;

import java.util.List;

public class CategoryViewModel {
    private final int id;
    private String title;
    private List<FlashcardViewModel> flashcards;

    public CategoryViewModel(int id, String title, List<FlashcardViewModel> flashcards) {
        this.id = id;
        this.title = title;
        this.flashcards = flashcards;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FlashcardViewModel> getFlashcards() {
        return flashcards;
    }

    public void setFlashcards(List<FlashcardViewModel> flashcards) {
        this.flashcards = flashcards;
    }
}
