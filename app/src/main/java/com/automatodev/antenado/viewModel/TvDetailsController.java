package com.automatodev.antenado.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.automatodev.antenado.models.TvDetails;
import com.automatodev.antenado.repository.TvDetailsService;

public class TvDetailsController extends ViewModel {

    private TvDetailsService tvDetailsService;

    public TvDetailsController(){
       tvDetailsService = new TvDetailsService();
    }

    public LiveData<TvDetails>  getDetailsTvShow(String id){
        return tvDetailsService.getDetailsTvShow(id);
    }
}