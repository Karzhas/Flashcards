package kz.karzhas.data.repository.flashcard;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.model.Flashcard;

public class FlashcardCloudDataStore implements FlashcardDataStore{

    // retrofit service

    @Override
    public Single<List<Flashcard>> getFlashcards(int groupId) {
        return null;
    }

    @Override
    public Completable addFlashcard(Flashcard flashcard) {
        return null;
    }

    @Override
    public Completable deleteFlashcard(int flashcardId) {
        return null;
    }
}
