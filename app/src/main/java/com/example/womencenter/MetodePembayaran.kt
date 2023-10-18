package com.example.womencenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.RadioButton
import android.widget.Spinner
import com.example.womencenter.ui.login_register.LoginActivty

class MetodePembayaran : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_metode_pembayaran)
        supportActionBar?.hide()

        val bankSpinner: Spinner = findViewById(R.id.bankSpinner)
        val electronicMoneySpinner: Spinner = findViewById(R.id.electronicMoneySpinner)
        val miniMarketSpinner: Spinner = findViewById(R.id.miniMarketSpinner)

        // Opsi bank
        val bankOptions = arrayOf("Bank BRI", "Bank BNI", "Bank Mandiri")
        val bankAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, bankOptions)
        bankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        bankSpinner.adapter = bankAdapter

        // Opsi uang elektronik (DANA, GoPay)
        val electronicMoneyOptions = arrayOf("DANA", "GoPay")
        val electronicMoneyAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, electronicMoneyOptions)
        electronicMoneyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        electronicMoneySpinner.adapter = electronicMoneyAdapter

        // Opsi minimarket (Indomaret, Alfamart)
        val miniMarketOptions = arrayOf("Indomaret", "Alfamart")
        val miniMarketAdapter =
            ArrayAdapter(this, android.R.layout.simple_spinner_item, miniMarketOptions)
        miniMarketAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        miniMarketSpinner.adapter = miniMarketAdapter

        // Sembunyikan Spinner awalnya
        electronicMoneySpinner.visibility = View.GONE
        miniMarketSpinner.visibility = View.GONE

        // Atur perilaku RadioButtons untuk menampilkan Spinner yang sesuai
        val virtualAccountRadioButton: RadioButton = findViewById(R.id.virtualAccountRadioButton)
        val electronicMoneyRadioButton: RadioButton = findViewById(R.id.electronicMoneyRadioButton)
        val miniMarketRadioButton: RadioButton = findViewById(R.id.miniMarketRadioButton)

        virtualAccountRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                bankSpinner.visibility = View.VISIBLE
            } else {
                bankSpinner.visibility = View.GONE
            }
        }

        electronicMoneyRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                electronicMoneySpinner.visibility = View.VISIBLE
            } else {
                electronicMoneySpinner.visibility = View.GONE
            }
        }

        miniMarketRadioButton.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                miniMarketSpinner.visibility = View.VISIBLE
            } else {
                miniMarketSpinner.visibility = View.GONE
            }
        }
        val btnpayment: Button = findViewById(R.id.continuePaymentButton)
        btnpayment.setOnClickListener {
            startActivity(Intent(this@MetodePembayaran, KonfirmasiBayar::class.java))

        }
        val btnback: Button = findViewById(R.id.btn_back)
        btnback.setOnClickListener {
            startActivity(Intent(this@MetodePembayaran, Profile_Consult::class.java))

        }
    }
}



