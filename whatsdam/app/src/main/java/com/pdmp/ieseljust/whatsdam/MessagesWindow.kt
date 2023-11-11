package com.pdmp.ieseljust.whatsdam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.pdmp.ieseljust.whatsdam.databinding.ActivityMainBinding
import com.pdmp.ieseljust.whatsdam.databinding.ActivityMessagesWindowBinding

class MessagesWindow : AppCompatActivity() {

    //volvemos a usar View Binding
    private lateinit var binding: ActivityMessagesWindowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMessagesWindowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //recuperamos los valores del intent
        val nickNameText = intent.getStringExtra("nickNameText")
        val serverAddressText = intent.getStringExtra("serverAddressText")

        //enlazamos con el textview que hemos definido
        val connectionInfoTextView : TextView = findViewById(R.id.connectionInfoTextView)

        //Configuramos mensaje
        connectionInfoTextView.text = "Conectado a $serverAddressText como $nickNameText"

        //COnfiguramos el callback para borrar el texto al presionar enviar
        binding.sendMessage.setOnClickListener{
            binding.MessageText.text.clear()

        }


    }
}