package com

import com.elifoban.androidtesting.Tax
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class TestTax {
    @Test
    fun calculateTaxTest(){
        val tax = Tax()
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)


    }


}