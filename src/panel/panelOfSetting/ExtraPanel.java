package panel.panelOfSetting;

import listener.ButtonListener;
import net.miginfocom.swing.MigLayout;
import panel.SettingPanel;

import javax.swing.*;
import java.awt.*;

public class ExtraPanel extends JPanel {
    public static ExtraPanel instance = new ExtraPanel();

    public static int fontSize = 15;
    public JButton bDayOfWeek = new JButton("Day of a Week");
    public JButton bMonths = new JButton("Months");
    public JButton bDirections = new JButton("Directions");
    public JButton bTime = new JButton("Time");

    public ExtraPanel() {
//        bDayOfWeek.setPreferredSize(new Dimension(40, 40));
        MigLayout migLayoutNumber = new MigLayout("", "[105!,grow]15[67!,grow]15[80!]15[60!," +
                "grow]", "[]");
        this.setLayout(migLayoutNumber);

        bDayOfWeek.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        bMonths.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        bDirections.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        bTime.setFont(new Font("Times New Roman", Font.PLAIN, 18));

        this.add(bDayOfWeek, "growx");
        this.add(bMonths, "growx");
        this.add(bDirections, "growx");
        this.add(bTime, "growx");

        bDayOfWeek.addActionListener(ButtonListener.instance);
        bMonths.addActionListener(ButtonListener.instance);
        bDirections.addActionListener(ButtonListener.instance);
        bTime.addActionListener(ButtonListener.instance);
    }
}

