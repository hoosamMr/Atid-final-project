package com.meray.core.data.repository.customer

import com.meray.core.model.Customer
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class InMemoryCustomerRepository : CustomerRepository {

    private val customer = MutableStateFlow(

            (1..10).map {
                Customer(id = "$it", name = "Customer $it")
            }

    )

    override fun observeCustomer(): Flow<List<Customer>> = customer.asStateFlow()
}