package com.dharamveer.androidtesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by Dharamveer Gupta on 05-March-2022 9:30 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
class HomeworkTest {

    /*
    * When an zero is entered it should return zero
    * */
    @Test
    fun `zero as input return 0`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `-ve as input return error`() {
        val result = Homework.fib(-5)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `+ve as input return output`() {
        val result = Homework.fib(5)
        assertThat(result).isAtLeast(1)
    }

    @Test
    fun `invalid brace return false`() {
        val result = Homework.checkBraces("(Str")
        assertThat(result).isFalse()
    }

    @Test
    fun `reverse brace return false`() {
        val result = Homework.checkBraces(")Str(")
        assertThat(result).isFalse()
    }

    @Test
    fun `valid brace return true`() {
        val result = Homework.checkBraces("(Str)")
        assertThat(result).isTrue()
    }
}