package data.output.recommendation

enum class ActivityRecommendation(vararg comment: String) : Recommendation {

    VACUUM,
    PROSTIRANIA,
    BIRPY,
    SWIRLING,
    ANAEROBIC("анаэробные упражнения без кислорода", "силовые тренировки с большим весом, мало повторений", "раз в неделю"),
    AEROBIC("аэробные упражнения с кислородом", "спринт, хайкинг, турники", "3 раза в неделю")
}