package com.riot.manager.dto;
import com.riot.manager.entity.Region;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserViewDTO {
    private String username;
    private List<Region> regionList;
}