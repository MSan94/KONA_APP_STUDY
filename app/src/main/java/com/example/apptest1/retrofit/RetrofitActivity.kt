package com.example.apptest1.retrofit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptest1.databinding.ActivityMainBinding
import com.example.apptest1.databinding.ActivityRetrofitBinding
import kotlinx.android.synthetic.main.activity_retrofit.*

class RetrofitActivity : AppCompatActivity() {

    private val binding by lazy { ActivityRetrofitBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
    }

    fun init(){
        btn_Get.setOnClickListener {
            //TODO API 정보 호출
        }
    }
}