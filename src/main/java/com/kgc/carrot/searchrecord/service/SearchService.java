package com.kgc.carrot.searchrecord.service;


import com.kgc.carrot.searchrecord.model.SearchDetailDto;

import java.util.List;

public interface SearchService {
    List<SearchDetailDto> findById(Long id);
}
