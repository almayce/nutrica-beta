package data.nutraceutical

import data.input.Analysable
import data.nutraceutical.Nutraceutical
import data.parameters.Countable

enum class Micronutrient(vararg comment: String) : Nutraceutical, Analysable, Countable {

    C("водорастворимый"),
    B("водорастворимый"),
    B12("водорастворимый"),
    A("жирорастворимый"),
    D("жирорастворимый"),
    E("жирорастворимый"),
    K("жирорастворимый"),

    MINERALS(),
    FLUOR(),
    ZINK(),
    IRON(),
    COPPER(),
    MANGANESE(),
    IODINE(),
    SELEN(),
    MOLYBDENUM(),

    POTASSIUM(),
    CHOLINE(),
    FOLATE(),
    CALCIUM(),
    PHOSPHOR(),
    SULFUR(),
}