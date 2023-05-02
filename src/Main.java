import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Funcoes funcao = new Funcoes();

        //Questão 1:
        System.out.println(funcao.SomaIndice());

        //Questão 2:
        System.out.println(funcao.Fibonacci());

        //Questão 3:
        //a) Acrescenta de 2 em 2:
        System.out.println(funcao.Completea());
        //b) Multiplica o resultado por 2:
        System.out.println(funcao.Completeb());
        //c) Números naturais ao quadrado:
        System.out.println(funcao.Completec());
        //d) Números naturais pares ao quadrado:
        System.out.println(funcao.Completed());
        //e) Fibonacci:
        System.out.println(funcao.Completee());
        //f) A lógica é todo e qualquer número que comece com a letra "d":
        System.out.println(funcao.Completef());

        //Questão 4:
        System.out.println(funcao.Distancia());

        //Questão 5:
        System.out.println(funcao.Inverte());
    }

}

