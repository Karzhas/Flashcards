package kz.karzhas.domain.interactor.flashcard;

import io.reactivex.rxjava3.core.Completable;
import kz.karzhas.domain.interactor.type.CompletableUseCaseWithParameter;
import kz.karzhas.domain.model.Flashcard;
import kz.karzhas.domain.repository.FlashcardRepository;

public class AddFlashcardUseCase implements CompletableUseCaseWithParameter<Flashcard> {

    private final FlashcardRepository flashcardRepository;

    public AddFlashcardUseCase(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @Override
    public Completable execute(Flashcard flashcard) {
        return flashcardRepository.addFlashcard(flashcard);
    }
}
