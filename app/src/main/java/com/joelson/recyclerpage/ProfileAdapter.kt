package com.joelson.recyclerpage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.joelson.recyclerpage.databinding.ProfileListBinding

class ProfileAdapter(val profiles: List<ProfileModel>):
    RecyclerView.Adapter<ProfileAdapter.ProfileViewHolder>() {

    class ProfileViewHolder(val binding: ProfileListBinding):
        RecyclerView.ViewHolder(binding.root){

            fun bind(profile: ProfileModel){
                binding.firstName.text = profile.firstName
                binding.lastName.text = profile.lastName
                binding.imageView.setImageResource(profile.image)
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
       val binding:ProfileListBinding = ProfileListBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profiles.get(position)
        holder.bind(profile)
    }

    override fun getItemCount(): Int {
        return profiles.size
    }
}