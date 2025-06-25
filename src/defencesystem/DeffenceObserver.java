package defencesystem;

public class DeffenceObserver {
    
    public static Helicopter helicopter;
    public static Submarine submarine;
    public static Tank tank;
    public static MainController maincontroller;
    private static boolean positionHeli = false;
    private static boolean positionTank = false;
    private static boolean positionSubmarine = false;
    private static String mainControllerMsg;
    
    public static void registerWindow(MainController mc){
        maincontroller = mc;
    }
    
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
    //Function for set mainController Message
    public static void setMainControllerMsg(String msg){
        mainControllerMsg = msg;
    }
    //Function for get mainController Message
    public static String getMainControllerMsg(){
        return mainControllerMsg;
    }
}
