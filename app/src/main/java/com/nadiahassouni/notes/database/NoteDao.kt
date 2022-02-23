package com.nadiahassouni.notes.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.nadiahassouni.notes.database.entities.Note

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note : Note)

    @Update
    suspend fun updateNote(note: Note)

    @Delete
    fun deleteNote(note: Note)

    @Query("SELECT * FROM notes" )
    fun getAllNotes():LiveData<List<Note>>
}