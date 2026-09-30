package com.example.lab3_bai2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_bai2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hoTen = intent.getStringExtra("HO_TEN") ?: ""
        val mssv = intent.getStringExtra("MSSV") ?: ""
        val tuoi = intent.getIntExtra("TUOI", 0)
        val lop = intent.getStringExtra("LOP") ?: ""

        binding.tvThongTin.text = """
            Họ tên: $hoTen
            
            MSSV: $mssv
            
            Tuổi: $tuoi
            
            Lớp: $lop
        """.trimIndent()

        binding.btnQuayLai.setOnClickListener {
            finish()
        }
    }
}