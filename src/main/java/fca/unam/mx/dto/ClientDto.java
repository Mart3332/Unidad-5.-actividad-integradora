package fca.unam.mx.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class ClientDto {
    private Long id_cliente;
    private String name;
    private String paternal_surname;
    private String maternal_surname;
    private String RFC;

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    @ColumnName("nombre")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ColumnName("apellido_paterno")
    public String getPaternal_surname() {
        return paternal_surname;
    }

    public void setPaternal_surname(String paternal_surname) {
        this.paternal_surname = paternal_surname; 
    }

    @ColumnName("apellido_materno")
    public String getMaternal_surname() {
        return maternal_surname;
    }

    public void setMaternal_surname(String maternal_surname) {
        this.maternal_surname = maternal_surname; 
    }

    @ColumnName("RFC")
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC; 
    }


}
