/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comunicacion;

/**
 *
 * @author candr
 */
public class Libro extends Escrito {
    public String co_autor;
    public String editorial;
    public String edicion;
    public String interpretacion;
    
    public Libro(String origen, String titulo, String autor, int paginas, String coAutor, String editorial, String edicion, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.co_autor = coAutor;
        this.edicion = edicion;
        this.editorial = editorial;
        this.interpretacion = interpretacion;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public void setCo_autor(String co_autor) {
        this.co_autor = co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    
    @Override
    public int palabrasTotales(int num) {
        int factor = 2;
        return (getPaginas()* num * factor);
    }
    
    @Override
    public String interpretacion() {
        return interpretacion;
    }
    
    @Override
    public String toString(){
        return (getOrigen()+"\n"+getTitulo()+"\n"+getAutor()+
                "\n"+getPaginas()+"\n"+co_autor+"\n"+editorial+
                "\n"+edicion);
    }
}
