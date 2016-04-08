package com.elpassion.problem

import java.util.UUID

class ProblemFactory(val name: String) {
    val uuid: UUID

    init {
        this.uuid = UUID.randomUUID()
    }

    fun createProblem() {
        throw UnexpectedChild(name + " " + uuid)
    }

    companion object {

        internal fun createProblemFactory(name: String): ProblemFactory {
            return ProblemFactory(name)
        }
    }
}
