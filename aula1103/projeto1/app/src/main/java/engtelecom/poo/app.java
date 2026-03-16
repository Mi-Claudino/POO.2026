package engtelecom.poo;

public class app {
    public static void main(String[] args){
//
//        Lampada a = new Lampada();
//        Lampada b = new Lampada();
//
//        IO.println(a.isLigada());
//        a.ligarDesligar();
//        IO.println(a.isLigada());
//        IO.println(b.isLigada());
//
//
        Caneta bic = new Caneta();

        bic.setCor("azul");

        IO.println(bic.getCor());

        bic.setNivelTinta(100);

        bic.abrirFechar();


        IO.println(bic.desenhar(2, 2, 4, 2));


    }
}
