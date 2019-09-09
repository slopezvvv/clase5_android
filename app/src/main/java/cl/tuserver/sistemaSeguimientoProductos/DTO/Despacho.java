package cl.tuserver.sistemaSeguimientoProductos.DTO;

import cl.tuserver.sistemaSeguimientoProductos.ENUM.EnumDespacho;

public class Despacho {
    private int seguimiento;
    private Producto producto;
    private Cliente cliente;
    private boolean isFinaliza, isDevolucion;
    private String razonDevolucion;

    private final EnumDespacho[] ruta;
    private EnumDespacho puntoActual;

    public Despacho(){
        this.ruta = EnumDespacho.values();
    }

    public final void checkList(EnumDespacho input, boolean isCheck){
        for(int i = 0; i < ruta.length; i++){
            EnumDespacho cursor = ruta[i];
            if(cursor.equals(input)) {
                ruta[i].setEstado(isCheck);
                puntoActual = cursor;
            }
        }
    }

    public final EnumDespacho getPuntoActual(){
        return puntoActual;
    }

    public final boolean getEstadoGeneral(){
        for(EnumDespacho despacho : ruta)
            if(!despacho.isEstado()) return false;
        return true;
    }



}
