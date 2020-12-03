package kz.karzhas.data.repository.flashcard;

public class FlashcardDataStoreFactory {
    public  FlashcardDataStore create(){
        // if no internet return local
        // else return global
        return new FlashcardCloudDataStore();
    }
}
