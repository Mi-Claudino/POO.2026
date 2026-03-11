package engtelecom.poo;

public class Lampada {

    // Atributos
    private boolean ligada = false;

    // Métodos
    //public void ligar(){
    //    ligada = true;
    //}

    //public void desliga(){
    //    ligada = false;
    //}

    public void ligardesligar(){
//        if (ligada == true){
//            ligada = false;
//        }else{
//            ligada = true;
//        }
        ligada = !ligada;

    }
    public boolean isLigada(){
        return ligada;
    }

}
