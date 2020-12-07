package kz.karzhas.data.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoryMockEntity {
    int id;
    String title;
    List<FlashcardMockEntity> flashcards = new ArrayList<>();

    public CategoryMockEntity(String title) {
        this.title = title;
    }

    public CategoryMockEntity(String title, List<FlashcardMockEntity> flashcards) {
        this.title = title;
        this.flashcards = flashcards;
    }

    public CategoryMockEntity(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public CategoryMockEntity(int id, String title, List<FlashcardMockEntity> flashcards) {
        this.id = id;
        this.title = title;
        this.flashcards = flashcards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<FlashcardMockEntity> getFlashcards() {
        return flashcards;
    }

    public void setFlashcards(List<FlashcardMockEntity> flashcards) {
        this.flashcards = flashcards;
    }
}
