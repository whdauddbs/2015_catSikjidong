package com.yjm.catsikjidong

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.yjm.catsikjidong.databinding.ActivityMainBinding
import com.yjm.catsikjidong.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnChoose.setOnClickListener {
            val foodStatus = mutableListOf<Int>()
            val priceStatus = mutableListOf<Int>()
            if (binding.chkKorean.isChecked) { foodStatus.add(0)}
            if (binding.chkChinese.isChecked) { foodStatus.add(1)}
            if (binding.chkJapanese.isChecked) { foodStatus.add(2)}
            if (binding.chkWestern.isChecked) { foodStatus.add(3)}
            if (binding.chkEtc.isChecked) { foodStatus.add(4)}

            if (binding.chk4000.isChecked) { priceStatus.add(0)}
            if (binding.chk6000.isChecked) { priceStatus.add(1)}
            if (binding.chk8000.isChecked) { priceStatus.add(2)}
            if (binding.chk10000.isChecked) { priceStatus.add(3)}
            if (binding.chkMaxPrice.isChecked) { priceStatus.add(4)}

            when {
                foodStatus.isEmpty() -> {
                    Toast.makeText(this, "음식종류를 최소 하나를 선택해주세요.", Toast.LENGTH_SHORT).show()
                }
                priceStatus.isEmpty() -> {
                    Toast.makeText(this, "가격대를 최소 하나를 선택해주세요.", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    foodStatus.shuffle()
                    priceStatus.shuffle()
                    val intent =
                        Intent(this, SecondActivity::class.java)
                    intent.putExtra("food", foodStatus[0])
                    intent.putExtra("price", priceStatus[0])
                    startActivity(intent)
                }
            }
        }
        setContentView(binding.root)
    }
}