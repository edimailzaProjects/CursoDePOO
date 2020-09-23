package edi.curso.poo.aulas.aula09;

public class ProjetoLivroMain
{
      
    public static void main(String[] args)
    {
        Pessoa pessoa[] = new Pessoa[3];
        
        pessoa[0] = new Pessoa("Aninha", 12, 'F');
        pessoa[0].fazerAniver();
        
        Livro livro1 = new Livro("Geração de Valor 2", "Flávio Augusto", 207, true, pessoa[0]);
        livro1.folhear();
        livro1.voltarPag();
        livro1.detalhes();
        
        pessoa[1] = new Pessoa("Edi", 34, 'F');
        
        Livro livro2 = new Livro("Java Como Programar", "Deitel", 2207, false, pessoa[1]);
        livro2.avancarPag();        
        livro2.abrir();
        livro2.avancarPag();
        livro2.detalhes();
        
        
        
    }

}
