package com.inspirecoding.databindingbasicsdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.inspirecoding.databindingbasicsdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    val likesViewModel by lazy {
        ViewModelProvider(this)
            .get(LikesViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
            )

        binding.lifecycleOwner = this
        binding.likesViewModel = likesViewModel
    }
}
