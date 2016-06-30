/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    //TODO: Give the Monster health and damage properties, and create a constructor
    private int mhealth;
    private int mDamage;
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 
    public Monster(int health, int damage){
        mhealth = health;
        mDamage = damage;
    }

    public Monster(){}


    public abstract String aboutMe();{
        }

    public void setHealth(int health){
        mhealth = health;
    }

    public int getHealth(){
        return mhealth;
    }
    public void setDamage(int damage){
        mDamage = damage;
    }

    public int getDamage(){
        return mDamage;
    }
}
