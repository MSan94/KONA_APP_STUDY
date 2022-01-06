package com.example.apptest1.mvp.presenter

import com.example.apptest1.mvp.DataSource.InfoDataSource
import com.example.apptest1.mvp.Repository.InfoRepository
import com.example.apptest1.mvp.contract.Contract
import org.json.JSONObject

class Presenter (val view : Contract.View, val repository: InfoRepository) : Contract.Presenter{
    override fun initInfo() {
        repository.getInfo(object : InfoDataSource.LoadInfoCallback{
            override fun onInfoLoaded(info: JSONObject) {
                view.showInfo(info)
            }

            override fun onDataNotAvailable() {
                //
            }
        })
    }

    override fun setInfo(info: JSONObject) {
        view.showInfo(info)
    }

    override fun saveInfo(info: JSONObject) {
        repository.saveInfo(info)
    }
}