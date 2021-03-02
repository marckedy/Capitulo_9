/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Pregunta {
    
    public static final int WIN = -10;
    public static final int GIVEUP = -1;
    
    private int padre;
    private String preguntas;
    private int si;
    private int no;
    
    public Pregunta(String preguntas){
        this.padre = -1;
        this.preguntas = preguntas;
        this.si = Pregunta.WIN;
        this.no = Pregunta.GIVEUP;
    }
    
    public String toString(){
        return String.format("Padre: %d, Pregunta: %s, SI: %d, NO: %d", padre, preguntas, si, no);
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public int getSi() {
        return si;
    }

    public void setSi(int si) {
        this.si = si;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getPadre() {
        return padre;
    }

    public void setPadre(int padre) {
        this.padre = padre;
    }
    
    
    
    
}
