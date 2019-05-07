public interface Subject {
    public void resgisterObserver(Observer observer);
    public void unResgisterObserver(Observer observer);
    public void notifyObservers();

}