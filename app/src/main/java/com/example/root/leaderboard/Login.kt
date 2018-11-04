package com.example.root.leaderboard

import android.content.Intent
import android.graphics.Typeface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import butterknife.BindView
import android.widget.EditText
import butterknife.ButterKnife


class Login : AppCompatActivity(), View.OnClickListener {

  private lateinit var loginbtn : Button

    @BindView(R.id.usernameeditxt)
    var user: EditText? = null

    @BindView(R.id.passedittxt)
    var pass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginbtn = findViewById(R.id.buttonlogin)

        ButterKnife.bind(this)
        loginbtn?.setOnClickListener(this)

        val fontuser = Typeface.createFromAsset(assets,"fonts/CaviarDreams.ttf")
        user?.typeface = fontuser

    }
    override fun onClick(v:View) {
        if(v == loginbtn){
            val intent = Intent(this@Login,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
