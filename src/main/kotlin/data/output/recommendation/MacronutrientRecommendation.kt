package data.output.recommendation

enum class MacronutrientRecommendation(vararg comment: String) : Recommendation {

    COMPLEX_CARBS(
        "полностью из сложных углеводов",
        "продукты с гликемическим индексом ниже 50",
        "в первой половине дня",
        "каша + овощи или фрукты, паста, цельнозерновой хлеб, бобовые"
    ),
    PROTEIN_WITH_FATS_AND_FIBER(
        "во второй половине дня",
        "мясо, рыба или птица + салат заправленный маслом любых семян"
    )
}