package com.team.delivery.DTO.interceptor.mappers;

import com.team.delivery.DTO.cartDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface iCart {

	int addCart(cartDTO cart) throws Exception;

	//int delCart(int cartSeqno);

	//int modifyCount(cartDTO cart);

	//ArrayList<cartDTO> listCart(String mId);

	cartDTO checkCart(cartDTO cart);
}
