package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class LambdaExpression {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", true, false));
        animals.add(new Animal("cat",false,true));
        animals.add(new Animal("dog", true, true));

        print(animals, animal -> animal.canHop());
        print(animals, animal -> !animal.canSwim());
        // another syntax
        print(animals, (Animal a) -> { return a.canHop(); } );

        //For the Test Interface
        String[] str = {"abc", "def", "ghi"};
        print(str, a -> a.contains("b") );
        print(str, a -> a.contains("b") );


        //The ArrayList declares a removeIf() method that takes a Predicate
        List<String> bunnies = new ArrayList<String>();
        bunnies.add("floppy");
        bunnies.add("happy");
        bunnies.add("mummy");

        System.out.println(bunnies);
        bunnies.removeIf(a-> !a.startsWith("h"));

        System.out.println(bunnies);
    }
//     Using your own interface and function
//    private static void print(List<Animal> animals, CheckTrait checkTrait){
//        for(Animal animal : animals){
//            if(checkTrait.test(animal)){
//                System.out.println(animal+ "");
//            }
//        }
//        System.out.println();
//    }

    //Using Predicate
    private static void print(List<Animal> animals, Predicate<Animal> predicate){
        for(Animal animal : animals){
            if(predicate.test(animal)){
                System.out.println(animal+ "");
            }
        }
        System.out.println();
    }

    private  static void print(String[] args, Predicate<String> predicate){
        for(String arg : args) {
            if (predicate.test(arg)) System.out.println(arg + "");
        }
        System.out.println();
    }


}

class Animal{
    private  String species;
    private boolean canSwim;
    private boolean canHop;

    public Animal(String species, boolean canSwim, boolean canHop) {
        this.species = species;
        this.canSwim = canSwim;
        this.canHop = canHop;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public boolean canHop(){
        return canHop;
    }

    public String toString(){
        return species;
    }
}
