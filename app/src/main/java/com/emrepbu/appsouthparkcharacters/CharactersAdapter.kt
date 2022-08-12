package com.emrepbu.appsouthparkcharacters

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emrepbu.appsouthparkcharacters.databinding.CharactersRowItemBinding

class CharactersAdapter(private val southParkCharacters: ArrayList<SouthParkCharacter>) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {
    class CharactersViewHolder(val binding: CharactersRowItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val binding = CharactersRowItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CharactersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.binding.apply {
            ivCharactersRowItemImage.setImageResource(southParkCharacters[position].image)
            tvCharactersRowItemName.text = southParkCharacters[position].name
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailsActivity::class.java)
            intent.putExtra("characters", southParkCharacters[position])
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = southParkCharacters.size
}