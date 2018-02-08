/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Cita {

    private int hora;
    private int minutos;
    private String titulo;
    private String texto;

    public Cita(int hora, int minutos, String titulo, String texto) {
        this.hora = hora;
        this.minutos = minutos;
        this.titulo = titulo;
        this.texto = texto;
    }

    public String leerCita(){
        StringBuilder st =new StringBuilder();
        st.append("").append(this.getHora()).append(":").append(this.getMinutos()).append(" - ");
        st.append((this.getTitulo())).append("\n");
        st.append(this.getTexto()).append("\n\n");
        
        
        return st.toString();
    }
    

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
}
