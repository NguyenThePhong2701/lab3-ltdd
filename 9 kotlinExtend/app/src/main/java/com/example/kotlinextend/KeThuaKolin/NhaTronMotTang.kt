package com.example.kotlinextend.KeThuaKolin

import com.example.kotlinextend.KienTrucNha
import kotlin.math.PI

open class NhaTronMotTang(soNguoi : Int, val banKinh : Double ) : KienTrucNha(soNguoi)  {
    override val soNguoiOToiDa: Int = 6
    override val vatLieuXayDung: String = "Đất sét"

    override fun tinhDienTich(): Double {
        return this.banKinh * this.banKinh * PI
    }
}