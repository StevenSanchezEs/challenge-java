import com.ejemplo.model.Cliente;
import com.ejemplo.model.TipoCliente;
import java.util.*;

public class ClienteService {
    private final List<Cliente> clientes = new ArrayList<>();
    
    public void crearCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public List<Cliente> obtenerTodos() {
        return new ArrayList<>(clientes);
    }
    
    public void actualizarCliente(String id, String nuevoEmail, TipoCliente nuevoTipo) {
        clientes.replaceAll(c -> 
            c.id().equals(id) 
                ? new Cliente(c.id(), c.nombre(), nuevoEmail, c.edad(), nuevoTipo) 
                : c
        );
    }
    
    public void eliminarCliente(String id) {
        clientes.removeIf(c -> c.id().equals(id));
    }
    
    // Pattern Matching para VIPs
    public double aplicarDescuento(Cliente cliente) {
        return switch(cliente.tipoCliente()) {
            case VIP -> 0.05;  // 5% descuento
            case REGULAR -> 0.0;
        };
    }
}