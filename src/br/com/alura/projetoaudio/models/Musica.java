package br.com.alura.projetoaudio.models;

import br.com.alura.projetoaudio.classifications.Classifications;

import java.util.ArrayList;

public class Musica extends Audio implements Classifications {
    private String bandName;
    private String album;
    private String gender;
    private String singer;

    private ArrayList bandMenbers;

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public Musica(String title) {
        super(title);
    }

    @Override
    public int getClassification() {
        if (this.getLikes() >= 100){
            return 10;
        } else if (this.getLikes() <100 && this.getLikes() > 50) {
            return 5;
        } else {
            return 2;
        }
    }
}
