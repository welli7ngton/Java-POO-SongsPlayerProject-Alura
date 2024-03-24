package br.com.alura.projetoaudio.models;

import java.util.ArrayList;

public class LikedSongs {
    private ArrayList<Musica> likedSongs = new ArrayList<>();

    public void addToLikedSongs(Musica song){
        likedSongs.add(song);
        System.out.println(song.getTitle() +" was added on your liked songs.");
    }

    public void playAllMyLikedSongs(){
        for (int i = 0; i < this.likedSongs.size(); i++) {
            System.out.println(likedSongs.get(i).getTitle() + " is playing now.") ;
        }
    }
}
