import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteServiceTest {
    @Test
    void testCrearYRecuperarCliente() {
        ClienteService service = new ClienteService();
        Cliente cliente = new Cliente("1", "Ana", "ana@mail.com", 30, TipoCliente.VIP);
        
        service.crearCliente(cliente);
        assertEquals(1, service.obtenerTodos().size());
    }
    
    @Test
    void testDescuentoVIP() {
        Cliente vip = new Cliente("1", "Ana", "ana@mail.com", 30, TipoCliente.VIP);
        Cliente regular = new Cliente("2", "Juan", "juan@mail.com", 25, TipoCliente.REGULAR);
        
        ClienteService service = new ClienteService();
        assertEquals(0.05, service.aplicarDescuento(vip));
        assertEquals(0.0, service.aplicarDescuento(regular));
    }
}