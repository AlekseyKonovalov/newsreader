package ru.example.newsreader.room.Entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import ru.example.newsreader.models.ArticleKt

@Entity
class ArticleEntity(
        @NotNull
        @PrimaryKey
        var title : String,
        var description : String,
        var pubDate : String,
        var link : String,
        var source : String
) {
    fun convertToArticle() : ArticleKt {
        var article = ArticleKt()
        article.title = this.title
        article.description=this.description
        article.pubDate=this.pubDate
        article.link=this.link
        return article
    }
}