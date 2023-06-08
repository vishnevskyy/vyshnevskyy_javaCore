package lesson2.demo2_PC_hierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.SQLOutput;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pc {
    boolean screen;
    String processor;
    boolean keyboard;
}
