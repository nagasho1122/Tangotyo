package com.nagase.nagasho.tangotyo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apple: Word = Word(R.drawable.apple1,"りんご","apple")
        var banana: Word = Word(R.drawable.banana,"バナナ","banana")
        var strawberry: Word = Word(R.drawable.strawberry,"いちご","strawberry")
        var orange: Word = Word(R.drawable.orange,"オレンジ","orange")

        addWord(apple)
        addWord(banana)
        addWord(orange)
        addWord(strawberry)


        //container.addView(nameTextView)
    }
    private fun addWord(word: Word){
        var nameTextView = TextView(applicationContext)

        nameTextView.text =word.name

        val layout = LinearLayout(this.applicationContext)

        layout.orientation = LinearLayout.HORIZONTAL

        val imageView = ImageView(this)

        imageView.setImageResource(word.resId)

        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER)

        layout.addView(imageView)
        layout.addView(nameTextView)

        container.addView(layout)
    }


}