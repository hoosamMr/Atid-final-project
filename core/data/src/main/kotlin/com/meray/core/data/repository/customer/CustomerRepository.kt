package com.meray.core.data.repository.customer

import com.meray.core.model.Customer
import kotlinx.coroutines.flow.Flow

interface CustomerRepository {
    fun observeCustomer() : Flow<List<Customer>>
}