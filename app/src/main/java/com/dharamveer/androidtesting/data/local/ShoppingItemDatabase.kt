package com.dharamveer.androidtesting.data.local

import androidx.room.Database
import androidx.room.RoomDatabase


/**
 * Created by Dharamveer Gupta on 08-March-2022 10:30 AM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */

@Database(
    entities = [ShoppingItem::class],
    version = 1
)
abstract class ShoppingItemDatabase: RoomDatabase() {
    abstract fun shoppingDao(): ShoppingDao
}