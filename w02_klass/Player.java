public class Player{
    private String name;
    private int age;
    private Position position;
    private Team team;

    public Player(String name, int age, Position position, Team team){
        this.name = name;
        this.age = age;
        this.position = position;
        this.team = team;
    }

    // Funktsioon, mis tagastab meeskonna nime.
    public String getTeam(){
        if(team == Team.RED){
            return "Red";
        } else{
            return "Blue";
        }
    }

    // Funktsioon mängija kohta täieliku teabe saamiseks.
    public void getInfo(){
        System.out.println("Name: " + name + ", age: " + age + ", position: " + position + ", team: " + team);
    }

    // Funktsioon, mis muudab mängija meeskonda.
    public void changeTeam(Team NewTeam){
        if(team == NewTeam){
            System.out.println(name + " is already in the " + team + " team."); // Kui mängija on juba valitud meeskonnas, kuvatakse selle kohta teade.
        }else{
            team = NewTeam;
            System.out.println(name + "'s new team: " + NewTeam + ".");
        }
    }

    // Funktsioon, mis suurendab mängija vanust ühe aasta võrra.
    public void gotOlder(){
        age ++;
        System.out.println(name + " is now one year older.");
    }


}