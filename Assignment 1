package com.project.lib

fun main() {
    val data = "Hi ! how are you?"
    var vowels = 0
    var spaces = 0
    for (ch in data.lowercase()) {


// when as an expression:(should return a value), else is mandatory
        vowels += when (ch) {
            'a', 'e', 'i', 'o', 'u' -> {
                println("vowels found: $ch")
                1
            }

            else -> 0
        }
        spaces += when (ch) {
            ' ' -> 1
            else -> 0

        }

    }
    println("space count: $spaces")
    println("vowels:$vowels")
}

