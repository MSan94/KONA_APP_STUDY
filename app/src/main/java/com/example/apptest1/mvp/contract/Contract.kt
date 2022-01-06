package com.example.apptest1.mvp.contract

import org.json.JSONObject

interface Contract {

    interface View{
        // TextView에 Info Data Show
        fun showInfo(info : JSONObject)
    }

    interface Presenter{
        //onCreate 화면 초기화시에 저장된 데이터가 있는지 Model에서 확인하고 결과에 따라 View에 어떤 내용을 보일지 지시
        fun initInfo()

        // TextView에 info Data Show하라고 View에 명령
        fun setInfo(info:JSONObject)

        // EditText에 입력된 info 데이터를 저장하라고 Model에게 지시
        fun saveInfo(info : JSONObject)
    }

}