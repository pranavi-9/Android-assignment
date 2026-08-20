package com.project.lib

// functional programming and collections
fun main(){
    val phoneNumbers= listOf<String>("1234567890","123","","0987654321")
    /*
    1. filter the valid phone numbers - 10 digits (filter)
    2. using lambda,print all phone numbers, if invalid - print 'NAN'(forEach() and map )
    */
    val validPhoneNumbers= phoneNumbers.filter({ element ->
            element.length == 10
    })
    println("valid phone numbers = $validPhoneNumbers")
    // using lambda
    phoneNumbers.forEach({ ch ->
        if (ch.length == 10) {
            println("phone number = $ch")
        } else
            println("NAN")
    })
    //using map
    val result= phoneNumbers.map{
        if(it.length==10){
            "$it"
        }
        else{
            "NAN"

        }
    }
    println("phone numbers: $result")

}
