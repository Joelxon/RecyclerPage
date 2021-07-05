package com.joelson.recyclerpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joelson.recyclerpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles: List<ProfileModel> = listOf(
            ProfileModel(R.drawable.ic_fine_woman, "Joelson", "Azanubi"),
            ProfileModel(R.drawable.ic_launcher_background, "Joy", "Omomo"),
            ProfileModel(R.drawable.ic_launcher_foreground, "Sarah", "Disi")
        )
        myProfileAdapter = ProfileAdapter(profiles)
        binding.recyclerView.adapter = myProfileAdapter
    }
}