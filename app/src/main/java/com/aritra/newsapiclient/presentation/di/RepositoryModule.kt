package com.aritra.newsapiclient.presentation.di

import com.aritra.newsapiclient.data.repository.NewsRepositoryImpl
import com.aritra.newsapiclient.data.repository.dataSource.NewsLocalDataSource
import com.aritra.newsapiclient.data.repository.dataSource.NewsRemoteDataSource
import com.aritra.newsapiclient.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        newsRemoteDataSource: NewsRemoteDataSource,
        newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {
        return NewsRepositoryImpl(
            newsRemoteDataSource,
            newsLocalDataSource
        )
    }

}














