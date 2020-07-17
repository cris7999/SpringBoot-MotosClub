package com.motoclub.dto;

public class MotoDto {

    private long id;
    private String model;
    private String manufactor;
    private int year;
    private String type;

    public MotoDto(long id, String model, String manufacter, int year, String type) {
        this.id = id;
        this.model = model;
        this.manufactor = manufacter;
        this.year = year;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
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

    @Override
    public String toString() {
        return "MotoDto [id=" + id + ", model=" + model + " fabricator:"+ manufactor +"]";
    }
}
