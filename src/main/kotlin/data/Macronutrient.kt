package data

enum class Macronutrient(vararg comment: String) {

    PROTEIN("do not mix with carbohydrate", "1/5 with fats"),
    ANIMAL_FAT("do not mix with carbohydrate"),
    FAT("do not mix with carbohydrate"),
    CARBOHYDRATE("consume in the morning", "do not consume food with high sugar content (< 4gr/100)"),
}