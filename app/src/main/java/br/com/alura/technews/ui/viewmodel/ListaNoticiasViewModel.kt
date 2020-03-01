package br.com.alura.technews.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class ListaNoticiasViewModel : ViewModel() {

    init{
        Log.i("ViewModel","criando viewModel")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("ViewModel","destruindo viewModel")
    }
}