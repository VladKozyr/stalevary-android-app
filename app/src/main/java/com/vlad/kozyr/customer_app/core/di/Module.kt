package com.vlad.kozyr.customer_app.core.di

import com.vlad.kozyr.customer_app.data.LoginDataSource
import com.vlad.kozyr.customer_app.data.LoginRepository
import com.vlad.kozyr.customer_app.ui.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

class DependencyProvider {

}

val authModule = module {
    single { LoginDataSource() }
    single { LoginRepository(dataSource = get()) }
    viewModel { LoginViewModel(loginRepository = get()) }
}