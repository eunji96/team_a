package com.team.delivery.DTO.interceptor.mappers;
import java.util.ArrayList;

import com.team.delivery.DTO.StoreDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface iStore {
	ArrayList<StoreDTO> liststore(int sType);
	ArrayList<StoreDTO> menutable(int sSeqno);
	ArrayList<StoreDTO> searchtable(String word);
	ArrayList<StoreDTO> reviewlist(int sSeqno);
	StoreDTO listMenuDetail(int menuSeqno,
							int sSe);
	ArrayList<StoreDTO> bookinglist(int sSeqno);

}
