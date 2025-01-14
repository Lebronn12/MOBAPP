package com.example.mobapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DeleteFinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_delete_final)

        val editTextDelete = findViewById<EditText>(R.id.edit_Delete)
        val buttonDelete = findViewById<Button>(R.id.DeleteAccount2)

        buttonDelete.setOnClickListener {
            val inputText = editTextDelete.text.toString()

            buttonDelete.setOnClickListener {
                val inputText = editTextDelete.text.toString()

                if (inputText.equals("DELETE", ignoreCase = true)) {
                    // Proceed with account deletion and navigate to another page (SecondActivity)
                    val intent = Intent(this, DeleteMessage::class.java)
                    startActivity(intent)  // Start the SecondActivity
                } else {
                    // Show a toast error message if input doesn't match
                    Toast.makeText(this, "Please type 'DELETE' to confirm.", Toast.LENGTH_SHORT)
                        .show()
                }
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }

    }
}
