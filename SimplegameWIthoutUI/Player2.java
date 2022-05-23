package SimplegameWIthoutUI;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }


    @Override
    public void damageBygun1() {
        if(armour){
            this.health-=20;
            if(this.health <=0) this.health=0;
            System.out.println("Armour is on "+getName()+" got hit by gun1 , health is reduced by 20,new health is "+this.health);
            if(this.health==0) System.out.println(getName()+" is dead");
        }
        if(!armour){
            this.health-=30;
            if(this.health <=0) this.health=0;
            System.out.println("Armour is off "+getName()+" got hit by gun1 , health is reduced by 30,new health is "+this.health);
            if(this.health==0) System.out.println(getName()+" is dead");
        }
    }

    @Override
    public void damageBygun2() {
        if(armour){
            this.health-=40;
            if(this.health <=0) this.health=0;
            System.out.println("Armour is on "+getName()+" got hit by gun2 , health is reduced by 40,new health is "+this.health);
            if(this.health==0) System.out.println(getName()+" is dead");
        }
        if(!armour){
            this.health-=50;
            if(this.health <=0) this.health=0;
            System.out.println("Armour is off "+getName()+" got hit by gun2 , health is reduced by 50,new health is "+this.health);
            if(this.health==0) System.out.println(getName()+" is dead");
        }
    }

    @Override
    public void heal() {
        if(this.health<=0) System.out.println("Can't heal  coz "+getName()+" is dead");
        else{
            this.health=100;
            System.out.println("healed health is now "+getName()+" health is "+this.health);
        }

    }
}
