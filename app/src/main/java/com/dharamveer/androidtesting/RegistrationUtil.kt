package com.dharamveer.androidtesting


/**
 * Created by Dharamveer Gupta on 04-March-2022 10:45 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
object RegistrationUtil {

    private val existingUser = listOf("Peter", "John")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirm password is not the same as real password
     * ...the password contains less than 2 characters
     */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUser) {
            return false
        }
        if (password != confirmPassword) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }

}