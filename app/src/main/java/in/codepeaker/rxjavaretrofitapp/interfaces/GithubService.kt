package `in`.codepeaker.rxjavaretrofitapp.interfaces

import `in`.codepeaker.rxjavaretrofitapp.models.GithubRepoModel
import io.reactivex.Observable
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by github.com/codepeaker on 21/5/18.
 **/
public interface GithubService{
    @GET("users/{user}/starred")
    fun getStarredRepo(@Path("user") username: String): Observable<List<GithubRepoModel>>


    companion object Factory {
        fun create(): GithubService {
            val retrofit = Retrofit.Builder()
                    .baseUrl("https://api.github.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build()

            return retrofit.create(GithubService::class.java)
        }
    }

}