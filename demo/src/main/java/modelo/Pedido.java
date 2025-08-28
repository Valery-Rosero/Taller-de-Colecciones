package modelo;

import java.util.Objects;

public class Pedido {
    private int id;
    private String cliente;
    private String producto;
    private double total;
    
    public Pedido(int id, String cliente, String producto, double total) {
        this.id = id;
        this.cliente = cliente;
        this.producto = producto;
        this.total = total;
    }
    
    public int getId() { return id; }
    public String getCliente() { return cliente; }
    public String getProducto() { return producto; }
    public double getTotal() { return total; }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return id == pedido.id;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public String toString() {
        return "Pedido{id=" + id + ", cliente='" + cliente + "', producto='" + producto + "', total=$" + total + "}";
    }
}
