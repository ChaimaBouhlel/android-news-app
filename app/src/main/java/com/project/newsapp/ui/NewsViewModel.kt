package com.project.newsapp.ui

import androidx.lifecycle.ViewModel
import com.project.newsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
): ViewModel() {
}