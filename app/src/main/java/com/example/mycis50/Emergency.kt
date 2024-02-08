package com.example.mycis50

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Emergency : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency)
    }

    fun callDo(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769637703")
        }
        startActivity(intent)
    }

    fun callMg(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769637704")
        }
        startActivity(intent)
    }

    fun callPg(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769637707")
        }
        startActivity(intent)
    }

    fun callMps(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769622250")
        }
        startActivity(intent)
    }

    fun callMfs(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769622588")
        }
        startActivity(intent)
    }

    fun callMrh(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769623370")
        }
        startActivity(intent)
    }

    fun callHmh(v: View){
        val intent = Intent(Intent.ACTION_DIAL).also {
            it.data = Uri.parse("tel:18769611589")
        }
        startActivity(intent)
    }


}