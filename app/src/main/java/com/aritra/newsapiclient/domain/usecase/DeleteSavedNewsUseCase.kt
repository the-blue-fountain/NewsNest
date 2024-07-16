package com.aritra.newsapiclient.domain.usecase

import com.aritra.newsapiclient.data.model.Article
import com.aritra.newsapiclient.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}