package engtelecom.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;
    private boolean aberto = false;

    public boolean isAberto(){
        return aberto;
    }

    public String desenhar(int x1, int y1, int x2, int y2){
        if (!aberto){
            return "Caneta está fechada";
        }

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2)   + Math.pow(y2 - y1, 2));
        double consumo = distancia * 0.01;

        if(consumo > nivelTinta){
            return "Não há tinta suficiente para desenhar essa distância";
        }

        nivelTinta -= consumo;
        return String.format("Desenhei %.2f cm e consumi %.2f de tinta", distancia, consumo);

    }

    public void abrirFechar(){
            aberto = !aberto;
    }

    public void setCor(String c) { // Metodo é sempre verbo, atributo sempre substantivo
        cor = c;
    }

    public String getCor(){
        return cor;
    }

    public void setNivelTinta(double nt){
        nivelTinta = nt;
    }

    public double getNivelTinta(){
        return nivelTinta;
    }



}
