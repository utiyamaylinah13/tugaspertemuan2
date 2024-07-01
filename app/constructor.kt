package app

import data.car

fun main() {
    val civic = car(paramMerek = "turbo")

    println(civic.merek)
    println(civic.year)
}