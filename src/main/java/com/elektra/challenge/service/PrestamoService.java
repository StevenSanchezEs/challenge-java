import com.ejemplo.model.*;
import java.util.*;

public class PrestamoService {
    private final List<Prestamo> prestamos = new ArrayList<>();
    private final ClienteService clienteService;
    
    public PrestamoService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    
    public double calcularMontoTotal(String prestamoId) {
        Prestamo prestamo = prestamos.stream()
            .filter(p -> p.getId().equals(prestamoId))
            .findFirst()
            .orElseThrow();
        
        Cliente cliente = clienteService.obtenerTodos().stream()
            .filter(c -> c.id().equals(prestamo.getClienteId()))
            .findFirst()
            .orElseThrow();
        
        double tasa = (cliente.tipoCliente() == TipoCliente.VIP) ? 0.05 : 0.10;
        return prestamo.getMonto() * (1 + tasa);
    }
}