package com.example.lab3_bai2

import kotlin.jvm.java
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lab3_bai2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHoTen.text = "Lê Thị Minh Thảo"
        binding.tvMssv.text = "MSSV: 2415141122120"

        binding.btnXemChiTiet.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("HO_TEN", "Lê Thị Minh Thảo")
            intent.putExtra("MSSV", "2415141122120")
            intent.putExtra("TUOI", 20)
            intent.putExtra("LOP", "126LTTD02")

            startActivity(intent)
        }
    }
}