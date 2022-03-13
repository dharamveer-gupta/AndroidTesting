package com.dharamveer.androidtesting.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by Dharamveer Gupta on 08-March-2022 9:54 AM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
@Entity(tableName = "shopping_items")
data class ShoppingItem(
    var name: String,
    var amount: Int,
    var price: Float,
    var imageUrl: String,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)
