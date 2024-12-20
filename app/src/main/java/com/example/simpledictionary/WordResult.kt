package com.example.simpledictionary

data class WordResult(
    val word: String,
    val phonetics: List<Phonetic>,
    val meanings: List<Meaning>
)
data class Phonetic(
    val audio: String,
    val sourceUrl: String?,
    val text: String?,
)


data class Meaning(
    val partOfSpeech: String,
    val definitions: List<Definition>,
    val synonyms: List<String>,
    val antonyms: List<String>
)

data class Definition(
    val definition: String
)