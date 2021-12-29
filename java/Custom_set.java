/**
 * play
 */
import java.util.*;

class Dog{
    String name;
    Boolean isBarking;


    Dog(String name){
        this.name = name;
    }

    Dog(String name, Boolean isBarking){
        this.name = name;
        this.isBarking = isBarking;
    }

    public String getName(){
        return this.name;
    }
    public Boolean getIsBarking(){
        return this.isBarking;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setIsBarking(Boolean isBarking){
        this.isBarking = isBarking;
    }

    @Override
    public boolean equals(Object obj){
	    return this.hashCode() == obj.hashCode();
    }
    @Override
    public int hashCode(){
	    // return HashHelper.generate(13, this.isBarking);
        return Objects.hash(this.isBarking, this.name);
    }

}

class HashHelper{
	public static int generate (int prime, Object ...objects){
        int results = 0;
        for(Object obj:objects){
            results = (results * prime + obj.hashCode()) % 97;
        }
        return results;
    }
}

public class Custom_set {

    public static void main(String[] args) {
        Dog aDog = new Dog("Max", false);
        Dog aDog1 = new Dog("Bool", false);
        Dog aDog2 = new Dog("Min", false);
        Dog aDog3 = new Dog("Dog", true);
        Set<Dog> set = new HashSet<>();
        
        set.add(aDog);
        set.add(aDog1);
        set.add(aDog2);
        set.add(aDog3);

        System.out.println(set.size());
    }
}
