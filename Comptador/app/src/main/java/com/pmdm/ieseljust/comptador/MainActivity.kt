package com.pmdm.ieseljust.comptador

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val TAG_OnCreate = "\u001b[36mOnCreate\u001b[0m" // Cyan claro
    private val TAG_OnStart = "\u001b[32mOnStart\u001b[0m" // Verde
    private val TAG_OnResume = "\u001b[34mOnResume\u001b[0m" // Azul
    private val TAG_OnPause = "\u001b[35mOnPause\u001b[0m" // Magenta
    private val TAG_OnStop = "\u001b[31mOnStop\u001b[0m" // Rojo
    private val TAG_OnRestart = "\u001b[33mOnRestart\u001b[0m" // Amarillo
    private val TAG_OnDestroy = "\u001b[36mOnDestroy\u001b[0m" // Cyan
    private val TAG_OnSaveInstanceState = "\u001b[90mOnSaveInstanceState\u001b[0m" // Gris oscuro
    private val TAG_OnRestoreInstanceState = "\u001b[94mOnRestoreInstanceState\u001b[0m" // Azul claro

    private var comptador = 0

    // Clave para guardar el valor del contador en el Bundle
    private val salva_comptador = "comptador"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG_OnCreate, "Ejecutando OnCreate")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Referencia al TextView
        val textViewContador = findViewById<TextView>(R.id.textViewComptador)
        // Referencia al botón de abrir nueva actividad
        val btOpen = findViewById<Button>(R.id.btOpen)

        // Si hay un estado guardado, restaurar el valor del comptador
        if (savedInstanceState != null) {
            comptador = savedInstanceState.getInt(salva_comptador, 0)
        }

        // Inicializamos el TextView con el valor del contador actual
        textViewContador.text = comptador.toString()

        // Referencias a los botones
        val btAdd = findViewById<Button>(R.id.btAdd)
        val btSubtract = findViewById<Button>(R.id.btSubtract)
        val btReset = findViewById<Button>(R.id.btReset)

        // Asociación de la expresión lambda como respuesta al evento Clic
        btSubtract.setOnClickListener {
            comptador--
            textViewContador.text = comptador.toString()
        }

        btAdd.setOnClickListener {
            comptador++
            textViewContador.text = comptador.toString()
        }

        btReset.setOnClickListener {
            comptador = 0
            textViewContador.text = comptador.toString()
        }

        btOpen.setOnClickListener {
            Intent(baseContext, MostraComptadorActivity::class.java).apply {
                putExtra("comptador", comptador)
                startActivity(this)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_OnStart, "Ejecutando OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_OnResume, "Ejecutando OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_OnPause, "Ejecutando OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_OnStop, "Ejecutando OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG_OnRestart, "Ejecutando OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_OnDestroy, "Ejecutando OnDestroy")
    }

    // Método para guardar el estado de la variable comptador
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i(TAG_OnSaveInstanceState, "Ejecutando OnSaveInstanceState")

        // Guardar el valor del comptador en el Bundle
        outState.putInt(salva_comptador, comptador)
    }

    // Método para restaurar el estado de la variable comptador
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.i(TAG_OnRestoreInstanceState, "Ejecutando OnRestoreInstanceState")

        // Restaurar el valor del comptador desde el Bundle
        comptador = savedInstanceState.getInt(salva_comptador, 0)
        findViewById<TextView>(R.id.textViewComptador).text = comptador.toString()
    }
}
