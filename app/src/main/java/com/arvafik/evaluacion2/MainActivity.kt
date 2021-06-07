package com.arvafik.evaluacion2

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

//Jessica Janet Grajeda Castellanos
// 17100229

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<Button>(R.id.btnIr).setOnClickListener{
            //Snackbar
                view -> Snackbar.make(view, "Jessica Janet Grajeda Castellanos", Snackbar.LENGTH_LONG).show()
            //Intent explicito
            val ir = Intent(this, activity2::class.java)
            this.startActivity(ir)
        }

        findViewById<Button>(R.id.btnFormulario).setOnClickListener{
            val formu = Intent(this, ActivityFormulario::class.java)
            this.startActivity(formu)
        }

        //Cuadro de dialogo
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("¿Quieres salir de la aplicación?")
            builder.setMessage("Decide sabiamente")
            builder.setPositiveButton("Sí") { dialogInterface: DialogInterface, i: Int ->
                finish()
            }
            builder.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int -> }
            builder.show()
        }

    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.alumna -> {
                //Toast
                Toast.makeText(applicationContext, "Jessica Janet Grajeda Castellanos 17100229", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}