package com.example.apptest1.mvp.Repository

import android.content.Context
import com.example.apptest1.mvp.DataSource.InfoDataSource
import com.example.apptest1.mvp.DataSource.InfoLocalDataSource
import org.json.JSONObject


// 보통 싱글톤으로 구현
class InfoRepository(context : Context) : InfoDataSource {

    private val infoLocalDataSource = InfoLocalDataSource(context)

    override fun getInfo(callback: InfoDataSource.LoadInfoCallback) {
        infoLocalDataSource.getInfo(callback)
    }

    override fun saveInfo(info: JSONObject) {
        infoLocalDataSource.saveInfo(info)
    }
}