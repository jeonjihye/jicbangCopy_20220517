package com.asianaidt.jicbangcopy_20220517

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asianaidt.jicbangcopy_20220517.adapters.RoomAdapter
import com.asianaidt.jicbangcopy_20220517.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdaper : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(RoomData(8000,"서울시 강동구",1,"1번째 방입니다"))
        mRoomList.add(RoomData(11000,"서울시 서대문구",10,"2번째 방입니다"))
        mRoomList.add(RoomData(12000,"서울시 동작구",15,"3번째 방입니다"))
        mRoomList.add(RoomData(5000,"서울시 종로구",-2,"4번째 방입니다"))
        mRoomList.add(RoomData(70000,"서울시 강서구",21,"5번째 방입니다"))
        mRoomList.add(RoomData(22000,"서울시 송파구",17,"6번째 방입니다"))
        mRoomList.add(RoomData(14000,"서울시 은평구",4,"7번째 방입니다"))
        mRoomList.add(RoomData(22000,"서울시 성동구",2,"8번째 방입니다"))
        mRoomList.add(RoomData(6670,"서울시 구로구",-2,"9번째 방입니다"))

        mRoomAdaper = RoomAdapter(this,R.layout.room_list_item,mRoomList)
        roomListView.adapter = mRoomAdaper

    }
}