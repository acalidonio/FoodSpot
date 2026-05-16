package com.pdm0126.foodspot.screens.search

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdm0126.foodspot.repository.RestaurantRepository
import com.pdm0126.foodspot.repository.impl.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class SearchViewModel : ViewModel() {
    private val repository: RestaurantRepository = RestaurantRepositoryImpl()

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    init {
        onQueryChanged("")
    }

    fun onQueryChanged(newQuery: String) {
        viewModelScope.launch {
            val searchResults = if (newQuery.isBlank() || newQuery.isEmpty())  {
                repository.getRestaurants()
            } else {
                repository.searchRestaurants(newQuery)
            }

            _uiState.value = SearchUiState(newQuery, searchResults)
        }
    }
}