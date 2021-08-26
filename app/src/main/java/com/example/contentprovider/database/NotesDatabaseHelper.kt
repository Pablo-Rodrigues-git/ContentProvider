package com.example.contentprovider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper(
    context: Context
):SQLiteOpenHelper(context, "databaseNotes", null, 1 ) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE $TABLE_NOTES (" +
                    "$_ID INTEGER NOT NULL PRIMARY KEY , " +
                    "$TITTLE_NOTES TEXT NOT NULL, " +
                    "$DESCRIPION_NOTES TEXT NOT NULL, ")

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    companion object{
        const val TABLE_NOTES: String = "Notes"
        const val TITTLE_NOTES: String = "tittle"
        const val DESCRIPION_NOTES: String = "description"
    }

}