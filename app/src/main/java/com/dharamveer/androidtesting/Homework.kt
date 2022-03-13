package com.dharamveer.androidtesting

import java.util.*


/**
 * Created by Dharamveer Gupta on 05-March-2022 9:20 PM,
 * dharamveer.gupt@gmail.com,
 * Roundr,
 * Navi Mumbai, Maharashtra, India.
 */
object Homework {
    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */

    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }
        var a = 0L
        var b = 1L
        var c = 1L
        (1..n-2).forEach { i ->
            c = a + b
            a = b
            b = c
        }
        return c
    }

    /**
     * Checks if the braces are set correctly
     * e.g. "(a * b))" should return false
     */
    fun checkBraces(s: String): Boolean {
//        return s.count { it == '(' } == s.count { it == ')' }

        // Stack to store left symbols
        val leftSymbols = Stack<Char>()
        // Loop for each character of the string
        s.toCharArray().forEach { c ->
            // if left symbol is encountered
            if (c == '(') {/*Also we can check other braces by using OR*/
                leftSymbols.push(c)
            }
            // if right symbol is encountered
            if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
                leftSymbols.pop()
            } // we can check for other end braces
        }
        return leftSymbols.isEmpty()
    }
}