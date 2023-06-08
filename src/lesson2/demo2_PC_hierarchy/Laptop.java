package lesson2.demo2_PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Laptop extends Pc{
    boolean battery;
    boolean touchpad;

    public Laptop(boolean screen, String processor, boolean keyboard, boolean battery, boolean touchpad) {
        super(screen, processor, keyboard);
        this.battery = battery;
        this.touchpad = touchpad;
    }

}
