package com.example.rentacar.core.utilities.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
