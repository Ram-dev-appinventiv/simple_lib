package com.app.filters

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

open class CommonToast(var context: Context) {

    fun AppCompatActivity.ShowLongToast(msz: String) {
        Toast.makeText(this, msz, Toast.LENGTH_LONG).show()
    }

    fun ShowShortToast(msz: String) {
        Toast.makeText(context, msz, Toast.LENGTH_SHORT).show()
    }
}
