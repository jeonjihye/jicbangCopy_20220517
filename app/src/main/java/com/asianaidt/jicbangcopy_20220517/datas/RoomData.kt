package com.asianaidt.jicbangcopy_20220517.datas

import java.io.Serializable

class RoomData( val price : Int,
                val address: String,
                val floor : Int,
                val desc : String  ) : Serializable {

    // 층수 함수
    fun getFormattedFloor() : String{

        if(this.floor>=1){
            return "${this.floor}층"
        }else if (this.floor == 0){
            return "반지하"
        }else{
            return "지하${-this.floor}층"
        }
    }

    // 가격에 따라 숫자에 컴마 붙이기
    fun getFormattedPrice() : String {

        if(this.price<10000){
            return "%,d".format(this.price)
        }else{
            val uk = this.price / 10000
            val rest = this.price % 10000
            return "${uk}억 ${"%,d".format(rest)}"
        }
    }

}