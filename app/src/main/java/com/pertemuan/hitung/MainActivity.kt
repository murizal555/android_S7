package com.pertemuan.hitung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.pertemuan1.android.R

class MainActivity : AppCompatActivity() {
    private lateinit var lebarEditText: TextInputEditText
    private lateinit var panjangEditText: TextInputEditText
    private lateinit var hitungButton: Button
    private lateinit var hasilTextView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hitungButton.setOnClickListener{
            val lebar=lebarEditText.text.toString()
            val panjang=panjangEditText.text.toString()
            val hasil=panjang.toInt()*lebar.toInt()
            hasilTextView.text=hasil.toString()

            if (panjang.isEmpty()&&lebar.isEmpty()){
                hasilTextView.text="tidak boleh kosong ya"
            }else{
                val hasil=panjang.toInt()*lebar.toInt()
                hasilTextView.text=hasil.toString()+"m2"
            }
        }
    }
    private fun initkomponent(){
        lebarEditText=findViewById(R.id.lebarEditText)
        panjangEditText=findViewById(R.id.panjangEditText)
        hitungButton=findViewById(R.id.hitungButton)
        hasilTextView=findViewById(R.id.hasilTextView)
    }
}










































































































