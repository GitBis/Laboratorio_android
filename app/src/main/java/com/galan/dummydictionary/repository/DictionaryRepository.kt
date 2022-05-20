package com.galan.dummydictionary.repository

import com.galan.dummydictionary.data.model.Word
import com.galan.dummydictionary.data.model.dao.AntonymDao
import com.galan.dummydictionary.data.model.dao.SynonymDao
import com.galan.dummydictionary.data.model.dao.WordDao

class DictionaryRepository(
    private val wordDoa: WordDao,
    val synonymDao: SynonymDao,
    val antonymDao: AntonymDao

) {
    fun getAllWords() = wordDoa.getAllWords()

    suspend fun addWord(word: Word) {
        wordDoa.insertWord(word)
    }
}