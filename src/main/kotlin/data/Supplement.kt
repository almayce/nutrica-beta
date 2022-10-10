package data

import data.input.State
import data.input.State.LOW_B12

enum class Supplement(val state: List<State>, val comment: String) {

    METHYLCOBALAMIN(
        state = listOf(LOW_B12),
        comment = "analyzes + weight"
    ),
    ADENOSYLCOBALAMIN(
        state = listOf(LOW_B12),
        comment = "analyzes + weight"
    )
}