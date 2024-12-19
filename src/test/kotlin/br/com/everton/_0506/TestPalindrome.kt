package br.com.everton._0506

import br.com.everton.section05._0507.isPalindrome
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

/*
    # Is palindrome

    ## Instructions

    Given a string, return true if the string is a palindrome or false if it is not. Palindromes are strings that form the
    same word if it is reversed. Include spaces and punctuation in determining if the string is a palindrome.

    ## Examples

    ```kotlin
    palindrome("civic") // true

    palindrome("abcdefg") // false
    ```
 */


/*
private fun isPalindrome(str: String): Boolean {
    TODO("not implemented")
}
*/

class Test {

    @Test
    fun `"civic" is a palindrome`() {
        isPalindrome("civic") shouldBeEqualTo true
    }

    @Test
    fun `" civic" is not a palindrome`() {
        isPalindrome(" civic") shouldBeEqualTo false
    }

    @Test
    fun `"civic " is not a palindrome`() {
        isPalindrome("civic ") shouldBeEqualTo false
    }

    @Test
    fun `"greetings" is not a palindrome`() {
        isPalindrome("greetings") shouldBeEqualTo false
    }

    @Test
    fun `"1000000001" a palindrome`() {
        isPalindrome("1000000001") shouldBeEqualTo true
    }

    @Test
    fun `"Fish hsif" is not a palindrome`() {
        isPalindrome("Fish hsif") shouldBeEqualTo false
    }

    @Test
    fun `"pennep" a palindrome`() {
        isPalindrome("pennep") shouldBeEqualTo true
    }
}