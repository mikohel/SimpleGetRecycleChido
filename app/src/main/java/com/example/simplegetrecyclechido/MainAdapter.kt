package com.example.simplegetrecyclechido

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.example.simplegetrecyclechido.databinding.ItemPokeBinding
import com.squareup.picasso.Picasso
import org.json.JSONArray
import org.json.JSONObject

class MainAdapter(private val poke: JSONArray): RecyclerView.Adapter<MainAdapter.MainHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding= ItemPokeBinding.inflate(LayoutInflater.from(parent.context),parent, false)
return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, positionsa: Int) {
     holder.render(poke[positionsa] as JSONObject)

    }

    override fun getItemCount(): Int = poke.length()



    class MainHolder(val binding: ItemPokeBinding) : RecyclerView.ViewHolder(binding.root){
        fun render (poke: JSONObject){
            binding.Name.setText(poke.getString("name"))
            Picasso.get().load("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png").into(binding.spritePkmn)




        }
    }
}