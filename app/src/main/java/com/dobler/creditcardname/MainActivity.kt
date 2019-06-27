package com.dobler.creditcardname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dobler.creditcardname.helper.CreditCardNameConverter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        onConvertButtonClicked()

    }

    private fun onConvertButtonClicked() {

        btConvertName.setOnClickListener {
            val name: String = edYourName.text.toString()

            if (name.isEmpty()) {
                tvCreditCardName.text = "WRITE YOUR NAME FIRST"
                edYourName.requestFocus()
            } else {
                tvCreditCardName.text = CreditCardNameConverter.convert(name)
                edYourName.text.clear()
            }


        }
    }

}
