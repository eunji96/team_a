package com.team.delivery.mappers;

import com.team.delivery.DTO.StoreDTO;
import com.team.delivery.DTO.bookingDTO;
import org.apache.catalina.Store;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface iBooking {
//    ArrayList<bookingDTO> bookinglist();
    ArrayList<bookingDTO> reservationlist(String mId);
    bookingDTO bookingend(int hSeqno);

    int hseqno();
    void bookingadd (
            int sSeqno,
            String hDate,
            String hTime,
            int hPeople,
            String hOnepeople,
            String mId,
            String hMobile,
            String hRequest
            );
}
