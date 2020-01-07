package com.example.pokedex.Presenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.pokedex.View.AtraparActivity
import com.example.pokedex.View.RegistroActivity

class DashboardPresenter (val view: DashboardView) {
    var mContext : AppCompatActivity

    init {
        mContext = view.getContext()
    }

    fun irAtrapar() {
        val intent = Intent(mContext, AtraparActivity::class.java)
        mContext.startActivity(intent)
    }

    fun irMiPokedex() {
        //TODO
    }
}



interface DashboardView {
    fun getContext(): AppCompatActivity
}