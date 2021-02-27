package listenlazada;
/**@author Gustavo_Castillo*/
public class ListEnlazada {
    public static void main(String[] args) {
        List listaenlazada = new List();
        listaenlazada.agregarAlInicio("Estefania");
        listaenlazada.agregarAlInicio("Jose");
        listaenlazada.agregarAlInicio("Cecilia");
        listaenlazada.agregarAlInicio("Gregorio");
        listaenlazada.agregarAlInicio("Daniel");
        listaenlazada.agregarAlInicio("Yazuri ");
        listaenlazada.agregarAlInicio("Cristian");
        listaenlazada.agregarAlInicio("Darlin");
        listaenlazada.agregarAlInicio("Orlando");
        listaenlazada.agregarAlInicio("Erika");
        listaenlazada.mostrarListaEnlazada();
        listaenlazada.borrarDlInicio();
        listaenlazada.mostrarListaEnlazada();
     //--------------------------------------------//
        List lista = new List();
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.agregarAlInicio("20");
        listaenlazada.mostrarListaEnlazada();
        listaenlazada.borrarDlInicio();
        listaenlazada.mostrarListaEnlazada();
    }
}