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
    private String fabricator;
    private int year;
    private String type;

    public Moto(MotoDto motoDto){
        this.id = motoDto.getId();
        this.model = motoDto.getModel();
        this.fabricator = motoDto.getFabricator();
        this.year = motoDto.getYear();
        this.type = motoDto.getType();
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFabricator() {
        return fabricator;
    }

    public void setFabricator(String fabricator) {
        this.fabricator = fabricator;
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
