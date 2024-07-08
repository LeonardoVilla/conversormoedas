import java.io.IOException;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {

        int op = 0;
        float montante = 0;
        String base;
        String target;
        Scanner valor = new Scanner(System.in);
        ConsultaConversao consulta = new ConsultaConversao();

        while (op != 7) {
            System.out.println("|||||||||||||||||||||||||||||||||||||||||| \n" +
                    "Conversor de valor de Moeda =]\n" +
                    "\n" +
                    "1) Dólar => Real brasileiro\n" +
                    "2) Peso argentino => Dólar\n" +
                    "3) Dólar => Peso argentino\n" +
                    "4) Real brasileiro => Dólar\n" +
                    "5) Dólar => Peso Colombiano\n" +
                    "6) Peso Colombiano => Dólar\n" +
                    "7) Sair\n" +
                    "\n" +
                    "Selecione uma opção válida:\n" +
                    "|||||||||||||||||||||||||||||||||||||||||||||||||||||\n");

            op = valor.nextInt();

            if (op != 7) {
                System.out.println("Informe qual valor você deseja converter:");
                montante = valor.nextInt();
            }

            switch (op) {
                case 1:
                    base = "USD";
                    target = "BRL";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 2:
                    base = "ARS";
                    target = "USD";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 3:
                    base = "USD";
                    target = "ARS";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 4:
                    base = "BRL";
                    target = "USD";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 5:
                    base = "USD";
                    target = "COP";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 6:
                    base = "COP";
                    target = "USD";
                    opcaoDeMoeda(base, target, montante, consulta);
                    break;
                case 7:
                    System.out.println("Você usou o conversor de moedas Top, grato!");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione outra opção entre 1 e 7.");
                    break;

            }
        }
    }

    private static void opcaoDeMoeda(String base, String target, float montante, ConsultaConversao consulta) {
        try {
            Conversao conversao = consulta.buscarConversao(base, target, montante);
            System.out.println(montante+" "+base+" em "+target+" é igual a: "+ conversao.conversion_result()+ " "+target);
        } catch (NumberFormatException e) {
            System.out.println("Alguna moneda no fue encontrada!");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Erro detectado");
        }
    }

}