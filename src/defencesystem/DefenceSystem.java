package defencesystem;

public class DefenceSystem {

    public static void main(String[] args) {
        
        MainController maincontroller = new MainController();
        DeffenceObserver.registerWindow(maincontroller);
        maincontroller.setVisible(true);
        
        Submarine submarine = new Submarine();
        DeffenceObserver.registerWindow(submarine);
        submarine.setVisible(true);
        
        Helicopter helicopter = new Helicopter();
        DeffenceObserver.registerWindow(helicopter);
        helicopter.setVisible(true);
        
        Tank tank = new Tank();
        DeffenceObserver.registerWindow(tank);
        tank.setVisible(true);
    }
    
}
