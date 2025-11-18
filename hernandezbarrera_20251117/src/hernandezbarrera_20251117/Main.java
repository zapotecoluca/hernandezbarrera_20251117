/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandezbarrera_20251117;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArbolTernarioRecursivo arbol = new ArbolTernarioRecursivo(13);
        
        arbol.insertar('A'); //INDICE 0 (RAIZ)
        arbol.insertar('B'); //INDICE 1
        arbol.insertar('C'); //INDICE 2
        arbol.insertar('D'); //INDICE 3
        
        arbol.asignarHijos(0, 1, 2, 3);
        
        
        arbol.insertar('E'); //INDICE 4
        arbol.insertar('F'); //INDICE 5
        arbol.insertar('G'); //INDICE 6
        
        arbol.asignarHijos(1, 4, 5, 6);
        
        arbol.insertar('H'); //INDICE 7
        arbol.insertar('I'); //INDICE 8
        arbol.insertar('J'); //INDICE 9
        
        arbol.asignarHijos(2, 7, 8, 9);
        
        arbol.insertar('K'); //INDICE 10
        arbol.insertar('L'); //INDICE 11
        arbol.insertar('M'); //INDICE 12
        
        arbol.asignarHijos(3, 10, 11, 12);
        
        System.out.println("Recorrido preorden");
        System.out.println("------------------------------");
        arbol.recorrerPreOrden(arbol.raiz);
        System.out.println();
        System.out.println();
        
        System.out.println("Recorrido inorden");
        System.out.println("------------------------------");
        arbol.recorrerInOrden(arbol.raiz);
        System.out.println();
        System.out.println();
        
        System.out.println("Recorrido postorden");
        System.out.println("------------------------------");
        arbol.recorrerPostOrden(arbol.raiz);
        System.out.println();
        System.out.println();

        
        
        

        
        
    }
    
}
