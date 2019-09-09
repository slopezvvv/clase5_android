package cl.tuserver.sistemaSeguimientoProductos.DTO.oficinas;

public class Oficina {
    // Atributos
    private final int id;
    private boolean isEntregado;

    // Consstrutor
    protected Oficina(int id){
        this.id = id;
        isEntregado = false;
    }

    // GET
    public final int getId(){
        return id;
    }
    // SET

    // CUSTOM
    public final boolean isEntregado(){
        return isEntregado;
    }
}
