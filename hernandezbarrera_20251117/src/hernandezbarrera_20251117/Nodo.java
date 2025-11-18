/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hernandezbarrera_20251117;

/**
 *
 * @author UFG
 */
public class Nodo {
    
    char valor;
    
    //PUNTEROS
    int izquierda;
    int derecha;
    int centro;
    
    public Nodo(char valor) {
        this.valor = valor;
        this.izquierda = -1;
        this.derecha = -1;
        this.centro = -1;
    }
}
