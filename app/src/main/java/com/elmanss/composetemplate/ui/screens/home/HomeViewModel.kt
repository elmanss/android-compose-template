package com.elmanss.composetemplate.ui.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import java.text.DateFormat
import java.util.Date
import javax.inject.Inject
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update

@HiltViewModel
class HomeViewModel @Inject constructor(private val dateFormat: DateFormat) : ViewModel() {
  private val _uiState = MutableStateFlow(HomeUiState())
  val uiState = _uiState.stateIn(viewModelScope, SharingStarted.Eagerly, HomeUiState())

  init {
    _uiState.update { state ->
      state.copy(
          greeting =
              "Hello, stranger. Today is ${dateFormat.format(
      Date()
    )}")
    }
  }
}
