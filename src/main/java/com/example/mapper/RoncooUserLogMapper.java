package com.example.mapper;

import com.example.bean.Owner;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoncooUserLogMapper {

    int insert(Owner record);

}