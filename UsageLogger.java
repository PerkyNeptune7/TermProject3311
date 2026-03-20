import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UsageLogger implements Observer{
    private final List<String> logs;

    public UsageLogger() {
        logs = new ArrayList<>();
    }

    @Override
    public void update(Sensor sensor) {

        LocalDateTime time = LocalDateTime.now();

        if (sensor.isEquipmentActive()) {
            String log = "Equipment started at " + time;
            logs.add(log);
            System.out.println("UsageLogger: " + log);
        } else {
            String log = "Equipment stopped at " + time;
            logs.add(log);
            System.out.println("UsageLogger: " + log);
        }
    }

    public List<String> getLogs() {
        return logs;
    }
}
