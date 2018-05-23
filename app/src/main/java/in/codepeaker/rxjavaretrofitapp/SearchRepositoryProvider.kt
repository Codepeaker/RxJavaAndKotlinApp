package `in`.codepeaker.rxjavaretrofitapp

import `in`.codepeaker.rxjavaretrofitapp.interfaces.GithubService

/**
 * Created by github.com/codepeaker on 22/5/18.
 **/

object SearchRepositoryProvider {
    fun provideSearchRepository(): SearchStarredRepo {
        return SearchStarredRepo(GithubService.create())
    }

}