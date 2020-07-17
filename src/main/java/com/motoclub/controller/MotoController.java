package com.motoclub.controller;


import com.motoclub.dto.MotoDto;

import java.util.List;

public interface MotoController {
    void createMoto(MotoDto moto);
    List<MotoDto> getMotos();
    String echo();
}
