package data.input

import data.nutraceutical.FoodSuppliement.BETAIN
import data.nutraceutical.FoodSuppliement.PEPSIN
import data.nutraceutical.Micronutrient.*
import data.nutraceutical.Nutraceutical
import data.output.recommendation.MacronutrientRecommendation.COMPLEX_CARBS
import data.output.recommendation.MacronutrientRecommendation.PROTEIN_WITH_FATS_AND_FIBER
import data.output.restriction.MacronutrientRestriction.*

enum class State(
    val symptoms: List<Symptom>,
    val restrictions: List<Restriction>,
    val recommendations: List<Recommendation> = listOf(),
    val nutraceuticals: List<Nutraceutical>,
    val analyses: List<Analysable>
) : Symptom {

    LOW_B12(
        symptoms = listOf(FATIGUE, PALE_SKIN, LIMBS_TINGLE, DIZZINESS, LOW_MEMORY, HIGH_HOMOCYSTEINE),
        restrictions = listOf(SUGAR, COFFEE),
        nutraceuticals = listOf(RED_MEAT, LIVER),
        analyses = listOf(URINE_ORGANIC_ACIDS, GASTROINTESTINAL_TRACT)
    ),
    HIGH_B12(
        symptoms = listOf(VIOLATION_OF_INTESTINAL_MICROFLORA),
        restrictions = listOf(SUGAR, CARBS),
        nutraceuticals = listOf(), //todo
        analyses = listOf(GASTROINTESTINAL_TRACT) //todo анализ на фетины
    ),
    B6_B9_BAD_CONSUMPTION(
        symptoms = listOf(LOW_B12),
        restrictions = LOW_B12.restrictions,
        nutraceuticals = LOW_B12.nutraceuticals,
        analyses = LOW_B12.analyses
    ),
    IRON_DEFICIENCY(
        symptoms = listOf(B6_B9_BAD_CONSUMPTION, LOW_OXYGEN_IN_CELLS),
        restrictions = B6_B9_BAD_CONSUMPTION.restrictions,
        nutraceuticals = B6_B9_BAD_CONSUMPTION.nutraceuticals,
        analyses = B6_B9_BAD_CONSUMPTION.analyses
    ),
    INFLAMMATION_OF_THE_MUCOUS_MEMBRANE(
        symptoms = listOf(EXPECTORATION_OF_MUCUS),
        restrictions = listOf(SUGAR, GLUTEN, YEAST, LACTOSE, CASEIN),
        nutraceuticals = listOf(), //todo
        analyses = listOf(INSPECTION)
    ),
    LOW_IMMUNITY(
        symptoms = listOf(RHINITIS, DIZZINESS, WEAKNESS, SLEEPINESS),
        restrictions = listOf(SUGAR, CEREALS),
        nutraceuticals = listOf(WARM_WATER, GREEN_ONION, GARLIC, KALE, PARSLEY, SORREL, SPINACH, VARIETY),
        analyses = listOf(BLOOD_COMMON, URINE_COMMON)
    ),
    LOW_IRON(
        symptoms = listOf(
            WEAKNESS,
            DIZZINESS,
            GRAY_HAIR,
            PIGMENTATION,
            DRY_SKIN,
            DYSPNOEA,
            WOUND_LIP,
            IRRITABILITY,
            DEPRESSION,
            HYPOTHYROIDISM,
            NAILS_DEFORMATION
        ),
        restrictions = listOf(),
        nutraceuticals = listOf(
            APPLE_VINEGAR, BETAIN, PEPSIN, IRON, C, MINERALS, B, D
        ),
        analyses = listOf(BLOOD_COMMON, PROTEIN_COMMON, FERRITIN, FOLIE_ACID, BLOOD_B12, D, COPPER, ZINK)
    ),
    LOW_HEALTH(
        symptoms = listOf(), //todo
        restrictions = listOf(SIMPLE_CARBS, CARBS_WITH_FATS, CARBS_WITH_PROTEIN),
        recommendations = listOf(COMPLEX_CARBS, PROTEIN_WITH_FATS_AND_FIBER, FOUR_HOURS_WINDOW, INTERVAL_FASTING, FASTING),
        nutraceuticals = listOf(), //todo
        analyses = listOf() //todo
    )
}