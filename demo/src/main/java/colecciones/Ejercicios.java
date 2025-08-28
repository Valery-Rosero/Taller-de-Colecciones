package colecciones;

import modelo.Pedido;
import java.util.*;

public class Ejercicios {
    
    // Parte A - ArrayList
    public static void parteA_ArrayList() {
        System.out.println("=== PARTE A - ArrayList ===");
        
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido(1, "Juan", "Hamburguesa", 25.0));
        pedidos.add(new Pedido(2, "Maria", "Pizza", 35.0));
        pedidos.add(new Pedido(3, "Carlos", "Ensalada", 15.0));
        pedidos.add(new Pedido(4, "Ana", "Pizza", 45.0));
        pedidos.add(new Pedido(5, "Luis", "Sushi", 60.0));
        
        System.out.println("1. Pedidos iniciales:");
        pedidos.forEach(System.out::println);
        
        pedidos.add(0, new Pedido(6, "Urgente1", "Pizza", 50.0));
        pedidos.add(0, new Pedido(7, "Urgente2", "Hamburguesa", 30.0));
        
        System.out.println("\n2. Después de agregar pedidos urgentes:");
        pedidos.forEach(System.out::println);
    }
    
    // Parte A - LinkedList
    public static void parteA_LinkedList() {
        System.out.println("\n=== PARTE A - LinkedList ===");
        
        List<Pedido> pedidos = new LinkedList<>();
        pedidos.add(new Pedido(1, "Juan", "Hamburguesa", 25.0));
        pedidos.add(new Pedido(2, "Maria", "Pizza", 35.0));
        pedidos.add(new Pedido(3, "Carlos", "Ensalada", 15.0));
        pedidos.add(new Pedido(4, "Ana", "Pizza", 45.0));
        pedidos.add(new Pedido(5, "Luis", "Sushi", 60.0));
        
        System.out.println("1. Pedidos iniciales:");
        pedidos.forEach(System.out::println);
        
        pedidos.add(0, new Pedido(6, "Urgente1", "Pizza", 50.0));
        pedidos.add(0, new Pedido(7, "Urgente2", "Hamburguesa", 30.0));
        
        System.out.println("\n2. Después de agregar pedidos urgentes:");
        pedidos.forEach(System.out::println);
        
        System.out.println("\n3. Explicación: Para 1000 pedidos urgentes, LinkedList es más eficiente");
        System.out.println("   porque insertar al inicio es O(1), mientras que en ArrayList es O(n)");
    }

}