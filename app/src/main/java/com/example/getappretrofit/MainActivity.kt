package com.example.getappretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.getappretrofit.databinding.ActivityMainBinding
import com.example.getappretrofit.repository.Repository

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //events
        binding.buttonRequest.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view?.id == R.id.button_request) {
        val repository=Repository()
            val viewModelFactory=MainViewModelFactory(repository)
            viewModel= ViewModelProvider(this,viewModelFactory).get(MainViewModel::class.java)

            viewModel.getPost()
            viewModel.myResponse.observe(this, Observer{
                    response ->
                Log.d("Response ", response.userId.toString())
                Log.d("Response ", response.id.toString())
                Log.d("Response ", response.title)
                Log.d("Response ", response.body)
            })

        }
    }

}



