package com.kgc.carrot.searchrecord.mapper;

import com.kgc.carrot.searchrecord.model.SearchDetailDto;
import com.kgc.carrot.searchrecord.model.SearchDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SearchMapper {

    List<SearchDetailDto> selectRecordWithUser(Long id);
}
