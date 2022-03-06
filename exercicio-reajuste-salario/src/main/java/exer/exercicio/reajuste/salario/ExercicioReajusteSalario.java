package exer.exercicio.reajuste.salario;

import java.util.Scanner;

/**
 *
 * @author thaysa
 */
public class ExercicioReajusteSalario {

    static final int PERCENTO_CINCO = 5;
    static final int PERCENTO_DEZ = 10;
    static final int PERCENTO_QUINZE = 15;
    static final int PERCENTO_VINTE = 20;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float salario;

        System.out.println("Informe seu salário R$:");
        salario = entrada.nextFloat();

        reajusteSalario(salario);

    }

    private static void reajusteSalario(float salario) {

        float reajuste;

        if (salario <= 280) {
            reajuste = ((salario * PERCENTO_VINTE) / 100);
            System.out.println("Seu salário anterior era de R$: " + salario);
            System.out.println("Percentual de aumento: " + PERCENTO_VINTE + "%");
            System.out.println("O valor de aumento do seu salário em reais foi de R$: " + reajuste);
            System.out.println("Seu novo salário é de R$: " + (salario + reajuste));

        } else if (salario > 280 && salario < 700) {
            reajuste = ((salario * PERCENTO_QUINZE) / 100);
            System.out.println("Seu salário anterior era de R$: " + salario);
            System.out.println("Percentual de aumento: " + PERCENTO_QUINZE + "%");
            System.out.println("O valor de aumento do seu salário em reais foi de R$: " + reajuste);
            System.out.println("Seu novo salário é de R$: " + (salario + reajuste));

        } else if (salario >= 700 && salario < 1500) {
            reajuste = ((salario * PERCENTO_DEZ) / 100);
            System.out.println("Seu salário anterior era de R$: " + salario);
            System.out.println("Percentual de aumento: " + PERCENTO_DEZ + "%");
            System.out.println("O valor de aumento do seu salário em reais foi de R$: " + reajuste);
            System.out.println("Seu novo salário é de R$: " + (salario + reajuste));

        } else if (salario >= 1500) {
            reajuste = ((salario * PERCENTO_CINCO) / 100);
            System.out.println("Seu salário anterior era de R$: " + salario);
            System.out.println("Percentual de aumento: " + PERCENTO_CINCO + "%");
            System.out.println("O valor de aumento do seu salário em reais foi de R$: " + reajuste);
            System.out.println("Seu novo salário é de R$: " + (salario + reajuste));

        }
    }

}

