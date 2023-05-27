package com.sample.wewatch.main

import com.sample.wewatch.model.Movie

class MainContract {
    interface PresenterInterface {
        //TODO: добавить методы интерфейса для Presenter
        fun getMyMoviesList()
        fun stop()
    }
    interface ViewInterface {
        fun displayMovies (movieList: List <Movie>)
        fun displayNoMovies ()
        fun displayMessage (message: String )
        fun displayError (message: String )
    }
}