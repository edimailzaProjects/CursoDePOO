package edi.curso.poo.aulas.aula03;

import edi.curso.poo.aulas.aula03.Caneta03;

public class Aula03
{
    public static void main(String[] args)
    {
        // Visibilidade de atributos

        Caneta03 c1 = new Caneta03();
        c1.modelo = "Bic Cristal";
        c1.cor = "azul";
        // c1.ponta = (float) 0.5; é privado!

        /*
         * Métodos protegidos só podem ser usados se a classe em questão estiver usando a classe mãe
         */

        c1.rabiscar();
        c1.tampada = false;
        c1.status();

        /*
         * Alusão a métodos e atributos privados:
         * Ao pagar por algo em um mercado, o atendente pode mexer mas você não o atendente pode mexer e vai entregar. O
         * atendente pode mexer no caixa que é privado.
         */

    }

}
