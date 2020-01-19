package com.example.popularmoviesstage2.list;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.popularmoviesstage2.data.Movie;
import com.example.popularmoviesstage2.data.source.DefaultRepository;

import java.util.ArrayList;

public class ViewModelMovieList extends ViewModel {

    ViewModelMovieList(DefaultRepository repository) {
        this.repository = repository;
        dataTopRated = this.repository.getTopRated();
    }

    DefaultRepository repository;

    LiveData<ArrayList<Movie>> dataTopRated;

    //TODO(1 async call to repository's )
    public void initValue(){
        repository.getValue();
    }
}