package cl.tuserver.sistemaSeguimientoProductos.ENUM;

public enum EnumDespacho {
    EMBARQUE, MUELLE, LOGISTICA, CORREO, CLIENTE;

    private boolean estado;

    public final boolean isEstado(){
        return estado;
    }

    public final void setEstado(boolean estado){
        this.estado = estado;
    }

}
