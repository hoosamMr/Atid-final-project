package com.meray.core.model

import kotlinx.serialization.Serializable


@Serializable
data class Machine(val id : String,val type : String, val number : Int)