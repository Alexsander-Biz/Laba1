package com.example.laba1

import kotlin.random.Random

class Random {
    var numbers: List<Int> = listOf()

    init {
        updateNumbers()
    }

    fun updateNumbers(){
        numbers = List(10) {Random.nextInt(-10,11) }
    }

    fun polo(): Int {
      return numbers.count { it >= 0}
    }

    fun summa(): Int {
        var s: Int = 0
        for (i  in numbers  )
        {
            if (i <0)
            {
               s += i
            }
        }
        return s
    }
}