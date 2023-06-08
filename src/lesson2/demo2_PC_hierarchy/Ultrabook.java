package lesson2.demo2_PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ultrabook extends Laptop{
    boolean sensor;
    boolean touchId;

    public Ultrabook(boolean screen, String processor, boolean keyboard, boolean battery, boolean touchpad, boolean sensor, boolean touchId) {
        super(screen, processor, keyboard, battery, touchpad);
        this.sensor = sensor;
        this.touchId = touchId;
    }
}
