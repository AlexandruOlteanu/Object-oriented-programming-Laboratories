package lab5.task4;

public class ThrillerAlbum extends Album{
    public void addSong(Song song1){
        boolean ok = true;
        if (!song1.name.equals("Michael Jackson") || song1.id % 2 != 0){
            ok = false;
        }
        if (ok){
            list.add(song1);
        }
        else{
            System.out.println("Song doesn't have name Michael Jackson and even Id");
        }
    }
}
