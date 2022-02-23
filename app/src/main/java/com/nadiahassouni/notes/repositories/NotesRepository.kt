package com.nadiahassouni.notes.repositories

import androidx.lifecycle.LiveData
import com.nadiahassouni.notes.database.NoteDao
import com.nadiahassouni.notes.database.entities.Note

class NotesRepository(private val noteDao: NoteDao) {

    val allNotes: LiveData<List<Note>> = noteDao.getAllNotes()

    suspend fun insert(note: Note) {
        noteDao.insertNote(note)
    }
    suspend fun delete(note: Note){
        noteDao.deleteNote(note)
    }
    suspend fun update(note: Note){
        noteDao.updateNote(note)
    }
}