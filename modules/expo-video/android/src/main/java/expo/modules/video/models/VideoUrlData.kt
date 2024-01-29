package expo.modules.video.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class VideoUrlData : ViewModel() {
    private val _url = MutableLiveData<String>("")
    val url: LiveData<String> = _url

    fun updateUrl(url: String) {
        _url.value = url
    }

}
