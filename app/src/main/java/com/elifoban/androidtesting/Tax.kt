package com.elifoban.androidtesting

class Tax {

    //TDD - Test Driven Development
    // is a software development approach where tests are written before the actual code, guiding the development process and ensuring that the code meets the specified requirements.


    fun calculateTax(grossIncome: Double, taxRate: Double) : Double{
        return grossIncome * taxRate
    }

    fun calculateIncome(grossIncome:Double, taxRate: Double): Double{
        return grossIncome - (grossIncome * taxRate)
    }
}