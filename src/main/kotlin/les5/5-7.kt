package org.example.les5

fun main() {

    println("Print distance (km)")
    val distance = readln().toFloatOrNull() ?: 0f

    println("Print consumption on 100 km")
    val consumption = readln().toFloatOrNull() ?: 0f

    println("Print price")
    val price = readln().toFloatOrNull() ?: 0f

    val fuel = (distance * consumption) / 100f
    val totalCost = fuel * price

    println("Required amount of fuel: %.2f".format(fuel))
    println("Total fuel cost: %.2f".format(totalCost))

}