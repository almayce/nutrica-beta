package data.input

import data.DietaryRestriction
import data.DietaryRestriction.*
import data.input.Analyse.*
import data.input.AnalyseResult.*
import data.input.Feeling.*
import data.input.Inspection.*
import data.nutraceutical.FoodSuppliement.BETAIN
import data.nutraceutical.FoodSuppliement.PEPSIN
import data.nutraceutical.HealthyNutrition.*
import data.nutraceutical.Micronutrient.*
import data.nutraceutical.Nutraceutical

enum class State(
    val symptoms: List<Symptom>,
    val dietaryRestrictions: List<DietaryRestriction>,
    val healthyNutrition: List<Nutraceutical>,
    val analyses: List<Analysable>
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
        dietaryRestrictions = listOf(),
        healthyNutrition = listOf(
            APPLE_VINEGAR, BETAIN, PEPSIN, IRON, C, MINERALS, B, D
        ),
        analyses = listOf(BLOOD_COMMON, PROTEIN_COMMON, FERRITIN, FOLIE_ACID, BLOOD_B12, D, COPPER, ZINK)
    )
}