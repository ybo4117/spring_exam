package com.koreait.spring2;

import com.koreait.spring2.VO.LocationCodeEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KoreaMapper {
    List<LocationCodeEntity> selLocationCodeList();
}
