package com.asianaidt.jicbangcopy_20220517.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.asianaidt.jicbangcopy_20220517.datas.RoomData

class RoomAdapter(  val mContext: Context,
                    val resId : Int,
                    val mList : ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

}