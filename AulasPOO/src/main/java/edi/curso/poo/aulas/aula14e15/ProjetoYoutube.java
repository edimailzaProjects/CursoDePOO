package edi.curso.poo.aulas.aula14e15;

public class ProjetoYoutube
{
    public static void main(String[] args)
    {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 12, "F", "creuzinha");

         System.out.println(v[0].toString());
         System.out.println(g[0].toString());

         Visualizacao visualizacao1 = new Visualizacao(v[0],g[1]);
        
         System.out.println(visualizacao1.toString());

        Visualizacao visualizacao[] = new Visualizacao[5];

        visualizacao[0] = new Visualizacao(v[2], g[0]); // Jubileu assiste HTML
        visualizacao[0].avaliar();
        System.out.println(visualizacao[0].toString());

        visualizacao[1] = new Visualizacao(v[1], g[0]); // Jubileu Assiste PHP
        visualizacao[1].avaliar(35.0f);
        System.out.println(visualizacao[1].toString());
    }

}
