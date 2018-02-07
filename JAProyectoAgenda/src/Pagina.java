
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mati
 */
public class Pagina {

    private int dia;
    private int mes;

    private ArrayList<Cita> citas = new ArrayList<>();

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }

    public void añadirCita(Cita c) {
        this.citas.add(c);
    }

    public void borrarCita(Cita c) {
        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getHora() == c.getHora() && citas.get(i).getMinutos() == c.getMinutos()) {
                this.citas.remove(i);
            }
        }
    }
    
    public Cita buscaCita(int hora, int minutos){
        Cita busqueda= null, temp;
        int cont=0;
    }
}
