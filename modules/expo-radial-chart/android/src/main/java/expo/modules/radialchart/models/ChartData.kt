package expo.modules.radialchart.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jaikeerthick.composable_graphs.composables.line.model.LineData

class ChartData : ViewModel() {
    private val _data = MutableLiveData<List<LineData>>()
    val data: LiveData<List<LineData>> = _data

    fun updateData(newData: List<LineData>) {
        _data.value = newData
    }

}
