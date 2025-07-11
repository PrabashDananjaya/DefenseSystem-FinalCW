package defencesystem;

import java.util.ArrayList;

interface DeffenceObservableInterface {
        
        public void updateButtons();
        public void areaClear(boolean clear);
        public void setPosition(int position);
        public void getMsgMain(String msg);
}

class DeffenceObservable implements DeffenceObservableInterface{
    public static MainController mainController;
    public static Helicopter helicopter;
    public static Submarine submarine;
    public static Tank tank ; 
    
    private int position;
    private static String privateObserver;
    private static String personalMsg; //take individual msg from any deffences
    
    private final ArrayList<DeffenceObserver> observerList = new ArrayList<>(); //Store deffenceObserver Refferences
        
    public void addObserver(DeffenceObserver observer){ //method for register a deffence
        observerList.add(observer);
    }
    
    public static void setMc(MainController mc){
        mainController = mc;
    }
    public static void setHeli(Helicopter heli){
        helicopter = heli;
    }
    public static void setSub(Submarine sub){
        submarine = sub;
    }
    
    public static void setTank(Tank tan){
        tank = tan;
    }
    
    public static void setPersonalMsg(String Msg){
        personalMsg = Msg;
    }
    
    public static String getObserverMsg(){
        return personalMsg;
    }
    
    public static void setPrivateObserver(String observer){
        privateObserver = observer;    
    }
    
    public static  String getPrivateObserver(){
        return privateObserver;
    }
      
    @Override
    public void updateButtons() {
        
    }

    @Override
    public void areaClear(boolean clear) {
        for(DeffenceObserver observer:observerList){
            observer.areaClearLbl(clear);
        }
        
    }

    @Override
    public void setPosition(int position) {
        if(this.position != position){
            this.position = position;
            notifyDefence();
        }
        
    }
    
    public void notifyDefence(){
        for(DeffenceObserver observer: observerList){
            observer.update(position);
            updateButtons();
        }
    }

    @Override
    public void getMsgMain(String msg) {
        for(DeffenceObserver observer: observerList){
            observer.getMsgMain(msg);
        }
    }  
}
    
    
public class Deffence{
    
    public static void main(String args[]){
        DeffenceObservable deffenceObservable = new DeffenceObservable();
        
        deffenceObservable.addObserver(new Helicopter());
        deffenceObservable.addObserver(new Submarine());
        deffenceObservable.addObserver(new Tank());
        new MainController(deffenceObservable).setVisible(true);
    }
    
}
