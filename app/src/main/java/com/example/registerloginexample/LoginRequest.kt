package com.example.registerloginexample

import com.android.volley.AuthFailureError
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import java.util.*

class LoginRequest(
    userID: String,
    userPassword: String,
    listener: Response.Listener<String?>?
) : StringRequest(
    Method.POST,
    URL,
    listener,
    null
) {
    private val map: MutableMap<String, String>
    @Throws(AuthFailureError::class)
    override fun getParams(): Map<String, String> {
        return map
    }

    companion object {
        //서버 URL 설정(php파일연동)
        private const val URL = "http://unixjang0.dothome.co.kr/Login.php"
    }

    init {
        map = HashMap()
        map["userID"] = userID
        map["userPassword"] = userPassword
    }
}