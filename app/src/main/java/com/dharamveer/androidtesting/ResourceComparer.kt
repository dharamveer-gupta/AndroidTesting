package com.dharamveer.androidtesting

import android.content.Context


/**
 * Created by Dharamveer Gupta on 05-March-2022 10:31 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
class ResourceComparer {

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }
}