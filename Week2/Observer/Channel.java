public class Channel implements Subject {
    private String channelName;
    private ArrayList<Observer> observers;
    private String status;
    public Channel()
    {
        observers = new ArrayList<>();
    }
    public void resgisterObserver(Observer observer) {
        observers.add(observer);
    }
    public void unResgisterObserver(Observer observer){
        observer.remove(observer)
    }
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update();
        }
    }

    public String getStatus()
    {
        return status;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }
}