package com.aritra.newsapiclient.presentation.di

import com.aritra.newsapiclient.data.db.ArticleDAO
import com.aritra.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.aritra.newsapiclient.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):NewsLocalDataSource{
      return NewsLocalDataSourceImpl(articleDAO)
    }

}













