package com.meray.core.model

import kotlinx.serialization.Serializable

@Serializable
data class Operation(
    val id : String,
    val operationNumber : Int,
    val title : String,
    val drawURL : String? = null,
    val instructions : String? = null,
    val machineID : String? = null,
    val tools : List<Tool> = emptyList()
)