package com.example.actividad15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.actividad15.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvwNews.layoutManager = LinearLayoutManager(this)
        binding.rvwNews.adapter = NoticiaAdapter(getNews())
    }

    private fun getNews(): List<Noticia> {
        return listOf(
            Noticia("RORRO", "Rorro se unio a taxi"),
            Noticia("TAXI", "Taxi debuto el 7 de mayo"),
            Noticia("Shanty", "Shanty se va el 15 a USA")
        )
    }
}