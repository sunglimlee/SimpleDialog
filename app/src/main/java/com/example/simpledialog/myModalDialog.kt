package com.example.simpledialog

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment

class myModalDialog : AppCompatDialogFragment() {
    lateinit var mDialog: AlertDialog.Builder

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        mDialog = AlertDialog.Builder(activity)
        mDialog.setMessage("This is a just information")
            .setTitle("Information")
            .setPositiveButton("Ok", DialogInterface.OnClickListener { dialogInterface, i ->  })
        //기억하자.. return할때 Dialog를 리턴해야하며 AlertDialog는 Dialog의 종류이므로 리턴이 되고
        //create()함수가 AlertDialog를 리턴해주기때문에 사용할 수 있게 되는거다.
        //리턴해주기때문에 반대편에서 값을 가지고 있게 되는거다.
        return mDialog.create()
    }
}