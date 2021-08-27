package com.fdananda.gitkotlindatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.fdananda.gitkotlindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModel: MyNewViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Aula 2
        val user = User("Fernanda", "Moreira", 44, true)
        binding.user = user

        //Aula 3
        myViewModel = ViewModelProvider(this).get(MyNewViewModel::class.java)
        binding.viewModel = myViewModel
        binding.lifecycleOwner = this

        binding.edittext.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                myViewModel.setMessage(s.toString())
            }
        })

    }
}