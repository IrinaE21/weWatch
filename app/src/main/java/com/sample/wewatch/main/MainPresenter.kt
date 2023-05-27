package com.sample.wewatch.main

import com.sample.wewatch.model.LocalDataSource

class MainPresenter(
    private var viewInterface: MainContract.ViewInterface,
    private var dataSource: LocalDataSource): MainContract.PresenterInterface {

    private val TAG = "MainPresenter"
}