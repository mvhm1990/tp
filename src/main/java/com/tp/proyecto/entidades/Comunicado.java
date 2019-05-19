package com.tp.proyecto.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comunicado")
public class Comunicado implements Serializable {

    @Id
    @Column(name = "id_Comunicado")
    private int id_Comunicado;

    @Column(name = "id_Estado_Comunicado")
    private int id_Estado_Comunicado;

    @Column(name = "id_Tipo_Comunicado")
    private int id_Tipo_Comunicado;

    @Column(name = "titulo_Principal")
    private String titulo_Principal;

    @Column(name = "titulo_Sub")
    private String titulo_Sub;

    @Column(name = "cuerpo_Descripcion")
    private String cuerpo_Descripcion;

    @Column(name = "fecha_Creacion")
    private String fecha_Creacion;

    @Column(name = "fecha_Expiracion")
    private String fecha_Expiracion;

    @Column(name = "encabezado")
    private String encabezado;

    @Column(name = "pie_Pagina")
    private String pie_Pagina;

    @Column(name = "imagen")
    private int imagen;

    @Column(name = "titulo")
    private String titulo;

    public int getId_Comunicado() {
        return id_Comunicado;
    }

    public void setId_Comunicado(int id_Comunicado) {
        this.id_Comunicado = id_Comunicado;
    }

    public int getId_Estado_Comunicado() {
        return id_Estado_Comunicado;
    }

    public void setId_Estado_Comunicado(int id_Estado_Comunicado) {
        this.id_Estado_Comunicado = id_Estado_Comunicado;
    }

    public int getId_Tipo_Comunicado() {
        return id_Tipo_Comunicado;
    }

    public void setId_Tipo_Comunicado(int id_Tipo_Comunicado) {
        this.id_Tipo_Comunicado = id_Tipo_Comunicado;
    }

    public String getTitulo_Principal() {
        return titulo_Principal;
    }

    public void setTitulo_Principal(String titulo_Principal) {
        this.titulo_Principal = titulo_Principal;
    }

    public String getTitulo_Sub() {
        return titulo_Sub;
    }

    public void setTitulo_Sub(String titulo_Sub) {
        this.titulo_Sub = titulo_Sub;
    }

    public String getCuerpo_Descripcion() {
        return cuerpo_Descripcion;
    }

    public void setCuerpo_Descripcion(String cuerpo_Descripcion) {
        this.cuerpo_Descripcion = cuerpo_Descripcion;
    }

    public String getFecha_Creacion() {
        return fecha_Creacion;
    }

    public void setFecha_Creacion(String fecha_Creacion) {
        this.fecha_Creacion = fecha_Creacion;
    }

    public String getFecha_Expiracion() {
        return fecha_Expiracion;
    }

    public void setFecha_Expiracion(String fecha_Expiracion) {
        this.fecha_Expiracion = fecha_Expiracion;
    }

    public String getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    public String getPie_Pagina() {
        return pie_Pagina;
    }

    public void setPie_Pagina(String pie_Pagina) {
        this.pie_Pagina = pie_Pagina;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
