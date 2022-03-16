package com.example.simpledialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    private lateinit var mButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButton = findViewById(R.id.button)
        mButton.setOnClickListener(View.OnClickListener {
            openDialog()
        })
    }
//바로 위에서 람다함수 괄호가 두번 들어가는바람에 엉뚱하게도 supportFragmentManager를 불러오지 못하는 문제가 생겼었다.
    private fun openDialog() {
        var dialog : myModalDialog = myModalDialog()
        dialog.show(supportFragmentManager, "example dialog")
    }
}