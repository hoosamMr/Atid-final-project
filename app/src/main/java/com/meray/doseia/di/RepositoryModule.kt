package com.meray.doseia.di

import com.meray.core.data.repository.job.InMemoryJobRepository
import com.meray.core.data.repository.job.JobRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideJobRepository(): JobRepository = InMemoryJobRepository()
}
