package br.com.petz.common.base.repository

import br.com.petz.di.data.repository.UserRepository
import br.com.petz.di.data.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideUserRepository(userRepository: UserRepositoryImpl): UserRepository
}