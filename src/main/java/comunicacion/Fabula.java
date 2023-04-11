/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;

/**
 *
 * @author candr
 */
public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;
    
    public Fabula (String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }
    
    public void setEnsenanza(String ensenanza){
        this.ensenanza = ensenanza;
    }
    public String getEnsenanza (){
        return ensenanza;
    }
    
    public void setInterpretacion (String interpretacion){
        this.interpretacion = interpretacion;
    }
    public String getInterpretacion(){
        return interpretacion;
    }
    
    @Override
    public int palabrasTotales(int num) {
        int factor = 1;
        return (getPaginas()* num * factor);
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    
    @Override
    public String toString(){
        return (getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+
                "\n"+getPaginas()+"\n"+ensenanza);
    }
}
