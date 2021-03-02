/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
import java.util.ArrayList;

public class Principal {
    
    public static void main(String[] args) {
        
        BinaryTree arbol = new BinaryTree();
        
        arbol.inicializar();
        
        int respuesta = 0;
        
        do{
            System.out.println(arbol.preguntar(respuesta));
            respuesta = arbol.responder(respuesta, "YES");
            System.out.println(respuesta);    
        }while(respuesta != -10);
        
        
        
    }
}
