package com.yjm.catsikjidong

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yjm.catsikjidong.databinding.ActivitySecondBinding
import kotlin.random.Random
import kotlin.random.nextInt

class SecondActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)

        val intent = intent
        val selectKind = intent.getIntExtra("food", 0)
        val price = intent.getIntExtra("price", 0)
        val flag = Random.nextInt(4) // 0 ~ 3

        val foodNum = price * 4 + flag

        val arrayOfInt = Array(5) { IntArray(20) }
        val kind = charArrayOf('k', 'c', 'j', 'w', 'e')
        for (i in 0..4) {
            for (j in 0..19) {
                arrayOfInt[i][j] = resources.getIdentifier(
                    kind[i].toString() + "_" + (j + 1),
                    "drawable",
                    packageName
                )
            }
        }
        binding.ivFood.setImageResource(arrayOfInt[selectKind][foodNum])
        binding.tvMenu.text = MENU[selectKind][foodNum]
        setContentView(binding.root)
    }
}