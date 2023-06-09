package com.riot.manager.mapper;

import com.riot.manager.dto.GameAccountDTO;
import com.riot.manager.dto.GameAccountViewDTO;
import com.riot.manager.entity.GameAccount;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GameAccountMapper {
    GameAccountDTO toDTO(GameAccount gameAccount);
    GameAccountViewDTO toViewDTO(GameAccount gameAccount);
    GameAccount toEntity(GameAccountDTO gameAccountDTO);
}
