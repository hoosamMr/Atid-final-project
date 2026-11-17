package com.meray.doseia.customers

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
@Composable
internal fun CustomersScreen(
    modifier: Modifier,
    viewModel: CustomersViewModel = hiltViewModel()
){
    val customers by viewModel.customers.collectAsStateWithLifecycle(
        initialValue = emptyList()
    )
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(customers, key = {it.id}){customer ->
            Text(
                text = customer.name,
                modifier = modifier.padding(vertical = 8.dp)
            )
        }
    }
}


