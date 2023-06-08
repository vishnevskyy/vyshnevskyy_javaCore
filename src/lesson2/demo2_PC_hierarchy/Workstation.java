package lesson2.demo2_PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workstation extends Laptop{
    boolean secondary_screen;

    public Workstation(boolean screen, String processor, boolean keyboard, boolean battery, boolean touchpad, boolean secondary_screen) {
        super(screen, processor, keyboard, battery, touchpad);
        this.secondary_screen = secondary_screen;
    }
}
