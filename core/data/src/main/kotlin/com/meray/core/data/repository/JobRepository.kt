package com.meray.core.data.repository

import com.meray.core.model.Job
import kotlinx.coroutines.flow.Flow

interface JobRepository {
    fun observeJobs(): Flow<List<Job>>
}