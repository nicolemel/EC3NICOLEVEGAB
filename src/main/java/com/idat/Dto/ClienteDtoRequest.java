package com.idat.Dto;

public class ClienteDtoRequest {
    private Integer id_clienteDto;
    private String nombreDto;
    private String celularDto;
    public Integer getId_clienteDto() {
        return id_clienteDto;
    }
    public void setId_clienteDTO(Integer id_clienteDto) {
        this.id_clienteDto = id_clienteDto;
    }
    public String getNombreDto() {
        return nombreDto;
    }
    public void setNombreDto(String nombreDto) {
        this.nombreDto = nombreDto;
    }
    public String getCelularDto() {
        return celularDto;
    }
    public void setCelularDto(String celularDto) {
        this.celularDto = celularDto;
    }
}