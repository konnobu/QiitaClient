package xyz.yurue.nobu.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import xyz.yurue.nobu.qiitaclient.model.Article
import xyz.yurue.nobu.qiitaclient.model.User
import xyz.yurue.nobu.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ArticleViewオブジェクトを生成
        val articleView = ArticleView(applicationContext)

        // Articleオブジェクトを生成して、ArticleViewオブジェクトにセット
        articleView.setArticle(Article(id = "123",
                title = "Kotlin ことはじめ",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "konnobu", profileImageUrl = "")))

        // このアクティビティにArticleViewオブジェクトをセット
        setContentView(articleView)
    }
}
