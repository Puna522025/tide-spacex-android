package com.tide.spacex.ui.adapter

import androidx.recyclerview.widget.RecyclerView
import com.tide.spacex.network.domain.GetRocketDetailsDomainModel
import com.tide.spacex.ui.databinding.RocketLaunchDetailsHeaderBinding
import java.util.*

class RocketLaunchDetailsHeaderViewHolder(
    private val binding: RocketLaunchDetailsHeaderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(model: GetRocketDetailsDomainModel) {
        val calendar: Calendar = Calendar.getInstance()
        calendar.time = model.date_utc
        val dateYear: Int = calendar.get(Calendar.YEAR)

        binding.apply {
            header.text = dateYear.toString()
        }
    }
}