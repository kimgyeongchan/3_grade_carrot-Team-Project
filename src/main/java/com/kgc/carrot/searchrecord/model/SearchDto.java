package com.kgc.carrot.searchrecord.model;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SearchDto {
    private Long id;
    private Long userId;
    private String searchContent;
    private LocalDateTime createDt;
    private LocalDateTime updateDt;
}
