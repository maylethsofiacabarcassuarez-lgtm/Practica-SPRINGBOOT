package com.gestion.proyecto.entidad;

public class Proyecto {
    private Long id;
    private String nombreProyecto;
    private String integrantes;
    private String semestre;

    public Proyecto(Long id, String integrantes, String nombreProyecto, String semestre) {
        this.id = id;
        this.integrantes = integrantes;
        this.nombreProyecto = nombreProyecto;
        this.semestre = semestre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public String getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String integrantes) {
        this.integrantes = integrantes;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }



}
