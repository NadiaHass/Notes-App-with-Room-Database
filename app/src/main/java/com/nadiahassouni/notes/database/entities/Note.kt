package com.nadiahassouni.notes.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notes")
class Note (
    var title : String,
    var description : String,
    var date : String,
    var priority : String
     ){
    @PrimaryKey(autoGenerate = true)
    var id: Int?= null

}