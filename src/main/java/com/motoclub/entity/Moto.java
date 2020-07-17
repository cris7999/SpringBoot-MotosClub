package com.motoclub.entity;

import com.motoclub.dto.MotoDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="motorbike")
public class Moto{
    @Id
    private long id;

    private String model;
    private String manufacter;
    private String type;
    private int year;

    public Moto(){}
    public Moto(long id){
        this.id = id;
    }

    public Moto(MotoDto motoDto){
        this.id = motoDto.getId();
        this.model = motoDto.getModel();
        this.manufacter = motoDto.getManufactor();
        this.year = motoDto.getYear();
        this.type = motoDto.getType();
    }
    public MotoDto getMotoDto(){
        return new MotoDto(this.id, this.model, this .manufacter, this.year, this.type);
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
