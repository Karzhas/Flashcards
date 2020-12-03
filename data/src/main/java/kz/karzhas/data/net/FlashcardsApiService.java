package kz.karzhas.data.net;

import java.util.List;

import io.reactivex.rxjava3.core.Single;
import kz.karzhas.data.entity.FlashcardApiEntity;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface FlashcardsApiService {
    @GET("groups/{groupId}/flashcards")
    Single<List<FlashcardApiEntity>> getFlashcardss(@Path("groupId") int groupId);


}
