package com.meray.core.data.repository

import com.meray.core.model.Customer
import com.meray.core.model.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class InMemoryJobRepository : JobRepository{

    private val jobs = MutableStateFlow(
        listOf(
            Job(
                id = "1",
                title = "Job 1",
                customer = Customer(
                    id = "1", name = "Customer 1"
                )
            )
        )
    )

    override fun observeJobs(): Flow<List<Job>> = jobs.asStateFlow()

}