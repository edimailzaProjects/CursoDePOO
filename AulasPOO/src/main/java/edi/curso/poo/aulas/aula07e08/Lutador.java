package edi.curso.poo.aulas.aula07e08;

public class Lutador implements LutadorInterface
{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em)
    {
        super();
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getNacionalidade()
    {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade)
    {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public float getAltura()
    {
        return altura;
    }

    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public float getPeso()
    {
        return peso;
    }

    public void setPeso(float peso)
    {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria()
    {
        return categoria;
    }

    private void setCategoria()
    {
        if (this.getPeso() < 52.2 || this.getPeso() > 102.2)
        {
            this.categoria = "Peso Inválido";
        }
        else if (this.getPeso() <= 70.3)
        {
            this.categoria = "Leve";
        }
        else if (this.getPeso() <= 83.9)
        {
            this.categoria = "Médio";
        }
        else
        {
            this.categoria = "Pesado";
        }

    }

    public int getVitorias()
    {
        return vitorias;
    }

    public void setVitorias(int vitorias)
    {
        this.vitorias = vitorias;
    }

    public int getDerrotas()
    {
        return derrotas;
    }

    public void setDerrotas(int derrotas)
    {
        this.derrotas = derrotas;
    }

    public int getEmpates()
    {
        return empates;
    }

    public void setEmpates(int empates)
    {
        this.empates = empates;
    }

    @Override
    public void apresentar()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println("                       CHEGOU A HORA");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos e " + this.getAltura() + " metros.");
        System.out.println(this.getPeso() + " kgs.");
        System.out.println("Ganhou:" + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    @Override
    public void status()
    {
        System.out.println("--------------------------------------------------------");
        System.out.println(this.getNome());
        System.out.println("É um peso: " + this.getCategoria());
        System.out.println("Possui " + this.getVitorias() + " vitorias.");
        System.out.println("Possui " + this.getDerrotas() + " derrotas.");
        System.out.println("Possui " + this.getEmpates() + " empates.");

    }

    @Override
    public void ganharLuta()
    {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta()
    {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta()
    {
        this.setEmpates(this.getEmpates() + 1);
    }

}
