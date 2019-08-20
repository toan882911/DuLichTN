package com.example.myapplication.util;

import android.content.Context;

import com.example.myapplication.model.dataHotel;
import com.example.myapplication.model.data_map;
import com.example.myapplication.view.DB;

import java.util.ArrayList;
import java.util.List;

public class putHotel {
    private Context context;

    public putHotel(Context context) {
        this.context = context;
        DB db = new DB(context);
        db.open();
        if (db.checkCountHotel() <= 0) {
            db.insertHT("dong_a_hotel", "Đông Á Plaza Hotel  ", "Địa chỉ: Số 668, Đ. Phan Đình Phùng, tổ 11, P. Đồng Quang, TP. Thái Nguyên","chuahang");
            db.insertHT("crown_hotel", "Khách sạn Crown", "Địa chỉ: Tổ 4, Đường Mỏ Bạch, Phường Quang Trung, Tp Thái Nguyên","chuahang");
            db.insertHT("mo_viet_bac_hotel", "Khách sạn Mỏ Việt Bắc  ", "Địa chỉ: xã Tân Thái, huyện Đại Từ, tỉnh Thái Nguyên","thacdatdang");
            db.insertHT("caobachotel", "Khách sạn Cao Bắc  ", "Địa chỉ: 70 Hoàng Văn Thụ, Tp. Thái Nguyên","");
            db.insertHT("honuicoc_hotel", "Khách sạn Du lịch Công Đoàn Hồ Núi Cốc  ", "Địa chỉ: Xã Tân Thái, huyện Đại Từ, Thái Nguyên","thacdatdang");
            db.insertHT("da_huong_hotel", "Khách sạn Dạ Hương I ", "Địa chỉ: 16 Quang Trung, Tp. Thái Nguyên","");
            db.insertHT("dahuong2", "Khách sạn Dạ Hương II ", "Địa chỉ: 01 Đường Lê Quý Đôn, Quang Trung, TP Thái Nguyên","");
            db.insertHT("maidan", "Khách sạn Mai Đan  ", "Địa chỉ: Số nhà 37, Tổ 32, Hoàng Văn Thụ, TP Thái Nguyên","");
            db.insertHT("hoang_mam_hotel", "Khách sạn Hoàng Mấm ", "Địa chỉ: 22 Đường Lương Thế Vinh, TP. Thái Nguyên","");
            db.insertHT("donga_2", "Khách sạn Đông Á II ", "Địa chỉ: 48 Tổ 2 P. Đồng Quang, TP Thái Nguyên","");
            db.insertHT("donga_1", "Khách sạn Đông Á I  ", "Địa chỉ: 142 Đường Hoàng văn Thụ, TP Thái Nguyên","");
            db.insertHT("haiyenhotel", "Khách sạn Hải Yến", "Địa chỉ: 726, đường Lương Ngọc Quyến, Tổ 12, phường Đồng Quang - TPTN","");
            db.insertHT("dai_duong_hotel", "Khách sạn Đại Dương Thái Nguyên ", "Địa chỉ: Số 37, phường Hoàng Văn Thụ, tp Thái Nguyên","doichetancuong");
            db.insertHT("kimthaihotel", "Kim Thái Hotel", "Địa chỉ: Số 3 đường Hoàng Văn Thụ, Thành phố Thái Nguyên","doichetancuong");
            db.insertHT("quang_dat_hotel", "Khách sạn Quang Đạt ", "Địa chỉ: Tổ 19 đường Phù Liễn, phường Hoàng Văn Thụ, Thái Nguyên","doichetancuong");
            db.insertHT("nui_coc", "Đoàn An điều dưỡng 16 Núi Cốc ", "Địa chỉ: Xã Tân Thái, huyện Đại Từ, tỉnh Thái Nguyên","honuicoc");
            db.insertHT("khach_san_everest", "Khách sạn Everest ", "Địa chỉ: Tổ 11, Phường Đồng Quang, TP. Thái Nguyên","chuahang");
            db.insertHT("haiauhotel", "Khách sạn Hải Âu", "Địa chỉ: 756 Cách Mạng Tháng 8, Gia Sàng, TP. Thái Nguyên","chuahang");
            db.close();
        }


    }
    public List<dataHotel> getdata(){
        List<dataHotel> data=new ArrayList<>();
        DB db = new DB(context);
        db.open();
        if(db.checkCount()>0){
            data=db.getHotel();
        }
        db.close();
        return data;
    }
}
