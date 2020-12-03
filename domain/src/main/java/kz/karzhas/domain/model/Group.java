package kz.karzhas.domain.model;

import java.util.List;

public class Group {
    private final int id;
    private String title;
    private List<Flashcard> flashcards;

    public Group(int id, String title, List<Flashcard> flashcards) {
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

    public List<Flashcard> getFlashcards() {
        return flashcards;
    }
}
