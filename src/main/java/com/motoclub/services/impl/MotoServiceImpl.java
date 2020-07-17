package com.motoclub.services.impl;

import com.motoclub.dto.MotoDto;
import com.motoclub.entity.Moto;
import com.motoclub.repository.MotoRepository;
import com.motoclub.services.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@ComponentScan(basePackages = "com.motoclub.repository")
public class MotoServiceImpl implements MotoService {

    @Autowired
    private MotoRepository motoRepository;

    public MotoServiceImpl(MotoRepository motoRepository) {
        this.motoRepository = motoRepository;
    }

    @Override
    @Transactional
    public Moto createMoto(MotoDto motoDto) {
        Moto motoEntity = new Moto(motoDto);
        return motoRepository.save(motoEntity);
    }

    @Override
    public List<MotoDto> getMotos() {
        List<MotoDto> motosDto = new ArrayList<>();
        List<Moto> motoEntities = motoRepository.findAll();
        for (Moto m: motoEntities){
            motosDto.add(m.getMotoDto());
        }
        return motosDto;
    }
}
