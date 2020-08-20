public class Player {
    private String pid;
    private String name;
    private int matchPlayed;
    public Player(String id, String n, int s){
        this.name=n;
        this.pid=id;
        this.matchPlayed=s;
    }
    public String getPid(){
        return pid;
    }
    public void setPid(String id){
        this.pid=id;
    }
    public int getMatchPlayed(){
        return matchPlayed;
    }
    public String getName(){
        return name;
    }

}
