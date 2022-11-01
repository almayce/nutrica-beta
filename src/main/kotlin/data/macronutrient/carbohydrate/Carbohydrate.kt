package data.macronutrient.carbohydrate

enum class Carbohydrate(vararg comment: String)  {

    SIMPLE_CARBOHYDRATE("ГИ выше 75"),
    COMPLEX_CARBOHYDRATE("ГИ ниже 50"),
    FIBER("растительные волокна"),
    STARCH("цельнозерновые", "бобовые"),
    PECTIN("яблоки", "сливы"),
    GLYCOGEN("печень", "мышцы")
}

