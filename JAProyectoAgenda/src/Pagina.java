
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
        boolean encontrado=false;
        
        while (cont < this.citas.size() && encontrado == false){
            temp=this.citas.get(cont++);
            if(temp.getHora()== hora && temp.getMinutos() == minutos){
                busqueda=temp;
                encontrado=true;
            }
        }
        return busqueda;
    }
    
    public void leerPagina(){
        StringBuilder st = new StringBuilder(this.getDia()+"/"+this.getMes()+"\n");
            if(this.citas.isEmpty()){
                st.append("La Pagina esta en blanco. \n");
            }else {
                for(int i=0; i< this.citas.size();i++){
                    st.append(this.citas.get(i).leerCita());                }
            }
            System.out.println(st.toString());
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public ArrayList<Cita> getCitas() {
        return citas;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setCitas(ArrayList<Cita> citas) {
        this.citas = citas;
    }
    
}
