/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mati
 */
public class Agenda {

    private int anyo;

    private Pagina[] paginas;
    public Pagina abierta;
    
    Agenda(int anyo){
        this.anyo= anyo;
        if(anyo % 4 ==0){
            inicializa(true);
        }else inicializa(false);
    }
    
    private void inicializa(boolean b){
        this.paginas= new Pagina[b? 366 : 365];
        int dia = 0;
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,1);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,2);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,3);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,4);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,5);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,6);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,7);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,8);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,9);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,10);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,11);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,12);
        }
        for(int i=1;i<= 31; i++){
            paginas[dia++]= new Pagina(i,1);
        }
        
        public Pagina BuscaPagina(int dia, int mes) {
            Pagina busqueda =null, temp;
            int cont= 0;
            boolean encontrado =false;
            
            while (cont < paginas.length && encontrado ==false){
                temp=paginas[cont++];
                if()
            }
        }
    }
}
