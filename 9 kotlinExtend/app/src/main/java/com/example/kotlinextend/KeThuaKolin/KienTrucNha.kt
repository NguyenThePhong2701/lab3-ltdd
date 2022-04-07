package com.example.kotlinextend

abstract class KienTrucNha (private val soNguoi : Int){

    abstract val vatLieuXayDung : String
    abstract  val soNguoiOToiDa : Int


    fun kiemTraConPhong() : Boolean{
        return this.soNguoi < this.soNguoiOToiDa
    }

    abstract fun tinhDienTich() : Double

}