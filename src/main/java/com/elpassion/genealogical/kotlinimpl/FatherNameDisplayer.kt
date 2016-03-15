package com.elpassion.genealogical.kotlinimpl

interface Person {

    val father: Person?
    val name: String?
}

class FatherNameDisplayer {

    fun display(person: Person): String {

        return "Name not known"
    }
}
