package com.motoclub.services.impl;

import com.motoclub.dto.MotoDto;
import com.motoclub.entity.Moto;
import com.motoclub.repository.MotoRepository;
import com.motoclub.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

public class MotoServiceImpl implements MotoService {

    private MotoRepository motoRepository;

    @Autowired
    public MotoServiceImpl(MotoRepository motoRepository){
        this.motoRepository = motoRepository;
    }
    @Override
    @Transactional
    public Moto createMoto(MotoDto motoDto) {
        Moto motoEntity = new Moto(motoDto);
        return motoRepository.save(motoEntity);
    }
}
