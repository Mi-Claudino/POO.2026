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

    public void ligarDesligar(){
//        if (ligada == true){
//            ligada = false;
//        }else{
//            ligada = true;
//        } Temos o jeito extremamente mais sofisticado de fazer a mesma coisa abaixo
        ligada = !ligada;

    }
    public boolean isLigada(){
        return ligada;
    }

}
