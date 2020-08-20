import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TestMock {
    Team team;
    TeamService teamService;
    public static void main(String[] args){
        TestMock t =new TestMock();
        t.setTeam();
        System.out.println("Test Result is "+t.test());
    }
    public  void setTeam(){
        team = new Team();
        teamService= mock(TeamService.class);
        team.setTeamService(teamService);
    }
    public boolean test(){
        List<Player> p =new ArrayList<Player>();
        Player p1 = new Player("1","Sachin",43);
        Player p2 =new Player("2","Rahul",53);
        p.add(p1);
        p.add(p2);

        team.setPlayers(p);
        when(teamService.getScore(p1)).thenReturn(8);
        when(teamService.getScore(p2)).thenReturn(70);
        int total = team.getTotal();

        if (total == 78){
            return  true;
        }
        else
        {
            return false;
        }
    }

}
