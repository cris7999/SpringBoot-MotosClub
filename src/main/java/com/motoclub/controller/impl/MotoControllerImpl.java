package com.motoclub.controller.impl;

import com.motoclub.controller.MotoController;
import com.motoclub.dto.MotoDto;
import com.motoclub.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotoControllerImpl implements MotoController {

    private MotoService motoService;

    @Autowired
    public MotoControllerImpl(MotoService motoService){
        this.motoService = motoService;
    }


    @Override
    public void createMoto(MotoDto moto) {
        motoService.createMoto(moto);
    }
}
