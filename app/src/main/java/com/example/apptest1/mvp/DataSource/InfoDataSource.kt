package com.example.apptest1.mvp.DataSource

import org.json.JSONObject

// info데이터를 불러올때, LoadInfoCallback을 사용하여 성공과 오류일때 구분하여 리스터 추가
// 그래서 이와 관련된 콜백함수와 get 함수를 정의한 InfoDataSource 인터페이스를 작성하고 이를 Repository와 local/remote Data Source에 implement하여 사용
interface InfoDataSource {

    interface LoadInfoCallback {
        fun onInfoLoaded(info : JSONObject)
        fun onDataNotAvailable()
    }

    fun getInfo(callback : LoadInfoCallback)
    fun saveInfo(info:JSONObject)

}