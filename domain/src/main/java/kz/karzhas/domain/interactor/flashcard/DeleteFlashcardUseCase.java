package kz.karzhas.domain.interactor.flashcard;

import io.reactivex.rxjava3.core.Completable;
import kz.karzhas.domain.interactor.type.CompletableUseCaseWithParameter;
import kz.karzhas.domain.repository.FlashcardRepository;

public class DeleteFlashcardUseCase implements CompletableUseCaseWithParameter<Integer> {

    private final FlashcardRepository flashcardRepository;

    public DeleteFlashcardUseCase(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @Override
    public Completable execute(Integer flashcardId) {
        return flashcardRepository.deleteFlashcard(flashcardId);
    }
}
