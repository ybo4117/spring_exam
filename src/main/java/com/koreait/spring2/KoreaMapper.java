package com.koreait.spring2;

import com.koreait.spring2.VO.ApartmentInfoEntity;
import com.koreait.spring2.VO.InsertEntity;
import com.koreait.spring2.VO.LocationCodeEntity;
import com.koreait.spring2.VO.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KoreaMapper {
    int insApartmentInfoArr(InsertEntity param);
    List<ApartmentInfoEntity> selApartmentInfoList(SearchDTO param);
    List<LocationCodeEntity> selLocationCodeList(SearchDTO param);
}
