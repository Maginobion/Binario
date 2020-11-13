
package busqueda;
import java.util.Scanner;

public class Binario { 
    public static void main(String[] args){
    Scanner teclado=new Scanner (System.in);
    int lista[]={2, 4, 5, 9, 12, 15, 16, 28, 29, 51}; 
    int num, center, prim=0, last, valorcentro; 
    boolean encontrado = false; 
    last = lista.length-1; 
    System.out.print("Ingresar valor a buscar: "); 
    num=teclado.nextInt (); 
    while (prim <= last && encontrado == false) {
        center = (prim + last)/2; 
        valorcentro = lista[center]; 
        System.out.println("Comparando a " + num + " con " + valorcentro); 
    if (num == valorcentro){
        encontrado = true;
        System.out.println(center);} 
    else if (num<valorcentro) {
        last= center-1;
    }
else prim=center+1;
if (encontrado==false)
System.out.println("El valor no se encuentra en la lista.");
    }
}
}


