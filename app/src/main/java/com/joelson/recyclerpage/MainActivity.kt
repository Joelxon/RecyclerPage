package com.joelson.recyclerpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import com.joelson.recyclerpage.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myProfileAdapter: ProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles: List<ProfileModel> = listOf(
            ProfileModel(R.drawable.ic_fine_woman, "Lilian", "Azanubi"),
            ProfileModel(R.drawable.ic_woman_a, "Joy", "Omomo"),
            ProfileModel(R.drawable.ic_woman_b, "Sarah", "Disi"),
            ProfileModel(R.drawable.ic_a1, "Joshua", "Eguavon"),
            ProfileModel(R.drawable.ic_a2, "Patrick", "Hart" ),
            ProfileModel(R.drawable.ic_a3, "Promise", "Osiowhemu"),
            ProfileModel(R.drawable.ic_a4, "Jennifer", "Onoriode"),
            ProfileModel(R.drawable.ic_a5, "Fega", "John"),
            ProfileModel(R.drawable.ic_a6, "Peace", "Egbo"),
            ProfileModel(R.drawable.ic_a7, "Destiny", "Ikoyo"),
            ProfileModel(R.drawable.ic_a8, "Faith", "Edoja"),
            ProfileModel(R.drawable.ic_a9, "Clifford", "Alex"),
            ProfileModel(R.drawable.ic_a10, "Josephine", "Zubairu"),
            ProfileModel(R.drawable.ic_a11, "Kingsley", "Nzekwe"),
            ProfileModel(R.drawable.ic_a12, "Treasure", "Ekwireme"),
            ProfileModel(R.drawable.ic_a13, "Iris", "Azanubi"),
            ProfileModel(R.drawable.ic_a14, "Ochuko", "Imonisa"),
            ProfileModel(R.drawable.ic_a15, "Samuel", "Oyibo"),
            ProfileModel(R.drawable.ic_a16, "James", "Umukoro"),
            ProfileModel(R.drawable.ic_a17, "Felix", "Nworisa")





        )
        myProfileAdapter = ProfileAdapter(profiles)
        binding.recyclerView.adapter = myProfileAdapter
    }
}