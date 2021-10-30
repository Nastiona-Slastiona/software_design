package ppo.tabata.viewModels

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.text.InputFilter
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ppo.tabata.data.TabataEntity
import ppo.tabata.databinding.FragmentTabataEditBinding
import ppo.tabata.utility.TimeInputFilter

class EditTabataViewModel: ViewModel() {

    private var tabata = MutableLiveData<TabataEntity>()
    var newTabata = false

    fun setTabata(tabata: TabataEntity) {
        this.tabata.value = tabata
        newTabata = false
    }

    fun renderTabataEdit(binding: FragmentTabataEditBinding){
        if (newTabata) return
        val curr: TabataEntity = tabata.value!!
        binding.apply {
            tabataTitle.setText(curr.name, TextView.BufferType.EDITABLE)
            warmUpMin.setText(getMinutes(curr.warm_up), TextView.BufferType.EDITABLE)
            warmUpS.setText(getSec(curr.warm_up), TextView.BufferType.EDITABLE)
            workMin.setText(getMinutes(curr.work), TextView.BufferType.EDITABLE)
            workS.setText(getSec(curr.work), TextView.BufferType.EDITABLE)
            restMin.setText(getMinutes(curr.rest), TextView.BufferType.EDITABLE)
            restS.setText(getSec(curr.rest), TextView.BufferType.EDITABLE)
            cooldownMin.setText(getMinutes(curr.cooldown), TextView.BufferType.EDITABLE)
            cooldownS.setText(getSec(curr.cooldown), TextView.BufferType.EDITABLE)
            repeats.setText(curr.repeats.toString(), TextView.BufferType.EDITABLE)
            cycles.setText(curr.cycles.toString(), TextView.BufferType.EDITABLE)
            repeats.setText(curr.repeats.toString(), TextView.BufferType.EDITABLE)
            selectColor.setBackgroundColor(Color.parseColor(curr.color))
        }

    }

    fun setInputFilters(binding: FragmentTabataEditBinding) {
        val filters = arrayOf<InputFilter>(TimeInputFilter())
        binding.apply {
            warmUpMin.filters = filters
            warmUpS.filters = filters
            workMin.filters = filters
            workS.filters = filters
            restMin.filters = filters
            restS.filters = filters
            cooldownMin.filters = filters
            cooldownS.filters = filters
        }

    }

    fun saveTabata(binding: FragmentTabataEditBinding, viewModel: TabataViewModel) {
        binding.apply {
            val name = tabataTitle.text.toString()
            val warm_up =
                warmUpMin.text.toString().toInt() * 60 + binding.warmUpS.text.toString().toInt()
            val work = workMin.text.toString().toInt() * 60 + binding.workS.text.toString().toInt()
            val rest = restMin.text.toString().toInt() * 60 + binding.restS.text.toString().toInt()
            val cooldown =
                cooldownMin.text.toString().toInt() * 60 + binding.cooldownS.text.toString().toInt()
            val repeats =
                if (repeats.text.toString() == "") 0 else binding.repeats.text.toString().toInt()
            val cycles =
                if (cycles.text.toString() == "") 0 else binding.cycles.text.toString().toInt()
            val color = java.lang.String.format(
                "#%06X",
                0xFFFFFF and (binding.selectColor.background as ColorDrawable).color
            )

        val currTabata = TabataEntity(name, color, warm_up, work, rest, repeats, cycles, cooldown)
        if (newTabata)
            viewModel.insertTabata(currTabata)
        else {
            currTabata.id = tabata.value!!.id
            viewModel.updateTabata(currTabata)
        }
    }
    }

    companion object Time {
        fun getTime(time: Int) : String = (getMinutes(time) + ":" + getSec(time))
        fun getMinutes(time: Int): String = addZero(time / 60)
        fun getSec(time: Int): String = addZero(time - (time / 60).toInt() * 60)
        private fun addZero(time: Int): String = if (time < 10) { "0$time" } else { "$time" }
    }
}