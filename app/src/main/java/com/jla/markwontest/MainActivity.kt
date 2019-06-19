package com.jla.markwontest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import ru.noties.markwon.Markwon

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val markwon = Markwon.create(this)
        val textView = findViewById<TextView>(R.id.text)
        markwon.setMarkdown(textView, markdown)
    }

    private companion object {
        const val markdown =
            "- This is a test of a list with a [link](http://www.github.com) to Github. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
    }
}
