package com.idat.Dto;

public class HospitalDtoResponse {

    private Integer id_hospítalDto;
    private String nombreDto;
    private String descripcionDto;
    private String distritoDto;
    public Integer getId_hospítalDto() {
        return id_hospítalDto;
    }
    public void setId_hospítalDto(Integer id_hospítalDto) {
        this.id_hospítalDto = id_hospítalDto;
    }
    public String getNombreDto() {
        return nombreDto;
    }
    public void setNombreDto(String nombreDto) {
        this.nombreDto = nombreDto;
    }
    public String getDescripcionDto() {
        return descripcionDto;
    }
    public void setDescripcionDto(String descripcionDto) {
        this.descripcionDto = descripcionDto;
    }
    public String getDistritoDto() {
        return distritoDto;
    }
    public void setDistritoDTO(String distritoDto) {
        this.distritoDto = distritoDto;
    }

}