package edi.curso.poo.aulas.aula06.reforco;

public class MusicaService implements MusicaInterface
{
    Musica musica = new Musica();

    @Override
    public String gerarSentimento(String cantor)
    {
        musica.setCantor(cantor);
        if(musica.getCantor().equals("Falcão") || musica.getCantor().equals("Reginaldo Rossi")) {
            musica.setEstilo("Brega");
            return musica.getEstilo()+ " do cantor "+ musica.getCantor()+" causa sentimentos de sofrência!";
        }else if(musica.getCantor().equals("Madonna") || musica.getCantor().equals("Michael Jackson")) {
            musica.setEstilo("Pop");
            return musica.getEstilo()+ " cantados por "+ musica.getCantor()+" causa sentimentos de saudade!";
        }else if(musica.getCantor().equals("Zezé de Camargo e ") || musica.getCantor().equals("Luciano")) {
            musica.setEstilo("Sertanejo");
            return musica.getEstilo()+ " cantados por "+ musica.getCantor()+" causa sentimentos de amor!";
        }else if(musica.getCantor().equals("Beatles") || musica.getCantor().equals("Scorpions")) {
            musica.setEstilo("Rock");
            return musica.getEstilo()+ " cantados pelo grupo " + musica.getCantor()+ " causa sentimentos de alegria!";
        }else if(musica.getCantor().equals("Pe. Zezinho") || musica.getCantor().equals("Aline Barros")) {
            musica.setEstilo("Gospel");
            return musica.getEstilo()+ " cantado por " + musica.getCantor()+ " causa sentimentos de paz!";
        }else 
            return "Mas quem raios é "+ cantor + "???";
    }

}
