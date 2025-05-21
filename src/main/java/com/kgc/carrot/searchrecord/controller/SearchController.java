package com.kgc.carrot.searchrecord.controller;


import com.kgc.carrot.searchrecord.model.SearchDetailDto;
import com.kgc.carrot.searchrecord.model.SearchDto;
import com.kgc.carrot.searchrecord.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/search")
public class SearchController {
    private final SearchService searchService;

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        List<SearchDetailDto> byId = searchService.findById(id);
        return ResponseEntity.ok(byId);
    }

}
