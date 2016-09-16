
package animalhouse;

public class AnimalHouse {
    
    public static void main(String[] args) {
       
        Snake jimmy = new Snake();
        
            System.out.print("Snake: ");
            jimmy.hiss();
            System.out.print("Snake: ");
            jimmy.backflip();
        
        Pig bob = new Pig();
        
            System.out.print("Pig: ");
            bob.oink();
            System.out.print("Pig: ");
            bob.backflip();
            
        Donkey trish = new Donkey();
        
            System.out.print("Donkey: ");
            trish.noise();
            System.out.print("Donkey: ");
            trish.backflip();
        
        
        
    }
    
}
