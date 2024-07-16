package com.aritra.newsapiclient.domain.usecase

import com.aritra.newsapiclient.data.model.Article
import com.aritra.newsapiclient.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
        return newsRepository.getSavedNews()
    }
}