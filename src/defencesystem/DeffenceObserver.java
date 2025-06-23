package defencesystem;

public class DeffenceObserver {
    
    public static Helicopter helicopter;
    public static Submarine submarine;
    public static Tank tank;
    private static boolean positionHeli = false;
    private static boolean positionTank = false;
    private static boolean positionSubmarine = false;
    
    public static void registerWindow(Helicopter hw){
        helicopter = hw;
    }
    
    public static void registerWindow(Submarine sw){
        submarine = sw;
    }
    
    public static void registerWindow(Tank tw){
        tank = tw;
    }
    
    public static void setPositionHeli(boolean response){
        positionHeli = response;
    }
    
    public static boolean getPositionHeli(){
        return positionHeli;
    }
    
    public static void setPositionTank(boolean response){
        positionTank = response;
    }
    
    public static boolean getPositiontank(){
        return positionTank;
    }
    
    public static void setPositionSubmarine(boolean response){
        positionSubmarine = response;
    } 
    public static boolean getPositionSubmarine(){
        return positionSubmarine;
    }
}
