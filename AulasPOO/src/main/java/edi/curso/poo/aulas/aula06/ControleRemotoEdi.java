package edi.curso.poo.aulas.aula06;

public class ControleRemotoEdi
{
    private boolean ligado;
    private boolean tocando;
    private int volume;
    
    public ControleRemotoEdi()
    {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }
    
    public boolean isLigado()
    {
        return ligado;
    }
    public void setLigado(boolean ligado)
    {
        this.ligado = ligado;
    }
    public boolean isTocando()
    {
        return tocando;
    }
    public void setTocando(boolean tocando)
    {
        this.tocando = tocando;
    }
    public int getVolume()
    {
        return volume;
    }
    public void setVolume(int volume)
    {
        this.volume = volume;
    }
    
    

}
