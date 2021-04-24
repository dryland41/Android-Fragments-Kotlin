package com.namespacermcw.fragmore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val unoFragmento = UnoFragment()
        val dosFragmento = DosFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, unoFragmento)
            commit()
        }

        btnFragUno.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, unoFragmento)
                addToBackStack(null)
                commit()
            }
        }

        btnFragDos.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, dosFragmento)
                addToBackStack(null)
                commit()
            }
        }
    }
}