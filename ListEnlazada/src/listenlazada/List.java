package listenlazada;
/**@author Gustavo_Castillo*/
public class List {
    protected Nodo inicio, fin;
     public List(){
        inicio = null;
        fin    = null;
    }
    public void agregarAlInicio(String nombre){
        inicio = new Nodo (nombre, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void mostrarListaEnlazada(){
        Nodo recorrer = inicio;
        System.out.println("");
        while (recorrer != null){
            System.out.print("["+ recorrer.name+"] -->");
            recorrer = recorrer.siguiente;
        }
        System.out.println("");
    }
    public int borrarDlInicio(){
        String nombre = inicio.name;
        if (inicio == fin){
            inicio = null;
            fin    = null;
        } else {
            inicio = inicio.siguiente;
        }
           return 0;
        }
    public void agregarAlInicio1(int dato){
        inicio = new Nodo(dato, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void mostrarListaEnlazada1(){
        Nodo recorrer = inicio;
        System.out.println("");
        while (recorrer != null){
            System.out.print("["+ recorrer.dato+"] -->");
            recorrer = recorrer.siguiente;
        }
        System.out.println("");
    }
    // Metodo para eliminar un nodo del inicio
    public int borrarDelInicio1(){
        int dato = inicio.dato;
        if (inicio == fin){
            inicio = null;
            fin    = null;
        } else {
            inicio = inicio.siguiente;
        }
        return dato;
    }
}
//
