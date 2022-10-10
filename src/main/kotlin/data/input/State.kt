package data.input

import data.DietaryRestriction
import data.DietaryRestriction.*
import data.HealthyNutrition
import data.HealthyNutrition.*
import data.input.Analyse.*
import data.input.AnalyseResult.*
import data.input.Feeling.*
import data.input.Inspection.EXPECTORATION_OF_MUCUS
import data.input.Inspection.PALE_SKIN

enum class State(
    val symptoms: List<Symptom>,
    val dietaryRestrictions: List<DietaryRestriction>,
    val healthyNutrition: List<HealthyNutrition>,
    val analyses: List<Analyse>
) : Symptom {

    LOW_B12(
        symptoms = listOf(FATIGUE, PALE_SKIN, LIMBS_TINGLE, DIZZINESS, LOW_MEMORY, HIGH_HOMOCYSTEINE),
        dietaryRestrictions = listOf(SUGAR, COFFEE),
        healthyNutrition = listOf(RED_MEAT, LIVER),
        analyses = listOf(URINE_ORGANIC_ACIDS, GASTROINTESTINAL_TRACT)
    ),
    HIGH_B12(
        symptoms = listOf(VIOLATION_OF_INTESTINAL_MICROFLORA),
        dietaryRestrictions = listOf(SUGAR, CARBS),
        healthyNutrition = listOf(), //todo
        analyses = listOf(GASTROINTESTINAL_TRACT) //todo анализ на фетины
    ),
    B6_B9_BAD_CONSUMPTION(
        symptoms = listOf(LOW_B12),
        dietaryRestrictions = LOW_B12.dietaryRestrictions,
        healthyNutrition = LOW_B12.healthyNutrition,
        analyses = LOW_B12.analyses
    ),
    IRON_DEFICIENCY(
        symptoms = listOf(B6_B9_BAD_CONSUMPTION, LOW_OXYGEN_IN_CELLS),
        dietaryRestrictions = B6_B9_BAD_CONSUMPTION.dietaryRestrictions,
        healthyNutrition = B6_B9_BAD_CONSUMPTION.healthyNutrition,
        analyses = B6_B9_BAD_CONSUMPTION.analyses
    ),
    INFLAMMATION_OF_THE_MUCOUS_MEMBRANE(
        symptoms = listOf(EXPECTORATION_OF_MUCUS),
        dietaryRestrictions = listOf(SUGAR, GLUTEN, YEAST, LACTOSE, CASEIN),
        healthyNutrition = listOf(), //todo
        analyses = listOf(INSPECTION)
    ),
    LOW_IMMUNITY(
        symptoms = listOf(RHINITIS, DIZZINESS, WEAKNESS, SLEEPINESS),
        dietaryRestrictions = listOf(SUGAR, CEREALS),
        healthyNutrition = listOf(WARM_WATER, GREEN_ONION, GARLIC, KALE, PARSLEY, SORREL, SPINACH, VARIETY),
        analyses = listOf(BLOOD_COMMON, URINE_COMMON)
    )
}