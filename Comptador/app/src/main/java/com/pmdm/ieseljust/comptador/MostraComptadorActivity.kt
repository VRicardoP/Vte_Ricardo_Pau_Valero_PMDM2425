package com.pmdm.ieseljust.comptador

import android.os.Bundle
// import android.widget.Button
// import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pmdm.ieseljust.comptador.databinding.ActivityMostraComptadorBinding

class MostraComptadorActivity : AppCompatActivity() {

    // Declaramos el binding
    private lateinit var binding: ActivityMostraComptadorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        // Inicializamos el binding
        binding = ActivityMostraComptadorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setContentView(R.layout.activity_mostra_comptador)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencia al TextView (sin findViewById)
        val textViewContador = binding.textViewMostraComptador

        // Referencia al botón (sin findViewById)
        val btBack = binding.btBack
        /*
        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewMostraComptador)
        // Referencia al boto d'Open
        val btBack=findViewById<Button>(R.id.btBack)
        */

        // Agafem la informacio de la Intent
        val comptador:Int? = intent.getIntExtra("comptador", 0)
        binding.textViewMostraComptador.text = comptador.toString()

        // Inicialitzem el TextView amb el comptador a 0
        textViewContador.text=comptador.toString()

        btBack.setOnClickListener {
            finish()
        }


    }
}