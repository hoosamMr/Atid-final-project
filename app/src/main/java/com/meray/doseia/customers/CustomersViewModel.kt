package com.meray.doseia.customers

import androidx.lifecycle.ViewModel
import com.meray.core.data.repository.customer.CustomerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CustomersViewModel @Inject constructor(
    private val repository: CustomerRepository
) : ViewModel(){
    val customers = repository.observeCustomer()
}