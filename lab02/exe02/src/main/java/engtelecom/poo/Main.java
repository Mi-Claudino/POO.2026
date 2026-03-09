package engtelecom.poo;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        Random r = new Random();
        int numeroaleatorio = r.nextInt(100);
        int numerojogador = Integer.parseInt(IO.readln("Entra com o Número"));

        int tentativas = 0;
        while (numeroaleatorio != numerojogador){
            if (numeroaleatorio > numerojogador){
                IO.println("O número é maior");
        }
    }
}
