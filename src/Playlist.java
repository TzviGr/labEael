public class Playlist {
    private String name;
    private Song[] songs;

    public boolean exist(String name,String performerName){
        boolean exist=false;
        for (int i = 0; i <this.songs.length ; i++) {
            if (this.songs[i].getName()==name&&songs[i].getPerformerNameName()==performerName){
                exist=true;
            }
        }
        return exist;
    }

    public String getName() {
        return this.name;
    }

    public int getSumLengthSongs(){
        int sum=0;
        for(int i = 0; i <this.songs.length ; i++) {
            sum+=songs[i].getLength();
        }
        return sum;
    }
}
