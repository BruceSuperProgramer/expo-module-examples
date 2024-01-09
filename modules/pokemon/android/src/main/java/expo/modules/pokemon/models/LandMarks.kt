package expo.modules.pokemon.models

import LandmarkRecord
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LandMarks : ViewModel() {
    private val _originalData = MutableLiveData<Array<LandmarkRecord>>(arrayOf())
    private val _data = MutableLiveData<Array<LandmarkRecord>>(arrayOf())
    val data: LiveData<Array<LandmarkRecord>> = _data

    private val _selectedLandMark = MutableLiveData<LandmarkRecord>(null)
    val selectedLandMark: LiveData<LandmarkRecord> = _selectedLandMark


    fun updateData(newData: Array<LandmarkRecord>) {
        _originalData.value = newData
        _data.value = newData
    }

    fun filterData(name: String) {
        _data.value = _originalData.value?.filter {
            it.name.contains(name, ignoreCase = true)
        }?.toTypedArray() ?: arrayOf()
    }

    fun setSelectedLandMark(landMark: LandmarkRecord) {
        _selectedLandMark.value = landMark
    }

    fun deleteLastItem() {
        val originalDataValue = _originalData.value ?: return
        if (originalDataValue.isNotEmpty()) {
            val newData = originalDataValue.dropLast(1).toTypedArray()
            _originalData.value = newData
            _data.value = newData
        }
    }
}
