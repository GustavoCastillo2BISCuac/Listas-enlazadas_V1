package listenlazada;
/**@author Gustavo_Castillo*/
public class Nodo {
    public String name;   
    public Nodo siguiente;  
    public int dato;
    public Nodo (String d){
        this.name = d;
    }
    public Nodo (String d, Nodo n){
        name = d;
        siguiente = n;
    }
    public Nodo (int d){
        this.dato = d;
    }
    public Nodo (int d, Nodo n){
        dato = d;
        siguiente = n;
    }
}