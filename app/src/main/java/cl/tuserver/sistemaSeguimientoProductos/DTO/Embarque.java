package cl.tuserver.sistemaSeguimientoProductos.DTO;

import java.util.UUID;

import cl.tuserver.sistemaSeguimientoProductos.DTO.oficinas.OficinaMuelle;

public class Embarque {
    private UUID id;
    private OficinaMuelle puertoOrigen, puertoDestino;
    private int horaSalida, horaLlegado;

    public Embarque(){
        this.id = UUID.randomUUID();
    }
}
