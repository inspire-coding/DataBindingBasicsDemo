package com.inspirecoding.databindingbasicsdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LikesViewModel: ViewModel()
{
    val target = 100

    private val _name = MutableLiveData<String>("Inspire Coding")
    val name: LiveData<String> = _name

    private val _yourLikes = MutableLiveData<Int>(0)
    val yourLikes: LiveData<Int> = _yourLikes

    fun increaseLikes()
    {
        _yourLikes.value = (_yourLikes.value ?: 0) + 1
    }
}