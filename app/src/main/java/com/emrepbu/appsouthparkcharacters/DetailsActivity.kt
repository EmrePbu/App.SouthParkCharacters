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

        val intent = intent
        val selectedCharacters = intent.getSerializableExtra("characters") as SouthParkCharacter

        selectedCharacters.apply {
            binding.apply {
                tvAge.text = getString(R.string.age, age.toString())
                tvBirthday.text = getString(R.string.birthday, birthday)
                tvGender.text = getString(R.string.gender, gender)
                tvHair.text = getString(R.string.hair, hair)
                tvName.text = getString(R.string.name, name)
                ivCharacter.setImageResource(image)
            }
        }
    }
}
