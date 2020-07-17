package com.motoclub.controller.impl;

import com.motoclub.controller.MotoController;
import com.motoclub.dto.MotoDto;
import com.motoclub.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ComponentScan(basePackageClasses = MotoService.class)
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

    @Override
    @GetMapping("/get")
    public List<MotoDto> getMotos() {
        return motoService.getMotos();
    }

    @Override
    @GetMapping("/test")
    public String echo() {
        return "ping";
    }
}
