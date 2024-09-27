package com.amit.hilt.ui.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amit.domain.entity.PostModelResponseItem
import com.amit.domain.usecase.GetPosts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(private val getPosts: GetPosts) : ViewModel() {

    private val _postsList = MutableStateFlow<List<PostModelResponseItem>>(emptyList())
    val postsList = _postsList.asStateFlow()


    init {
        getListOfPosts()
    }

    private fun getListOfPosts() {
        viewModelScope.launch {
            _postsList.value = getPosts()

        }
    }


}