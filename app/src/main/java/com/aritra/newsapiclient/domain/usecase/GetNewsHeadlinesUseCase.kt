package com.aritra.newsapiclient.domain.usecase

import com.aritra.newsapiclient.data.model.APIResponse
import com.aritra.newsapiclient.data.util.Resource
import com.aritra.newsapiclient.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String, page : Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}