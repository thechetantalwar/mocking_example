import java.util.List;

public class Team {
    private TeamService teamService;
    private List<Player> players;

    public TeamService getTeamService(){
        return teamService;
    }
    public void setTeamService(TeamService s){
        teamService=s;
    }
    public List<Player> getPlayers()
    {
        return players;
    }
    public void setPlayers(List<Player> p){
        this.players=p;
    }
    public int getTotal(){
        int total = 0;
        for (Player p : players)
        {
            total += teamService.getScore(p);
        }
        return  total;
    }
}
