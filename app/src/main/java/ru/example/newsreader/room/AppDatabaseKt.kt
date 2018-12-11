
package ru.example.newsreader.room

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import ru.example.newsreader.room.Dao.ArticleDaoKt
import ru.example.newsreader.room.Dao.SourceDaoKt
import ru.example.newsreader.room.Entity.ArticleEntity
import ru.example.newsreader.room.Entity.SourceEntity

@Database(entities = [ArticleEntity::class, SourceEntity::class], version = 5)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getArticleDao() : ArticleDaoKt
    abstract fun getSourceDao() : SourceDaoKt
}
