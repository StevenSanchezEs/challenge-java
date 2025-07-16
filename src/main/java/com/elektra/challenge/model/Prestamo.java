import java.time.LocalDate;

public class Prestamo {
    private String id;
    private double monto;
    private String clienteId;
    private LocalDate fecha;
    private EstadoPrestamo estado;

    public String getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public String getClienteId() {
        return clienteId;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public EstadoPrestamo getEstado() {
        return estado;
    }
}