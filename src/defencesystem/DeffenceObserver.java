package defencesystem;

interface DeffenceObserver{
    
    public void areaClearLbl(boolean clearStatus);
    public void update(int position);
    public void updateButtons();
    public void getMsgMain(String msg);
    public void privateMsg(String msg);
    
}