package com.example.myhome.androidui.online_course_detail.controller.model

import android.content.Context
import com.airbnb.epoxy.EpoxyModelClass
import com.example.myhome.androidui.R
import com.example.myhome.androidui.base.epoxy.EpoxyViewBindingModelWithHolder
import com.example.myhome.androidui.databinding.ListItemOnlineCourseDetailBinding

@EpoxyModelClass(layout = R.layout.list_item_online_course_detail)
class OnlineCourseDetailModel :
    EpoxyViewBindingModelWithHolder<ListItemOnlineCourseDetailBinding>() {
    override fun ListItemOnlineCourseDetailBinding.bind(context: Context) {
        TODO("Not yet implemented")
    }

    override fun getDefaultLayout(): Int {
        TODO("Not yet implemented")
    }
}