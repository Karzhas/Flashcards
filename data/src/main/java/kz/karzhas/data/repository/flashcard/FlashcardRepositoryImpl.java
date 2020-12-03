package kz.karzhas.data.repository.flashcard;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.model.Flashcard;
import kz.karzhas.domain.repository.FlashcardRepository;

public class FlashcardRepositoryImpl implements FlashcardRepository {

    private FlashcardDataStoreFactory flashcardDataStoreFactory;
    //private final TownshipMapper townshipMapper;

    public FlashcardRepositoryImpl(FlashcardDataStoreFactory flashcardDataStoreFactory) {
        this.flashcardDataStoreFactory = flashcardDataStoreFactory;
    }

    @Override
    public Single<List<Flashcard>> getFlashcards(int groupId) {
        return flashcardDataStoreFactory.create()
                                        .getFlashcards(groupId);
                                        //.map()
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
