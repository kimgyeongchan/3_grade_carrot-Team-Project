package com.kgc.carrot.searchrecord.service;

import com.kgc.carrot.searchrecord.mapper.SearchMapper;
import com.kgc.carrot.searchrecord.model.SearchDetailDto;
import com.kgc.carrot.searchrecord.model.SearchDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SearchServiceImpl implements SearchService{

    private final SearchMapper searchMapper;

    @Override
    public List<SearchDetailDto> findById(Long id) {
        return searchMapper.selectRecordWithUser(id);
    }
}
