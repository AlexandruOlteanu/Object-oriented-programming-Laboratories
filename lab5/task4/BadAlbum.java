package lab5.task4;

public class BadAlbum extends Album{

    public void addSong(Song song1){
        boolean ok = true;
        String first = song1.name.toString();
        String second = "";
        for (int i = first.length() - 1; i >= 0; --i){
            second += first.charAt(i);
        }
        if (song1.name.length() != 3 || !first.equals(second)){
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
