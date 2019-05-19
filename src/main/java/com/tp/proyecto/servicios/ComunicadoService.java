/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.proyecto.servicios;

import com.tp.proyecto.entidades.Comunicado;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface ComunicadoService {

    public abstract List<Comunicado> listarComunicados();

    public abstract Comunicado obtenerEncabezado(String encabezado);
    
    
    
    public abstract List<Comunicado> obtenerListaPorFecha(String fecha_creacion);
    
    
}
