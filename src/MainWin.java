import com.sun.tools.javac.Main;
import jdk.management.jfr.SettingDescriptorInfo;

import javax.swing.*;

public class MainWin extends JFrame {

    public MainWin() {
        setTitle("Снэйки");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(340,365);
        setLocation(420,420);
        add(new GameField());
        setVisible(true);

    }

    public static void main(String[] args) {
        MainWin mw = new MainWin();
    }
}
