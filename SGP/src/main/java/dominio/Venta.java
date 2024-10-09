/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Juan Sánchez
 */
public class Venta {

    private int id;
    private int objetoPedido;
    private int objetoProducto;
    private int cantidad;
    private float precio;
    private float importe;

    //Constructor vacío
    public Venta() {
    }

    /**
     * Constructor sin ID
     *
     * @param objetoPedido ID del Pedido.
     * @param objetoProducto ID del Producto.
     * @param cantidad Cantidad de productos.
     * @param precio Precio del producto.
     * @param importe Importe total de la venta.
     */
    public Venta(int objetoPedido, int objetoProducto, int cantidad, float precio, float importe) {
        this.objetoPedido = objetoPedido;
        this.objetoProducto = objetoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

    /**
     * Constructor de Venta
     *
     * @param id ID de la venta.
     * @param objetoPedido ID del Pedido.
     * @param objetoProducto ID del Producto.
     * @param cantidad Cantidad de productos.
     * @param precio Precio del producto.
     * @param importe Importe total de la venta.
     */
    public Venta(int id, int objetoPedido, int objetoProducto, int cantidad, float precio, float importe) {
        this.id = id;
        this.objetoPedido = objetoPedido;
        this.objetoProducto = objetoProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.importe = importe;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getObjetoPedido() {
        return objetoPedido;
    }

    public void setObjetoPedido(int objetoPedido) {
        this.objetoPedido = objetoPedido;
    }

    public int getObjetoProducto() {
        return objetoProducto;
    }

    public void setObjetoProducto(int objetoProducto) {
        this.objetoProducto = objetoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + this.id;
        hash = 61 * hash + this.objetoPedido;
        hash = 61 * hash + this.objetoProducto;
        hash = 61 * hash + this.cantidad;
        hash = 61 * hash + Float.floatToIntBits(this.precio);
        hash = 61 * hash + Float.floatToIntBits(this.importe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Venta other = (Venta) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.objetoPedido != other.objetoPedido) {
            return false;
        }
        if (this.objetoProducto != other.objetoProducto) {
            return false;
        }
        if (this.cantidad != other.cantidad) {
            return false;
        }
        if (Float.floatToIntBits(this.precio) != Float.floatToIntBits(other.precio)) {
            return false;
        }
        return Float.floatToIntBits(this.importe) == Float.floatToIntBits(other.importe);
    }

    /**
     * Manda la información del objeto.
     *
     * @return Información del objeto.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venta{");
        sb.append("id=").append(id);
        sb.append(", objetoPedido=").append(objetoPedido);
        sb.append(", objetoProducto=").append(objetoProducto);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", precio=").append(precio);
        sb.append(", importe=").append(importe);
        sb.append('}');
        return sb.toString();
    }

}
