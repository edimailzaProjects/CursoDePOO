package edi.curso.poo.aulas.aula09;

public class Livro implements PublicacaoInterface
{
    private String titulo;
    private String Autor;
    private int totPaginas;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, boolean aberto, Pessoa leitor)
    {
        super();
        this.titulo = titulo;
        Autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = aberto;
        this.leitor = leitor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public String getAutor()
    {
        return Autor;
    }

    public void setAutor(String autor)
    {
        Autor = autor;
    }

    public int getTotPaginas()
    {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas)
    {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto()
    {
        return aberto;
    }

    public void setAberto(boolean aberto)
    {
        this.aberto = aberto;
    }

    public Pessoa getLeitor()
    {
        return leitor;
    }

    public void setLeitor(Pessoa leitor)
    {

        this.leitor = leitor;
    }

    public String statusAberto()
    {

        if (this.isAberto() == true)
        {
            return "Sim";
        }
        else
            return "Não";
    }

    public void detalhes()
    {
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("DETALHAMENTO");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("Livro " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Total de páginas: " + this.getTotPaginas());
        System.out.println("Está aberto? " + this.statusAberto());
        System.out.println("Quem está lendo? " + this.getLeitor().informarFaixaEtaria() + "de nome "
                + this.getLeitor().getNome() + " de idade " + this.getLeitor().getIdade() + ".");
        System.out.println("----------------------------------------------------------------------------------");
    }

    @Override
    public boolean abrir()
    {
        if (this.isAberto() == true)
        {
            System.out.println("O livro já está aberto.");
            this.setAberto(true);
            return true;
        }
        else if (this.isAberto() == false)
        {
            System.out.println("Abrindo o livro...");
            System.out.println("Livro aberto.");
            this.setAberto(true);
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean fechar()
    {
        if (this.isAberto())
        {
            System.out.println("Fechando o livro...");
            System.out.println("Livro fechado.");
            this.setAberto(false);
            return true;
        }
        else
            System.out.println("O livro já está fechado.");
        this.setAberto(false);
        return false;
    }

    @Override
    public void folhear()
    {
        if (this.isAberto())
        {
            System.out.println(this.getLeitor().getNome() + " está folheando o livro: " + this.getTitulo());
        }
        else
            System.out.println("Não é possível folhear um livro fechado");

    }

    @Override
    public boolean avancarPag()
    {
        if (this.isAberto() == true)
        {
            System.out.println(this.getLeitor().getNome() + " avançou uma página do livro: " + this.getTitulo());
            return true;
        }
        else
            System.out.println("Não é possível avançar a página um livro fechado");
        return false;
    }

    @Override
    public boolean voltarPag()
    {
        if (this.avancarPag() == true)
        {
            System.out.println(this.getLeitor().getNome() + " voltou uma página do livro: " + this.getTitulo());
            return true;
        }
        else
            System.out.println("Não é possível voltar a página.");
        return false;
    }

}
