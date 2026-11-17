package com.meray.core.data.repository.job

import com.meray.core.data.repository.customer.CustomerRepository
import com.meray.core.model.Customer
import com.meray.core.model.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.map

class InMemoryJobRepository(
    private  val customerRepository: CustomerRepository
) : JobRepository {

    private data class StoredJob(
        val id : String,
        val title : String,
        val customerID : String
    )

    private val jobs = MutableStateFlow(
        (1..10).flatMap { customerNumber ->
            (1..10).map{jobNumber ->
                StoredJob(
                    id = "$customerNumber-$jobNumber",
                    title = "job $jobNumber",
                    customerID = "$customerNumber"
                )

            }
        }
    )


    override fun observeJobs(): Flow<List<Job>> = combine(
        jobs, customerRepository.observeCustomer()
    ){
        storedJobs, customers ->
        val customerById = customers.associateBy { it.id }
        storedJobs.map{
            Job(id = it.id, it.title, customerById.getValue(it.customerID))
        }
    }

}