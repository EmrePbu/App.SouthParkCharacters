package com.emrepbu.appsouthparkcharacters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrepbu.appsouthparkcharacters.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // data migration with Singleton
        val selectedCharacters = Singleton.selectedCharacter

// data migration with intent
//        val intent = intent
//        val selectedCharacters = intent.getSerializableExtra("characters") as SouthParkCharacter

        selectedCharacters?.let {
            binding.apply {
                tvAge.text = getString(R.string.age, it.age.toString())
                tvBirthday.text = getString(R.string.birthday, it.birthday)
                tvGender.text = getString(R.string.gender, it.gender)
                tvHair.text = getString(R.string.hair, it.hair)
                tvName.text = getString(R.string.name, it.name)
                ivCharacter.setImageResource(it.image)
            }
        }
    }
}
