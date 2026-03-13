import java.util.ArrayList;
import java.util.List;

public class Sensor implements Subject {

    private String sensorId;
    private boolean equipmentActive;
    private List<Observer> observers;

    public Sensor(String sensorId){
        this.sensorId = sensorId;
        this.observers = new ArrayList<>();
        this.equipmentActive = false;
    }

    // Detect when the equipment starts being used
    public void startEquipment(){
        equipmentActive = true;
        notifyObservers();
    }

    // Detect when equipment stops being used
    public void stopEquipment() {
        equipmentActive = false;
        notifyObservers();
    }

    public boolean isEquipmentActive() {
        return equipmentActive;
    }

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(this);
        }

    }
}
