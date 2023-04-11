/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;

//import java.util.ArrayList;

/**
 *
 * @author candr
 */
public class Alfabeto extends Pictograma{
    
    private String[] letras;
    //private ArrayList<String> letras = new ArrayList<>();
    private String interpretacion;

    public Alfabeto(String origen,String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public String[] getLetras() {
        return letras;
    }

    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    
    public int cantidadLetras(){
        return letras.length;
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }
    
}
