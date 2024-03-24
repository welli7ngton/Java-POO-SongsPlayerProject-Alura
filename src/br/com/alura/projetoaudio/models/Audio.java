package br.com.alura.projetoaudio.models;

public class Audio {
    private String title;
    private int durationSeconds;
    private int listenedTotal;
    private int likes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getListenedTotal() {
        return listenedTotal;
    }

    public int getLikes() {
        return likes;
    }

    public void hitLike(){
        this.likes++;
    }

    public void play(){
        this.listenedTotal++;
    }

    public Audio(String title) {
        this.title = title;
    }
}
