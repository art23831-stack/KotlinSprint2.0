package org.example.les5

fun main() {

    println("Print weight in kg")
    val weight = readln()?.toFloatOrNull()
    println("Print heigh in cm")
    val height = readln()?.toFloatOrNull()

    if (weight == null || height == null || weight <= 0 || height <= 0) {
        println("Error: Please enter valid numerical values for weight and height.")
        return
    }

    val centimetersInMeters = 100
    val heightInMeters = height / centimetersInMeters
    val imt = weight / (heightInMeters * heightInMeters)

    println("You IMT: %.2f".format(imt))

    if (imt < 18.5) {
        println("Lack of weight")
    }
    else if (imt >= 18.5 && imt < 25) {
        println("Normal body weight")
    }
    else if (imt >= 25 && imt < 30) {
        println("Oerweight")
    }
    else if (imt > 30) {
        println("Obesity")
    }


}