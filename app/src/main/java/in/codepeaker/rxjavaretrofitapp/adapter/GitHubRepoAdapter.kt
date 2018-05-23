package `in`.codepeaker.rxjavaretrofitapp.adapter

import `in`.codepeaker.rxjavaretrofitapp.R
import `in`.codepeaker.rxjavaretrofitapp.models.GithubRepoModel
import android.annotation.SuppressLint
import android.support.annotation.Nullable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView



/**
 * Created by github.com/codepeaker on 22/5/18.
 **/
public class GitHubRepoAdapter : BaseAdapter() {
    private val gitHubRepos = ArrayList<GithubRepoModel>()

    override fun getItem(position: Int): GithubRepoModel {
      return gitHubRepos[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return gitHubRepos.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: createView(parent) // ?: if null

        val gitHubRepoViewHolder = view.tag as GitHubRepoViewHolder
        gitHubRepoViewHolder.setGitHubRepo(getItem(position))
        return view

    }




    private fun createView(parent: ViewGroup?): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(parent?.context)
        val  view: View = layoutInflater.inflate(R.layout.item_github_repo,parent,false)
        val gitHubRepoViewHolder = GitHubRepoViewHolder(view)
        view.tag = gitHubRepoViewHolder
        return view

    }

   public fun setGitHubRepos(@Nullable repos: List<GithubRepoModel>?) {
        if (repos == null) {
            return
        }
        gitHubRepos.clear()
        gitHubRepos.addAll(repos)
        notifyDataSetChanged()
    }


    private class GitHubRepoViewHolder(view: View) {

        private val textRepoName: TextView = view.findViewById(R.id.text_repo_name)
        private val textRepoDescription: TextView = view.findViewById(R.id.text_repo_description)
        private val textLanguage: TextView = view.findViewById(R.id.text_language)
        private val textStars: TextView = view.findViewById(R.id.text_stars)

        @SuppressLint("SetTextI18n")
        public fun setGitHubRepo(gitHubRepo: GithubRepoModel) {
            textRepoName.text = gitHubRepo.name
            textRepoDescription.text = gitHubRepo.description
            textLanguage.text = "Language: " + gitHubRepo.language
            textStars.text = "Stars: " + gitHubRepo.stargazers_count
        }
    }

}