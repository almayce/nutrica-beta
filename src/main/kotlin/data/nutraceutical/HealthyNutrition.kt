package data.nutraceutical

import data.input.State
import data.input.Symptom

enum class HealthyNutrition(vararg comment: String) : Nutraceutical {

    WARM_WATER("temperature 40", "not too cold", "not more then 80 (dead water)", "without added minerals", "ph 7.5 - 9.0", "kg * 0.03 = liters"),

    GREEN_ONION,
    GARLIC,
    KALE,
    PARSLEY,
    SORREL,
    SPINACH("includes iron over limit!"),

    RED_MEAT("purines"),
    LIVER,

    VARIETY(),

    APPLE_VINEGAR(),

    WHOLE_GRAIN(),
    BEANS()
}