package `in`.codepeaker.rxjavaretrofitapp

import `in`.codepeaker.rxjavaretrofitapp.adapter.GitHubRepoAdapter
import `in`.codepeaker.rxjavaretrofitapp.models.GithubRepoModel
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.reactivestreams.Subscription


class MainActivity : AppCompatActivity() {

    private val TAG: String? = "MainActivity"
    private var gitHubrepoAdapter = GitHubRepoAdapter()
    private var subscription: Subscription? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView: ListView = this.findViewById(R.id.list_view_repos)
        listView.adapter = gitHubrepoAdapter

        val editUserName = findViewById<EditText>(R.id.edit_text_username)
        val searchButton = findViewById<Button>(R.id.button_search)
        searchButton.setOnClickListener {
            val username = editUserName.text.toString()
            if (!TextUtils.isEmpty(username)){
                getStarredRepos(username)
            }

        }

    }

    private fun getStarredRepos(username: String) {
        val repository = SearchRepositoryProvider.provideSearchRepository()
        repository.searchUsers(username)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe ({
                    result ->

                    val result : List<GithubRepoModel> =  result
                    gitHubrepoAdapter.setGitHubRepos(result)
                    Log.d("Result", "There are ${result.size} Java developers in Lagos")
                }, { error ->
                    error.printStackTrace()
                })

    }


}
