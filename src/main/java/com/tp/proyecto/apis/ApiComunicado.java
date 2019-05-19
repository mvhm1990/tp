package com.tp.proyecto.apis;

import com.tp.proyecto.entidades.Comunicado;
import com.tp.proyecto.servicios.ComunicadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class ApiComunicado {

    @Autowired
    @Qualifier("ComunicadoServiceImpl")
    ComunicadoService ComunicadoServiceImpl;

    @PostMapping("/listar")
    public List<Comunicado> listar(@RequestBody Comunicado comunicado) {
        return ComunicadoServiceImpl.obtenerListaPorFecha(comunicado.getFecha_Creacion());
    }
}
