package com.resotechtaskmang.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto{
    private Long id;
    private String title;
    private String description;
    private String priority;
    private String status;
}

