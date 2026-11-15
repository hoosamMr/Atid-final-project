package com.meray.ldb.di

import com.meray.core.data.repository.InMemoryJobRepository
import com.meray.core.data.repository.JobRepository
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
