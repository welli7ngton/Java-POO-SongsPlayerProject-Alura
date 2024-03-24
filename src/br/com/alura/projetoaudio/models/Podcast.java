package br.com.alura.projetoaudio.models;

import br.com.alura.projetoaudio.classifications.Classifications;

public class Podcast extends Audio implements Classifications {

    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Podcast(String title){
        super(title);
    }

    @Override
    public int getClassification() {
        if (this.getListenedTotal() >= 100){
            return 10;
        } else if (this.getListenedTotal() <= 75 && this.getListenedTotal()>50) {
            return 7;
        } else if (this.getListenedTotal() <=50 && this.getListenedTotal() > 25) {
            return 5;
        } else {
            return 2;
        }
    }
}
