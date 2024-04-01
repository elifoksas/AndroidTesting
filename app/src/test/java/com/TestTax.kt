package com

import com.elifoban.androidtesting.Tax
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TestTax {

    private lateinit var tax : Tax
    @Before
    fun setup(){
        //This runs before the tests run

        tax = Tax()
    }

    @After
    fun teardown(){
        //runs after tests are finished
    }
    @Test
    fun calculateTaxTest(){
        val netTax = tax.calculateTax(100.0,0.1)
        assertThat(netTax).isEqualTo(10)


    }
    @Test
    fun calculateIncomeTest(){
        val netIncome = tax.calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)
    }


}