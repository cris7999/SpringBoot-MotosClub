package com.motoclub.controller;


import com.motoclub.dto.MotoDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface MotoController {
    public void createMoto(MotoDto moto);

}
