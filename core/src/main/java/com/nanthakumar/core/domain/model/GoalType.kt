package com.nanthakumar.core.domain.model

sealed class GoalType(val name: String) {
    object LoseWeight: GoalType("loose_weight")
    object KeepWeight: GoalType("keep_weight")
    object GainWeight: GoalType("gain_weight")

    companion object {
        fun fromString(name: String): GoalType {
            return when(name) {
                "loose_weight" -> LoseWeight
                "keep_weight" -> KeepWeight
                "gain_weight" -> GainWeight
                else -> KeepWeight
            }
        }
    }
}
