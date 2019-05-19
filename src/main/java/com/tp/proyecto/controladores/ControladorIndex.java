/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tp.proyecto.controladores;

import com.tp.proyecto.serviciosimpl.ComunicadoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/indice")
public class ControladorIndex {

    @Autowired
    @Qualifier("ComunicadoServiceImpl")
    ComunicadoServiceImpl ComunicadoServiceImpl;

    @GetMapping("/listarcomunicados")
    public ModelAndView listarcomunicados() {
        ModelAndView modelo = new ModelAndView("indexprueba");
        modelo.addObject("listacomunicados", ComunicadoServiceImpl.listarComunicados());
        modelo.addObject("comunicado", ComunicadoServiceImpl.obtenerEncabezado("perro"));
        return modelo;
    }

    @GetMapping("/listar")
    public ModelAndView listar() {
        ModelAndView modelo = new ModelAndView("indexprueba");
        return modelo;
    }
}
