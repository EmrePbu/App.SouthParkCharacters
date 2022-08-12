package com.emrepbu.appsouthparkcharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrepbu.appsouthparkcharacters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var charactersList: ArrayList<SouthParkCharacters>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        charactersList = ArrayList<SouthParkCharacters>().apply {
            add(ericCartman)
            add(kennyMcCormick)
            add(kyleBroflovski)
            add(stanMarsh)
        }
    }
}