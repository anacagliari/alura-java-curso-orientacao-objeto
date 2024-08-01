package br.com.consolidandoconhecimentos.main;

import br.com.consolidandoconhecimentos.modelo.MinhasPreferidas;
import br.com.consolidandoconhecimentos.modelo.Musica;
import br.com.consolidandoconhecimentos.modelo.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Love on top");
        minhaMusica.setCantor("Beyonce");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Inteligência Ltda.");
        meuPodcast.setApresentador("Vilela");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
