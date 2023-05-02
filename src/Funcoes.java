import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes {
    public Funcoes() {
    }

    public int SomaIndice() {
        int INDICE = 13, SOMA = 0, K = 0;

        do {
            K = K + 1;
            SOMA = SOMA + K;
        } while (K < INDICE);

        return SOMA;
    }

    public String Fibonacci() {
        Scanner scanner = new Scanner(System.in);
        int numero, a = 0, b = 1, c = 0;
        boolean pertence = false;

        System.out.print("Digite o seu número: ");
        numero = scanner.nextInt();

        if (numero == 0 || numero == 1) {
            pertence = true;
        } else {
            while (c < numero) {
                c = a + b;
                a = b;
                b = c;
                if (c == numero) {
                    pertence = true;
                    break;
                }
            }
        }

        if (pertence) {
            return "Seu número pertence a sequência de Fibonacci";
        } else {
            return "Seu número não pertence a sequência de Fibonacci";
        }
    }

    public ArrayList<Integer> Completea() {
        int a = 1;
        ArrayList<Integer> numerosa = new ArrayList<Integer>();
        while (a < 10) {
            if (a % 2 != 0) {
                numerosa.add(a);
            }
            a = a + 1;
        }
        return numerosa;
    }

    public ArrayList<Integer> Completeb() {
        int b = 1;
        ArrayList<Integer> numerosb = new ArrayList<Integer>();
        while (b < 129) {
            b = b * 2;
            numerosb.add(b);
        }
        return numerosb;
    }

    public ArrayList<Integer> Completec() {
        int c = 0, x = 0;
        ArrayList<Integer> numerosc = new ArrayList<Integer>();
        while (x < 40) {
            x = c * c;
            numerosc.add(c * c);
            c++;
        }
        return numerosc;
    }

    public ArrayList<Integer> Completed() {
        int d = 2;
        ArrayList<Integer> numerosd = new ArrayList<Integer>();
        while (d < 11) {
            if (d % 2 == 0) {
                numerosd.add(d * d);

            }
            d++;
        }
        return numerosd;
    }

    public ArrayList<Integer> Completee() {
        int a = 1;
        int b = 1;
        ArrayList<Integer> numerose = new ArrayList<Integer>();
        numerose.add(a);
        numerose.add(b);
        while (numerose.size() < 9) {
            int x = a + b;
            numerose.add(x);
            a = b;
            b = x;
        }
        return numerose;
    }

    public String Completef() {

        String numerosf = "Todos os números que tenham a letra inicial sendo: 'D'";
        return numerosf;
    }

    public String Distancia() {
        // Velocidade do carro em km/h:
        int velCarro = 110;

        // Velocidade do caminhão em km/h:
        int velCaminhao = 80;

        // Tempo que o caminhão leva para passar em cada pedágio em horas (10 minutos):
        double tempoPedagio = 0.17;

        // Distância entre as duas cidades em km:
        int distancia = 100;

        // Calcula o tempo em que os veículos se encontram:
        double tempo = distancia / (velCarro + velCaminhao);

        // Calcula a distância percorrida pelo carro até o ponto de encontro
        double distCarro = velCarro * tempo;

        // Calcula a distância percorrida pelo caminhão até o ponto de encontro:
        double distCaminhao = velCaminhao * (tempo + tempoPedagio) + velCaminhao * (tempo + 2 * tempoPedagio);

        // Calcula a posição do ponto de encontro em relação à cidade de Ribeirão Preto
        double posPontoEncontro = distancia - distCaminhao;

        if (distCarro < distCaminhao) {
            String carro = "O ponto de encontro está a " + posPontoEncontro + " km de Ribeirão Preto. E, o carro está mais perto do destino!";
            return carro;
        } else {
            String caminhao = "O ponto de encontro está a " + posPontoEncontro + " km de Ribeirão Preto. E, o caminhão está mais perto do destino!";
            return caminhao;
        }
    }

    public String Inverte() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra: ");
        String palavra = scanner.next();
        String palavrainvertida = " ";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavrainvertida += palavra.charAt(i);
        }

        return palavrainvertida;
    }
}




