package com.example.kotlinextend.KeThuaKolin
import com.example.kotlinextend.KienTrucNha

class NhaCabinVuong(soNguoi : Int, val doDai : Double) : KienTrucNha(soNguoi) {
    override val vatLieuXayDung: String = "Gổ"
    override val soNguoiOToiDa: Int = 5
    override fun tinhDienTich(): Double {
        return this.doDai * this.doDai
    }
}