package kz.karzhas.flashcards.mappers;

import java.util.List;
import java.util.stream.Collectors;

import kz.karzhas.domain.model.Flashcard;
import kz.karzhas.flashcards.models.FlashcardViewModel;

public class Mapper {
//    public CategoryMockEntity mapGroupToGroupViewModel(Group group){
//        List<FlashcardViewModel> flashcardViewModels = mapFlashcardsToFlashcardViewModel(group.getFlashcards());
//        return new CategoryMockEntity(
//                group.getId(),
//                group.getTitle(),
//                flashcardViewModels
//        );
//    }

    public FlashcardViewModel mapFlashcardToFlashcardViewModel(Flashcard flashcard){
        return new FlashcardViewModel(flashcard.getId(),
                             flashcard.getFrontside(),
                             flashcard.getBackside(),
                             flashcard.getRating());
    }
    public List<FlashcardViewModel> mapFlashcardsToFlashcardViewModel(List<Flashcard> flashcards){
        return flashcards.stream()
                .map(this::mapFlashcardToFlashcardViewModel)
                .collect(Collectors.toList());

    }
}
