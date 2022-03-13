package com.dharamveer.androidtesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


/**
 * Created by Dharamveer Gupta on 05-March-2022 10:34 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context: Context
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext()
    }

    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "AndroidTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDiffAsGivenString_returnsFalse() {
        val result = resourceComparer.isEqual(context, R.string.app_name, "AndroidTest")
        assertThat(result).isFalse()
    }
}