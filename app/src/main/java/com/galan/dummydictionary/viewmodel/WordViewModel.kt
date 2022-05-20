package com.galan.dummydictionary.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.galan.dummydictionary.data.model.Word
import com.galan.dummydictionary.repository.DictionaryRepository
import kotlinx.coroutines.launch

class WordViewModel(private val repository: DictionaryRepository): ViewModel() {
    val words = repository.getAllWords()

    fun addWord(word: Word) {
        viewModelScope.launch {
            repository.addWord(word)
        }
    }
}