package br.com.alura.projetoaudio.main;

import br.com.alura.projetoaudio.models.LikedSongs;
import br.com.alura.projetoaudio.models.Musica;
import br.com.alura.projetoaudio.models.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica msc = new Musica("Music1");
        Musica msc2 = new Musica("Music2");
        Musica msc3 = new Musica("Music3");
        Musica msc4 = new Musica("Music4");
        Musica msc5 = new Musica("Music5");
        Musica msc6 = new Musica("Music6");

        LikedSongs myLikes = new LikedSongs();
        myLikes.addToLikedSongs(msc);
        myLikes.addToLikedSongs(msc6);
        myLikes.addToLikedSongs(msc2);
        myLikes.addToLikedSongs(msc3);
        myLikes.addToLikedSongs(msc4);
        myLikes.addToLikedSongs(msc5);

        myLikes.playAllMyLikedSongs();

        msc.setBandName("Band1");

        for (int i = 0; i < 1000; i++) {
            msc.play();
        }

        for (int i = 0; i < 500; i++) {
            msc.hitLike();
        }

        Podcast pdc = new Podcast("The Podcast");
        pdc.setHost("The Host");

        for (int i = 0; i < 250; i++) {
            pdc.play();
        }

        for (int i = 0; i < 210; i++) {
            pdc.hitLike();
        }

        System.out.println(msc.getClassification());
        System.out.println(pdc.getClassification());
    }
}