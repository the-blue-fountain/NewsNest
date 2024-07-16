package com.aritra.newsapiclient.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.aritra.newsapiclient.data.model.Article

@Database(
    entities = [Article::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converters::class)
abstract  class ArticleDatabase : RoomDatabase(){
    abstract fun getArticleDAO():ArticleDAO
}

