package data.output.recommendation

enum class RoutineRecommendation(vararg comment: String) : Recommendation {

    FOUR_HOURS_WINDOW("4х часовое окно приема пищи"),
    INTERVAL_FASTING("интервальное питание"),
    FASTING("интервальное голодание 48 часов каждые 2 недели")
}