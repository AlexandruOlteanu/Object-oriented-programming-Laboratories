package lab5.task4;

import java.util.ArrayList;

public class DangerousAlbum extends Album{

    public void addSong(Song song1){
        boolean ok = true;
        for (int i = 2; i * i <= song1.id; ++i){
            if (song1.id % i == 0){
                ok = false;
                break;
            }
        }
        if (ok){
            list.add(song1);
        }
        else{
            System.out.println("Song doesn't have a prime Id");
        }
    }
}
