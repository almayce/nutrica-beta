package data.input

enum class Inspection(vararg comment: String) : Symptom {

    PALE_SKIN(),
    EXPECTORATION_OF_MUCUS(),
    GRAY_HAIR(),
    PIGMENTATION(),
    INFLAMMATION("воспаления ведут к обр. рак-х опухолей")
}
