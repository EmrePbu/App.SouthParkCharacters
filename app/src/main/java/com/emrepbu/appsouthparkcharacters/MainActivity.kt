package com.emrepbu.appsouthparkcharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.emrepbu.appsouthparkcharacters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var southParkCharacters: ArrayList<SouthParkCharacter>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        southParkCharacters = ArrayList<SouthParkCharacter>().apply {
            add(ericCartman)
            add(kennyMcCormick)
            add(kyleBroflovski)
            add(stanMarsh)
        }

        binding.rvCharacters.layoutManager = LinearLayoutManager(this)
        val charactersAdapter = CharactersAdapter(southParkCharacters)
        binding.rvCharacters.adapter = charactersAdapter

        binding.rvCharacters.adapter
    }
}