package com.motoclub.services;

import com.motoclub.dto.MotoDto;
import com.motoclub.entity.Moto;

import java.util.List;

public interface MotoService {

    Moto createMoto(MotoDto moto);
    List<MotoDto> getMotos();
}
