package com.galan.dummydictionary

import android.app.Application
import com.galan.dummydictionary.data.model.DummyDictionaryDatabase
import com.galan.dummydictionary.repository.DictionaryRepository

class DummyDictionaryApplication : Application() {
    val dataBase by lazy {
        DummyDictionaryDatabase.getInstance(this)
    }

    fun getDictionaryRepository() = with(dataBase) {
        DictionaryRepository(wordDao(), synonymDao(), antonymDao())
    }
}