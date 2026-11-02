package com.meray.core.model

import kotlinx.serialization.Serializable

@Serializable
data class Job(
    val id: String,
    val title: String,
    val customer: Customer,
    val generalDrawURL: String? = null,
    val operations: List<Operation> = emptyList()
)