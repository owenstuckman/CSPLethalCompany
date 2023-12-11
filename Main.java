import java.util.Scanner;

//https://lethal.miraheze.org/wiki/Moons

// wiki info


public class Main{

    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);

        //For string

        System.out.println("This is a program to calculate what moon you should go to in lethal company.");
        System.out.println("The calculation is done to pick which moon will ensure you make it through the next cycle.");
        System.out.println("This selects the least risky option for where you are in the cycle.");
        System.out.println("It also ignores all weather. \n\n");

        System.out.println("Input Current Scrap:");
        int scrap= scan.nextInt();
        
        System.out.println("Input Total Scrap Needed:");
        int totalScrapNeeded = scan.nextInt();

        System.out.println("Days To Go:");
        int daysLeft = scan.nextInt();

        PickMoon(scrap, totalScrapNeeded, daysLeft);
        System.out.println();
    }

    public static String PickMoon(int scrap, int scrapNeeded, int daysLeft){
        double scrapPerDay = scrap/daysLeft;

        return "Moon";
    }

    /* 

    String[] Moons = {"41-Experimentation", "220-Assurance", "56-Vow", "21-Offense", "61-March", "85-Rend", "7-Dine", "8-Titan"};

    public Integer Difficulty(String Moon){
        
        int[] Difficulty = {1,1,1,2,2,3,3,3};
        
        int k = 0;
        int diffElem;
        while (true){
            if(Moons[k] == Moon){
                diffElem = k;   
                break;
            }
            k++;
        }
        return Difficulty[diffElem];
    }
    public Integer Cost(String Moon){
        
        int[] Cost = {0,0,0,0,0,550,600,700};
        
        int k = 0;
        int diffElem;
        while (true){
            if(Moons[k] == Moon){
                diffElem = k;   
                break;
            }
            k++;
        }
        return Cost[diffElem];
    }

    */

}
