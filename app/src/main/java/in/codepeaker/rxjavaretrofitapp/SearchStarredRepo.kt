package `in`.codepeaker.rxjavaretrofitapp

import `in`.codepeaker.rxjavaretrofitapp.interfaces.GithubService
import `in`.codepeaker.rxjavaretrofitapp.models.GithubRepoModel
import io.reactivex.Observable

/**
 * Created by github.com/codepeaker on 22/5/18.
 **/
class SearchStarredRepo(private val apiService: GithubService) {

    fun searchUsers(username: String): Observable<List<GithubRepoModel>> {
        return apiService.getStarredRepo(username = username)
    }
}
