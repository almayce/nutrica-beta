package data

enum class DietaryRestriction(vararg comment: String) {

    SUGAR("all kinds"),
    CARBS("exclude plant fiber"),
    GLUTEN(""),
    YEAST(""),
    LACTOSE(""),
    CASEIN("a1 -> betacasiomorphine 7"),
    CEREALS(""),
    COFFEE("уменьшает жировой гипотоз печени", "вымывает витамин б12")
}
