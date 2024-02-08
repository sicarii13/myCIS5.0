package com.example.mycis50

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class FSDetails : AppCompatActivity() {

    var tel: String? = null
    var mail: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        //Gets value sent from Directory activity
        val index: String? = this.intent.getStringExtra("listIndex")

        //Creates objects for each activity element
        val name: TextView = findViewById(R.id.txtName)
        val email: TextView = findViewById(R.id.txtMail)
        val phone: TextView = findViewById(R.id.txtTel)
        val photo: ImageView = findViewById(R.id.imgPhoto)

        //Assigns value to elements according to retrieved index
        when(index) {
            "0" -> {
                name.text = "GLENN, Sheldon"
                email.text = "sheldon.glenn@ncu.edu.jm"
                mail = "sheldon.glenn@ncu.edu.jm"
                phone.text = "(876) 963-7281"
                tel = "tel:18769637281"
                photo.setImageResource(R.drawable.male)
            }

            "1" -> {
                name.text = "GRAHAM, Hamlet"
                email.text = "hamlet.graham@ncu.edu.jm"
                mail = "hamlet.graham@ncu.edu.jm"
                phone.text = "(876) 963-7278"
                tel = "tel:18769637278"
                photo.setImageResource(R.drawable.male)
            }

            "2" -> {
                name.text = "MAGBEGOR, Oche"
                email.text = "oche.magbegor@ncu.edu.jm"
                mail = "oche.magbegor@ncu.edu.jm"
                phone.text = "(876) 963-7280"
                tel = "tel:18769637280"
                photo.setImageResource(R.drawable.male)
            }

            "3" -> {
                name.text = "MITCHELL, Damion"
                email.text = "damion.mitchell@ncu.edu.jm"
                mail = "damion.mitchell@ncu.edu.jm"
                phone.text = "(876) 963-7285"
                tel = "tel:18769637285"
                photo.setImageResource(R.drawable.male)
            }

            "4" -> {
                name.text = "NARAYANA, Melvin"
                email.text = "melvin.narayana@ncu.edu.jm"
                mail = "melvin.narayana@ncu.edu.jm"
                phone.text = "(876) 963-7279"
                tel = "tel:18769637279"
                photo.setImageResource(R.drawable.male)
            }

            "5" -> {
                name.text = "OSBORNE, Henry"
                email.text = "henry.osborne@ncu.edu.jm"
                mail = "henry.osborne@ncu.edu.jm"
                phone.text = "(876) 963-7282"
                tel = "tel:18769637282"
                photo.setImageResource(R.drawable.male)
            }

            "6" -> {
                name.text = "SMALL, E. Beverley"
                email.text = "esmall@ncu.edu.jm"
                mail = "esmall@ncu.edu.jm"
                phone.text = "(876) 963-7276"
                tel = "tel:18769637276"
                photo.setImageResource(R.drawable.female)
            }

            "7" -> {
                name.text = "SMITH, Halzen"
                email.text = "hsmith@ncu.edu.jm"
                mail = "hsmith@ncu.edu.jm"
                phone.text = "(876) 963-7284"
                tel = "tel:18769637284"
                photo.setImageResource(R.drawable.male)
            }

            "8" -> {
                name.text = "TOOMA, Keron"
                email.text = "keron.tooma@ncu.edu.jm"
                mail = "keron.tooma@ncu.edu.jm"
                phone.text = "(876) 963-7283"
                tel = "tel:18769637283"
                photo.setImageResource(R.drawable.male)
            }
        }
    }

    fun phoneClick(v: View?) {
        val intent = Intent(Intent.ACTION_DIAL)
        intent.setData(Uri.parse(tel))
        startActivity(intent)
    }

    fun emailClick(v: View?) {
        val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null))
        intent.putExtra(Intent.EXTRA_EMAIL, mail)
        startActivity(intent)
    }
}