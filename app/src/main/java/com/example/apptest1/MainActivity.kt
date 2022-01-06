package com.example.apptest1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apptest1.databinding.ActivityMainBinding
import com.example.apptest1.mvp.view.MvpMainActivity
import com.example.apptest1.retrofit.RetrofitActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }

    fun init(){
        btn_Retrofit.setOnClickListener {
            transView("1")
        }
        btn_Mvp1.setOnClickListener {
            transView("2")
        }
    }

    fun transView(type:String){
        when(type){
            "1" -> {
                val intent = Intent(this,RetrofitActivity::class.java)
                startActivity(intent)
            }
            "2" -> {
                val intent = Intent(this,MvpMainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}