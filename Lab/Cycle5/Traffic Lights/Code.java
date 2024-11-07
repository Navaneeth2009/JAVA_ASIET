import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLights implements ActionListener
{
    JFrame jf;
    JRadioButtonMenuItem r1, r2, r3;
    JLabel l1;

    TrafficLights()
    {
        jf = new JFrame();

        jf.setSize(350,200);
        jf.setTitle("Traffic Lights");

        FlowLayout fl = new FlowLayout(FlowLayout.CENTER, 20, 20);
        jf.setLayout(fl);

        l1 = new JLabel("", SwingConstants.CENTER);

        r1 = new JRadioButtonMenuItem("Red");
        r2 = new JRadioButtonMenuItem("Yellow");
        r3 = new JRadioButtonMenuItem("Green");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        jf.add(l1);
        jf.add(r1);
        jf.add(r2);
        jf.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae)
    {
        Color c1 = Color.black;
        String str = "";

        if (r1.isSelected())
        {
            str = "Stop";
            c1 = Color.red;
        }
        if (r2.isSelected())
        {
            str = "Ready";
            c1 = Color.yellow;
        }
        if (r3.isSelected())
        {
            str = "Go";
            c1 = Color.green;
        }

        l1.setText(str);
        l1.setForeground(c1);
    }

    public static void main(String as[])
    {
        new TrafficLights();
    }
}
