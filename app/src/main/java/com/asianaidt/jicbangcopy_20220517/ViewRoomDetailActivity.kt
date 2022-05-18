package com.asianaidt.jicbangcopy_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.jicbangcopy_20220517.R
import com.asianaidt.jicbangcopy_20220517.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kotlinx.android.synthetic.main.activity_view_room_detail.view.*

class ViewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        // 변신시킬 대상 as 변신시킬 자료형
        var roomData = intent.getSerializableExtra("room") as RoomData

        txtPrice.text = roomData.getFormattedPrice()
        txtDesc.text = roomData.desc
        txtFloor.text = roomData.getFormattedFloor()
        txtAddress.text = roomData.address

    }
}