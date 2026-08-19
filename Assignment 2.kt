package com.project.lib

fun convert(name : Array<String?>){
    // TODO
    // convert the name in array into uppercase -
    // use explicit null check , safe call operator
    // elvis operator , assertion operator
    for (ch in name) {

        // Explicit null check
        if (ch != null) {
            println(ch.uppercase())
        }

        // Safe call operator
        println(ch?.uppercase())

        // Elvis operator
        println(ch ?: "Unknown")

        // Assertion operator
        if (ch!= null) {
            println(ch!!.uppercase())
        }
    }
}
fun main(){
    convert(name=arrayOf("john", null, "merry", "robert"))
}
