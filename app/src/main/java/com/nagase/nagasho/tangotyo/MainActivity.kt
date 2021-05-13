package com.nagase.nagasho.tangotyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var apple: CustomWord = CustomWord(R.drawable.apple1,"りんご","apple")
        var banana: CustomWord = CustomWord(R.drawable.banana,"バナナ","banana")
        var strawberry: CustomWord = CustomWord(R.drawable.strawberry,"いちご","strawberry")
        var orange: CustomWord = CustomWord(R.drawable.orange,"オレンジ","orange")

        val fruits = arrayOf(apple,banana,strawberry,orange)

        for (fruit in fruits) {
            addWord(fruit)
        }


        //container.addView(nameTextView)
    }
    private fun addWord(word: CustomWord){
        var nameTextView = TextView(applicationContext)
        var englishTextView = TextView(applicationContext)

        nameTextView.text =word.name
        englishTextView.text=word.englishname

        val layout = LinearLayout(this.applicationContext)

        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)

        imageView.setImageResource(word.resId)

        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER)

        nameTextView.setPadding(10)

        layout.addView(imageView)
        layout.addView(nameTextView)
        layout.addView(englishTextView)

        container.addView(layout)
    }


}