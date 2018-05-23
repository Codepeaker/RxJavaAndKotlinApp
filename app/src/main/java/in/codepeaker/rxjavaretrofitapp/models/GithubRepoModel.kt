package `in`.codepeaker.rxjavaretrofitapp.models

/**
 * Created by github.com/codepeaker on 21/5/18.
 **/


data class GithubRepoModel(
    val id: Int, //28457823
    val name: String, //freeCodeCamp
    val full_name: String, //freeCodeCamp/freeCodeCamp
    val owner: Owner,
    val private: Boolean, //false
    val html_url: String, //https://github.com/freeCodeCamp/freeCodeCamp
    val description: String, //The https://freeCodeCamp.org open source codebase and curriculum. Learn to code and help nonprofits.
    val fork: Boolean, //false
    val url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp
    val forks_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/forks
    val keys_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/keys{/key_id}
    val collaborators_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/collaborators{/collaborator}
    val teams_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/teams
    val hooks_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/hooks
    val issue_events_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/issues/events{/number}
    val events_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/events
    val assignees_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/assignees{/user}
    val branches_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/branches{/branch}
    val tags_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/tags
    val blobs_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/git/blobs{/sha}
    val git_tags_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/git/tags{/sha}
    val git_refs_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/git/refs{/sha}
    val trees_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/git/trees{/sha}
    val statuses_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/statuses/{sha}
    val languages_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/languages
    val stargazers_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/stargazers
    val contributors_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/contributors
    val subscribers_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/subscribers
    val subscription_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/subscription
    val commits_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/commits{/sha}
    val git_commits_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/git/commits{/sha}
    val comments_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/comments{/number}
    val issue_comment_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/issues/comments{/number}
    val contents_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/contents/{+path}
    val compare_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/compare/{base}...{head}
    val merges_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/merges
    val archive_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/{archive_format}{/ref}
    val downloads_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/downloads
    val issues_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/issues{/number}
    val pulls_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/pulls{/number}
    val milestones_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/milestones{/number}
    val notifications_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/notifications{?since,all,participating}
    val labels_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/labels{/name}
    val releases_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/releases{/id}
    val deployments_url: String, //https://api.github.com/repos/freeCodeCamp/freeCodeCamp/deployments
    val created_at: String, //2014-12-24T17:49:19Z
    val updated_at: String, //2018-05-22T06:55:03Z
    val pushed_at: String, //2018-05-22T06:54:41Z
    val git_url: String, //git://github.com/freeCodeCamp/freeCodeCamp.git
    val ssh_url: String, //git@github.com:freeCodeCamp/freeCodeCamp.git
    val clone_url: String, //https://github.com/freeCodeCamp/freeCodeCamp.git
    val svn_url: String, //https://github.com/freeCodeCamp/freeCodeCamp
    val homepage: String,
    val size: Int, //34416
    val stargazers_count: Int, //292212
    val watchers_count: Int, //292212
    val language: String, //JavaScript
    val has_issues: Boolean, //true
    val has_projects: Boolean, //true
    val has_downloads: Boolean, //true
    val has_wiki: Boolean, //false
    val has_pages: Boolean, //false
    val forks_count: Int, //13819
    val mirror_url: Any, //null
    val archived: Boolean, //false
    val open_issues_count: Int, //190
    val license: License,
    val forks: Int, //13819
    val open_issues: Int, //190
    val watchers: Int, //292212
    val default_branch: String //staging
) {
    data class License(
        val key: String, //bsd-3-clause
        val name: String, //BSD 3-Clause "New" or "Revised" License
        val spdx_id: String, //BSD-3-Clause
        val url: String //https://api.github.com/licenses/bsd-3-clause
    )

    data class Owner(
        val login: String, //freeCodeCamp
        val id: Int, //9892522
        val avatar_url: String, //https://avatars0.githubusercontent.com/u/9892522?v=4
        val gravatar_id: String,
        val url: String, //https://api.github.com/users/freeCodeCamp
        val html_url: String, //https://github.com/freeCodeCamp
        val followers_url: String, //https://api.github.com/users/freeCodeCamp/followers
        val following_url: String, //https://api.github.com/users/freeCodeCamp/following{/other_user}
        val gists_url: String, //https://api.github.com/users/freeCodeCamp/gists{/gist_id}
        val starred_url: String, //https://api.github.com/users/freeCodeCamp/starred{/owner}{/repo}
        val subscriptions_url: String, //https://api.github.com/users/freeCodeCamp/subscriptions
        val organizations_url: String, //https://api.github.com/users/freeCodeCamp/orgs
        val repos_url: String, //https://api.github.com/users/freeCodeCamp/repos
        val events_url: String, //https://api.github.com/users/freeCodeCamp/events{/privacy}
        val received_events_url: String, //https://api.github.com/users/freeCodeCamp/received_events
        val type: String, //Organization
        val site_admin: Boolean //false
    )
}