package data.input

enum class Feeling(vararg comment: String) : Symptom {

    RHINITIS("насморк"),
    WEAKNESS("слабость"),
    DIZZINESS("головокружение"),
    SLEEPINESS("сонливость"),
    FATIGUE("утомление"),
    LIMBS_TINGLE("покалывание в конечностях"),
    LOW_MEMORY("плохая память"),
    STOOL("стул"),
    VERTIGO("головокружение"),
    DRY_SKIN("сухая кожа"),
    DYSPNOEA("одышка"),
    WOUND_LIP("заед"),
    IRRITABILITY("раздражительность"),
    DEPRESSION("депрессия"),
    HYPOTHYROIDISM("гипотиреоз"),
    NAILS_DEFORMATION("деформация ногтей")
}