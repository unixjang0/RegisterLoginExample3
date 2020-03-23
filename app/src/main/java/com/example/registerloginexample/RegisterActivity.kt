package com.example.registerloginexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.et_id
import kotlinx.android.synthetic.main.activity_login.et_pass
import kotlinx.android.synthetic.main.activity_register.*

  class RegisterActivity : AppCompatActivity() {

    private EditText et_id, et_pass, et_name, et_age;
    private Button btn_register;

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        et_id = findViewById(R.id.et_id);
        et_pass = findViewById(R.id.et_id);
        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);

    }
}
