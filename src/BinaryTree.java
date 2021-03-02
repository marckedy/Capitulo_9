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

public class BinaryTree {
    
    private ArrayList <Pregunta> preguntas;
    
    public BinaryTree(){
        preguntas = new ArrayList<>();
    }
    
    public void inicializar(){
        Pregunta pregunta = new Pregunta("¿El animal que estas pensando tiene patas?");
        
        Pregunta perro = new Pregunta("¿Es un perro?");
        perro.setPadre(0);
        Pregunta tiburon = new Pregunta("¿Es un tiburon?");
        tiburon.setPadre(0);
        
        pregunta.setSi(1);
        pregunta.setNo(2);
        
        this.preguntas.add(pregunta);
        this.preguntas.add(perro);
        this.preguntas.add(tiburon);
    }
    
    public void recorrer(){
        for(int i=0; i<preguntas.size(); i++){
            System.out.println("[" + i + "]: " + this.preguntas.get(i));
        }
    }
    
    public String preguntar(int noPregunta){
        return this.preguntas.get(noPregunta).getPreguntas();
    }
    
    public int responder(int noPregunta, String respuesta){
        if(respuesta.compareTo("YES") == 0){
            return this.preguntas.get(noPregunta).getSi();
        }else{
            return this.preguntas.get(noPregunta).getNo();
        }
    }
}
