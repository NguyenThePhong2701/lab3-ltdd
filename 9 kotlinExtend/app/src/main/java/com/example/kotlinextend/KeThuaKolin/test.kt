package com.example.kotlinextend.KeThuaKolin

fun main() {
    val nhaCabinVuong = NhaCabinVuong(1, 23.0);
    val nhaTronMotTang = NhaTronMotTang(3,2.3);
    val nhaTronNhieuTang = NhaTronNhieuTang(12, 2.3);
    with(nhaCabinVuong){
        println("\nNhaCabinVuong\n============")
        println("Số người ở: ${soNguoiOToiDa}")
        println("Vật liệu xây dựng: ${vatLieuXayDung}")
        println("Còn phòng ko ? ${kiemTraConPhong()}")
        println("Diện tích ${tinhDienTich()}")
    }

    with(nhaTronMotTang){
        println("\nNhà tròn 1 tầng\n============")
        println("Số người ở: ${soNguoiOToiDa}")
        println("Vật liệu xây dựng: ${vatLieuXayDung}")
        println("Còn phòng ko ? ${kiemTraConPhong()}")
        println("Diện tích ${tinhDienTich()}")
    }

    with(nhaTronNhieuTang){
        println("\nNhà tròn 1 tầng\n============")
        println("Số người ở: ${soNguoiOToiDa}")
        println("Vật liệu xây dựng: ${vatLieuXayDung}")
        println("Còn phòng ko ? ${kiemTraConPhong()}")
        println("Diện tích ${tinhDienTich()}")
    }

}