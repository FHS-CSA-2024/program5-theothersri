//import stuff here?
public class Gas{
    public static void main(String[] args){
        int rm = 286;
        int rg = 9;
        
        int km = 412;
        int kg = 40;
        
        int pm = 361;
        int pg = 18;

        int bm = 161;
        int bg = 11;
        
        
        double rmpg = (double) rm/rg;
        double kmpg = (double) km/kg;
        double pmpg = (double) pm/pg;
        double bmpg = (double) bm/bg;
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.printf("Royale averaged %.1f ", rmpg);
        System.out.println();
        System.out.printf("Koopa King averaged  %.1f ", kmpg);
        System.out.println();
        System.out.printf("Pipe Frame averaged  %.1f ", pmpg);
        System.out.println();
        System.out.printf("Badwagon averaged  %.1f ", bmpg);
        System.out.println();
        
    }
}
//Your code here

//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:
Royale averaged 31.8 
Koopa King averaged  10.3 
Pipe Frame averaged  20.1 
Badwagon averaged  14.6 


*/
