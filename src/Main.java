
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();
        imprimirLista(productos);
        imprimirProductoMasCaro(productos);
        imprimirProductoMasBarato(productos);
    }

    private static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Coca-Cola Zero", "Litros: 1.5", 20));
        productos.add(new Producto("Coca-Cola", "Litros: 1.5", 18));
        productos.add(new Producto("Shampoo Sedal", "Contenido: 500ml", 19));
        productos.add(new Producto("Frutillas", "Precio: $64 /// Unidad de venta: kilo", 64));
        return productos;
    }

    private static void imprimirLista(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=============================");
    }

    private static void imprimirProductoMasCaro(List<Producto> productos) {
        Producto masCaro = Collections.max(productos);
        System.out.println("Producto más caro: " + masCaro.getNombre());
    }

    private static void imprimirProductoMasBarato(List<Producto> productos) {
        Producto masBarato = Collections.min(productos);
        System.out.println("Producto más barato: " + masBarato.getNombre());
    }
}
