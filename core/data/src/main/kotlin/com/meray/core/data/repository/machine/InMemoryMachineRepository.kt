package com.meray.core.data.repository.machine

import com.meray.core.model.Machine
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class InMemoryMachineRepository  : MachineRepository{

    private val machine = MutableStateFlow(
        (1..10).map { machine ->
            Machine("$machine", "coming soon", machine)
        }
    )
    override fun observeMachines(): Flow<List<Machine>> = machine.asStateFlow()
}