public class MainSong {
    public static void main(String[] args) {
        Song song=new Song("7 Rings","Ariana",185);
        System.out.println(song);
    }
    public static String longestPlaylist(Playlist[] playlists){
        int max=0;
        String name="";
        for (int i = 0; i <playlists.length ; i++) {
            if (playlists[i].getSumLengthSongs()>max) {
                max = playlists[i].getSumLengthSongs();
                name = playlists[i].getName();
            }
        }
        return name;
    }
}
