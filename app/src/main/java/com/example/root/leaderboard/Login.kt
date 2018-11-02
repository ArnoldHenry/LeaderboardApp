package com.example.root.leaderboard

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import butterknife.BindView
import android.widget.EditText
import butterknife.ButterKnife
import butterknife.ButterKnife.bind


class Login : AppCompatActivity() {
    @BindView(R.id.buttonlogin)
    var loginbtn: Button? = null

    @BindView(R.id.usernameeditxt)
    var user: EditText? = null

    @BindView(R.id.passedittxt)
    var pass: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ButterKnife.bind(this)

    }
}
