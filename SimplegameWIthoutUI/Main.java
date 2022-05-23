package SimplegameWIthoutUI;
/*
    game description

    Player 1 have :- name
                  :- weapon
                  :- health
                  if (shot by gun1) health -=30
                  if (shot by gun2) health -=50
                  if (health == 0) player die
                  healing function heals (health == 100%)

    Player 2 have :- name
                  :- weapon
                  :- health
                  :- Armour
                  if(shot by gun1 when armour on) health-=20
                  if(shot by gun2 when armour on) health-=40
                  if(shot by gun1 when armour off) health -=30
                  if(shot by gun2 when armour off) health -=50
 */

public class Main {
    public static void main(String[] args) {
        Player1 player = new Player1("Vishal","Sword",100);
        Player2 betterplayer = new Player2("Shivangi","machine gun",100,true);

        // lets perform all the operation on the player 1

        //case when the first player is hit by both the guns and then healed
        player.damageBygun1();
        player.damageBygun2();
        player.heal();

        //case when the first player is hit by both the guns several times and is not able to heal
        player.damageBygun1();
        player.damageBygun1();
        player.damageBygun2();
        player.heal();

        //case when the second player is hit by both the guns but able to heal
        betterplayer.damageBygun1();
        betterplayer.damageBygun2();
        betterplayer.heal();

        //case when the second player is hit by both the guns but is not able to heal

        betterplayer.damageBygun1();
        betterplayer.damageBygun2();
        betterplayer.damageBygun2();
        betterplayer.heal();
    }
}
