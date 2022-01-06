package com.example.apptest1.mvp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.apptest1.databinding.ActivityMvpmainBinding
import com.example.apptest1.mvp.Repository.InfoRepository
import com.example.apptest1.mvp.contract.Contract
import com.example.apptest1.mvp.presenter.Presenter
import kotlinx.android.synthetic.main.activity_mvpmain.*
import org.json.JSONObject

class MvpMainActivity : AppCompatActivity(), Contract.View {

    private lateinit var presenter : Contract.Presenter
    private lateinit var repository: InfoRepository

    private val binding by lazy { ActivityMvpmainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        repository = InfoRepository(this)
        presenter = Presenter(this@MvpMainActivity, repository)

        presenter.initInfo()
        initButtonListener()


    }

    override fun showInfo(info: JSONObject) {
        name_output.text = info.getString("name")
        email_output.text = info.getString("email")
    }

    fun initButtonListener(){
        button_submit.setOnClickListener {
            var info = JSONObject()
            info.put("name", name_input.text.toString())
            info.put("email",email_input.text.toString())

            name_input.text.clear()
            email_input.text.clear()

            presenter.setInfo(info)
            presenter.saveInfo(info)
        }
    }
}