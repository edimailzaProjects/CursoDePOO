package edi.curso.poo.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import edi.curso.poo.aulas.aula02.reforco.Copo;

public class CopoJunit5Test
{
    Copo copo;

    @BeforeEach
    public void setup()
    {
        copo = new Copo();
    }

    @Test
    @DisplayName("Deve encher o copo vazio destampado")
    public void encher_copoDestampado_enchendoCopo()
    {
        Copo copo = new Copo()
        {
            @Override
            public boolean isTampa()
            {
                return false;
            }

            @Override
            public String encher(String estadoCopo)
            {
                return "Enchendo o copo Vazio.";
            }
        };

        String esperado = "Enchendo o copo Vazio.";
        String obtido = copo.encher("Vazio");

        Assertions.assertEquals(esperado, obtido);

    }

}
