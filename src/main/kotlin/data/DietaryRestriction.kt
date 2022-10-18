package data

import data.nutraceutical.Micronutrient
import data.nutraceutical.Micronutrient.*

enum class DietaryRestriction(val macronutrient: Map<Micronutrient, Double>, vararg comment: String) {

    SUGAR(mapOf(), "all kinds"),
    CARBS(mapOf(), "exclude plant fiber"),
    GLUTEN(mapOf()),
    YEAST(mapOf()),
    LACTOSE(mapOf()),
    CASEIN(mapOf(), "a1 -> betacasiomorphine 7"),
    CEREALS(mapOf()),
    COFFEE(
        mapOf(),
        "уменьшает жировой гипотоз печени",
        "вымывает витамин б12",
        "желчегонный эффект",
        "ускорение перистатики"
    ),

    CHICKEN(
        mapOf(
            B12 to 0.30,
            ZINK to 1.94,
            IRON to 1.26,
            POTASSIUM to 223.00,
            CHOLINE to 65.90,
            FOLATE to 2.90
        ),
        "плохие условия выращивания",
        "некачественный корм",
        "красители и ароматизаторы",
        "омега3 1 к 14 омега6"
    ),

    BEEF(
        mapOf(
            B12 to 2.64,
            ZINK to 6.31,
            IRON to 2.60,
            POTASSIUM to 318.00,
            CHOLINE to 82.40,
            FOLATE to 7.10
        ),
        "плохие условия выращивания",
        "некачественный корм",
        "пурины",
        "омега3 1 к 9 омега6"
    )
}


