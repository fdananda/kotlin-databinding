package com.fdananda.gitkotlindatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyNewViewModel: ViewModel() {

    val message = MutableLiveData<String>()

    fun setMessage(text: String){
        message.value = text
    }
}