package com.meray.core.model

import kotlinx.serialization.Serializable

@Serializable
data class Tool(
    val id : String,
    val toolNumber : Int,
    val type : String, // string for now, maybe enum later of face mill, Drills, taps,...
    val diameter : Double,
    val stickOutLength : Double? = null,
)