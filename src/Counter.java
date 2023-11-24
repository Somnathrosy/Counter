import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends JFrame {
    JTextField Display;
    JButton Start, Reset;

    Font font;
    Counter(){
        //Font
        font = new Font("Arial", Font.BOLD, 13);

        //Display
        Display = new JTextField("0");
        Display.setBounds(50,50,100,20);
        Display.setFont(font);
        add(Display);

        //start
        Start= new JButton("+");
        Start.setBounds(60,85,70,30);
        Start.setFont(font);
        add(Start);
        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(Display.getText());
                Display.setText(String.valueOf(++num));
            }
        });

        //Reset
        Reset = new JButton("Reset");
        Reset.setBounds(60,120,70,30);
        add(Reset);
        Reset.setFont(font);
        Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("0");
            }
        });

        //container
        setLayout(null);
        setTitle("Counter");
        getContentPane().setBackground(new Color(165, 166, 139));
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);


    }

    public static void main(String[] args) {
        Counter Tallycounter = new Counter();
        Tallycounter.setVisible(true);
    }

}
