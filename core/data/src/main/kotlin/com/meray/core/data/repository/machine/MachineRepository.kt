package com.meray.core.data.repository.machine

import com.meray.core.model.Machine
import kotlinx.coroutines.flow.Flow

interface MachineRepository {
    fun observeMachines() : Flow<List<Machine>>
}