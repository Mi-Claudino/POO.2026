package engtelecom.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int dia = Integer.parseInt(IO.readln("Entre com o dia "));
        String mes = IO.readln("Entre com o mês ");

        String resultado = switch(mes.toLowerCase()) {
            case "janeiro", "fevereiro" -> "Verão";
            case "marco", "março" -> (dia < 20) ? "Verão" : "Outono";
            case "abril", "maio" -> "Outono";
            case "junho" -> (dia < 20) ? "Outono" : "Inverno";
            case "julho", "agosto" -> "Inverno";
            case "setembro" -> (dia < 22) ? "Inverno" : "Primavera";
            case "outubro", "novembro" -> "Primavera";
            case "dezembro" -> (dia < 21) ? "Primavera" : "Verão";
            default -> "";
        };

        IO.println("Estação é " + resultado);
        }
    }

