package com.example.mapper;

import com.example.bean.Owner;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RoncooUserMapper {

    int insert(Owner record);

}