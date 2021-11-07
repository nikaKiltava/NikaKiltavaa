package com.example.nikakiltava

class Person {
    var name = ""
    var lastName = ""
    var age = 0
    var email = ""
    override fun toString(): String {
        return "$name, $lastName, $age, $email"
    }
}

fun main(){
    var person1 = Person()
    person1.name = "Nika"
    person1.lastName = "Kiltava"
    person1.age = 18
    person1.email = "nika.kiltava.1@btu.edu.ge"
    println(person1)
}