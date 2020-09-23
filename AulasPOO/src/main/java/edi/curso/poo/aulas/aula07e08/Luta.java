package edi.curso.poo.aulas.aula07e08;

import java.util.Random;

public class Luta implements LutaInterface
{
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Lutador getDesafiado()
    {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado)
    {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante()
    {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante)
    {
        this.desafiante = desafiante;
    }

    public int getRounds()
    {
        return rounds;
    }

    public void setRounds(int rounds)
    {
        this.rounds = rounds;
    }

    public boolean isAprovada()
    {
        return aprovada;
    }

    public void setAprovada(boolean aprovada)
    {
        this.aprovada = aprovada;
    }

    @Override
    public void marcarLuta(Lutador l1, Lutador l2)
    {
        if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2))
        {
            this.setAprovada(true);
            this.setDesafiante(l1);
            this.setDesafiado(l2);

        }
        else
        {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    @Override
    public void lutar(Lutador l1, Lutador l2)
    {
        if (this.isAprovada())
        {
            System.out.println("=======================");
            System.out.println("### Desafiado ###");
            l1.apresentar();
            System.out.println("=======================");
            System.out.println("### Desafiante ###");
            l2.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("====RESULTADO DA LUTA=====");
            switch (vencedor)
            {
            case 0:
                System.out.println("Luta empatada!");
                this.desafiado.empatarLuta();
                this.desafiante.empatarLuta();
                // l1.empatarLuta();
                // l2.empatarLuta();
                break;
            case 1:
                System.out.println("Desafiado ganhou!");
                this.desafiante.perderLuta();
                this.desafiado.ganharLuta();
                // l1.perderLuta();
                // l2.ganharLuta();
                break;
            case 2:
                System.out.println("Desafiante ganhou!");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
                // l1.ganharLuta();
                // l2.perderLuta();
                break;
            }
            System.out.println("=======================");
        }
        else
            System.out.println("A luta não pode acontecer");

    }

}
