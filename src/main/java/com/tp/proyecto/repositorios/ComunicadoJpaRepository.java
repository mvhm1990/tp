/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.proyecto.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tp.proyecto.entidades.Comunicado;
import java.io.Serializable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Asus
 */
@Repository("ComunicadoJpaRepository")
public interface ComunicadoJpaRepository extends JpaRepository<Comunicado, Serializable> {

    @Override
    public abstract List<Comunicado> findAll();

    public abstract Comunicado findByEncabezado(String encabezado);

    @Query(value = "SELECT * FROM comunicado where fecha_Creacion like %:fecha%", nativeQuery = true)
    public List<Comunicado> listarporfecha(@Param("fecha") String fecha);
}
