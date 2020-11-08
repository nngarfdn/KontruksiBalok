package com.android.kontruksibalok

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnHitung.setOnClickListener {
            
            val ab = edtJarakAB.text.toString()
            val ba = edtJarakBA.text.toString()
            val p = edtP.text.toString()
            
            if (ab.isNotEmpty() && ba.isNotEmpty()  && p.isNotEmpty()) {

                val a = ab.toDouble()
                val b = ba.toDouble()
                val pBesar = p.toDouble()

                val aplusb = a + b
                val Ra = pBesar * b / aplusb
                val Rb = pBesar * a / aplusb
                val Db = Ra - pBesar
                val Dc = Db + Rb
                val Mb = Ra * a

                val hasilRa: Double = String.format("%.3f", Ra).toDouble()
                val hasilRb: Double = String.format("%.3f", Rb).toDouble()
                val hasilDb: Double = String.format("%.3f", Db).toDouble()
                val hasilDc: Double = String.format("%.3f", Dc).toDouble()
                val hasilMb: Double = String.format("%.3f", Mb).toDouble()

                txtRa.text = "Ra = $hasilRa"
                txtRb.text = "Rb = $hasilRb"
                txtDa.text = "Da = $hasilRa"
                txtDb.text = "Db = $hasilDb"
                txtDc.text = "Dc = $hasilDc"
                txtMB.text = "Mb = $hasilMb"
            } else {
                Toast.makeText(this, "Lengkapi semua dulu", Toast.LENGTH_SHORT).show()
            }

        }
    }
}