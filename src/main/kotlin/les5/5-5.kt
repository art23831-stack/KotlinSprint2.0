package org.example.les5

fun main() {

    val winNumbers = (0..42).shuffled().take(3)
    val userNumbers = mutableListOf<Int>()

    println("Print 3 number from 0 to 42:")

    repeat(3) { i ->
        while (true) {
            print("Число ${i + 1}: ")
            val input = readln()
            val num = input?.toIntOrNull()
            if (num != null && num in 0..42) {
                userNumbers.add(num)
                break
            } else {
                println("Please, print number from 0 to 42.")
            }
        }
    }

    val matches = winNumbers.intersect(userNumbers)
    val matchesCount = matches.size

    when (matchesCount) {
        3 -> println("Congratulation! You guessed all three numbers and hit the jackpot!")
        2 -> println("You guessed two numbers and won a big prize!")
        1 -> println("You guessed one number and received a consolation prize.")
        else -> println("Unfortunately, you didn't guess any numbers.")
    }

    println("Win number: $winNumbers")
}