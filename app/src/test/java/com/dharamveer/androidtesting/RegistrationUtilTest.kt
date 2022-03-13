package com.dharamveer.androidtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

/**
 * Created by Dharamveer Gupta on 04-March-2022 10:53 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        var result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Dharamveer",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Peter",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Dharamveer",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Dharamveer",
            "123",
            "456"
        )
        assertThat(result).isFalse()
    }
    
    @Test
    fun `than 2 character password return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Dharamveer",
            "1",
            "1"
        )
        assertThat(result).isFalse()
    }

}