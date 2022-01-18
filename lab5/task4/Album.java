package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> list = new ArrayList<Song>();

    abstract void addSong(Song song1);

    public void removeSong(){

    }
}