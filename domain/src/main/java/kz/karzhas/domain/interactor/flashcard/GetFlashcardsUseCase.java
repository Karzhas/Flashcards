package kz.karzhas.domain.interactor.flashcard;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import kz.karzhas.domain.interactor.type.SingleUseCaseWithParameter;
import kz.karzhas.domain.model.Flashcard;
import kz.karzhas.domain.repository.FlashcardRepository;

public class GetFlashcardsUseCase implements SingleUseCaseWithParameter<Integer, List<Flashcard>> {

    private final FlashcardRepository flashcardRepository;

    public GetFlashcardsUseCase(FlashcardRepository flashcardRepository) {
        this.flashcardRepository = flashcardRepository;
    }

    @Override
    public Single<List<Flashcard>> execute(Integer groupId) {
        return flashcardRepository.getFlashcards(groupId);
    }
}
