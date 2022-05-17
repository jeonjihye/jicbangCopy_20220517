package com.asianaidt.jicbangcopy_20220517.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.asianaidt.jicbangcopy_20220517.R
import com.asianaidt.jicbangcopy_20220517.datas.RoomData

class RoomAdapter(  val mContext: Context,
                    val resId : Int,
                    val mList : ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext,resId,mList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.room_list_item,null)

        }
        val row = tempRow!!

        val data = mList[position]

        val txtPrice = row.findViewById<TextView>(R.id.txtPrice)
        val txtAddress = row.findViewById<TextView>(R.id.txtAddress)
        val txtFloor = row.findViewById<TextView>(R.id.txtFloor)
        val txtDesc = row.findViewById<TextView>(R.id.txtDesc)

        txtDesc.text = data.desc

        return row

    }

}