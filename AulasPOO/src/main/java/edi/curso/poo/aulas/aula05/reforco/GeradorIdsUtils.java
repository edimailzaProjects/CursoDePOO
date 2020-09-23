package edi.curso.poo.aulas.aula05.reforco;

public class GeradorIdsUtils
{
    
    private static long idContador = 100;

    public static synchronized Long gerarId()
    {
        return idContador++;
    } 

}