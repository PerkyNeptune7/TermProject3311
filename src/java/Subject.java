package src.java;

public interface Subject {

    void attach(Observer observer);
    void detach (Observer observer);
    void notifyObservers();
}
