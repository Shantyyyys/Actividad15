package com.example.actividad15

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.actividad15.databinding.ItemListaBinding


class NoticiaHolder(val binding: ItemListaBinding) :
    RecyclerView.ViewHolder(binding.root)

class NoticiaAdapter(val noticias: List<Noticia>) :
    RecyclerView.Adapter<NoticiaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiaHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemListaBinding.inflate(inflater, parent, false)
        return NoticiaHolder(binding)
    }

    override fun onBindViewHolder(holder: NoticiaHolder, position: Int) {
        val noticia = noticias[position]
        holder.binding.txtTitle.text = noticia.titulo
        holder.binding.txtDescription.text = noticia.descripcion

        holder.binding.root.setOnClickListener {
            Toast.makeText(it.context, "Clic en: ${noticia.titulo}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = noticias.size
}