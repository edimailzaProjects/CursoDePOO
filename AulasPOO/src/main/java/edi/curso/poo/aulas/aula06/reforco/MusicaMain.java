package edi.curso.poo.aulas.aula06.reforco;

public class MusicaMain
{
    public static void main(String[] args)
    {
        MusicaService musicaService = new MusicaService();

        System.out.println(musicaService.gerarSentimento("Scorpions"));
        System.out.println(musicaService.gerarSentimento("Pablo Vittar"));
    }

}
