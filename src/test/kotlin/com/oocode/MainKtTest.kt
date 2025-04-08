package com.oocode

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import max_elves
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MainKtTest {
    @Test
    @Disabled
    fun test_1() {
        assertThat(max_elves("1000\n" +
                "2000\n" +
                "3000\n" +
                "\n" +
                "4000\n" +
                "\n" +
                "5000\n" +
                "6000\n" +
                "\n" +
                "7000\n" +
                "8000\n" +
                "9000\n" +
                "\n" +
                "10000"), equalTo("24000"))
    }
    @Test
    fun test_2() {
        assertThat(max_elves("1000"), equalTo("1000"))
    }
}
