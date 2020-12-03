package kz.karzhas.domain.repository;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.model.Flashcard;

public interface FlashcardRepository {
    Single<List<Flashcard>> getFlashcards(int groupId);
    Completable addFlashcard(Flashcard flashcard);
    Completable deleteFlashcard(int flashcardId);
}
