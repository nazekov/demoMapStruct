package kg.mega.demomapstruct.service;

import kg.mega.demomapstruct.model.dto.UnionDto;

import java.util.List;

public interface TaskService {

    Object run(int taskNum);

    List<UnionDto> findAllProductsByMaker(String maker);
}
