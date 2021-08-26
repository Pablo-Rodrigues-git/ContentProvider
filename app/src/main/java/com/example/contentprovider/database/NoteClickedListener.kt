package com.example.contentprovider.database

import android.database.Cursor

interface NoteClickedListener {
    fun noteClickeditem(cursor: Cursor)
    fun noteRemoveItem(cursor: Cursor?)
}

