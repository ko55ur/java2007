package course1.homework8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeWorkApp8 extends JFrame {
    private int value;
    private final JLabel infoLabel;


    public HomeWorkApp8(int x, int y) {
        setBounds(x, y, 300, 120);
        setTitle("HomeWorkApp");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Font font = new Font("Arial", Font.BOLD, 32);


        JLabel label = new JLabel(String.valueOf(value));
        label.setFont(font);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JFrame frame = new JFrame("HomeWorkApp");
        frame.setFont(font);
        frame.setResizable(false);
        JPanel panelLeft = new JPanel();
        panelLeft.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.CENTER, label);
        JPanel panelRight = new JPanel();
        panelRight.setBackground(Color.darkGray);
        frame.getContentPane().add(BorderLayout.EAST, panelRight);
        frame.getContentPane().add(BorderLayout.WEST, panelLeft);
        frame.setBounds(x, y, 450, 110);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        this.infoLabel = new JLabel();
        infoLabel.setBackground(Color.RED);
        infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(infoLabel, BorderLayout.NORTH);


        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);

        JButton decTenButton = new JButton("<<");
        decTenButton.setFont(font);

        panelLeft.add(decTenButton);
        panelLeft.add(decrementButton);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);

        JButton incTenButton = new JButton(">>");
        incTenButton.setFont(font);

        panelRight.add(incrementButton);
        panelRight.add(incTenButton);

        decTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value -= 10;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                label.setText(String.valueOf(value));
                validateRange();
            }
        });

        incTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                value += 10;
                label.setText(String.valueOf(value));
                validateRange();

            }
        });

        frame.setVisible(true);
    }

    private void validateRange() {
        if (Math.abs(value) > 10) {
            infoLabel.setText("Value out of range");
        } else {
            infoLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new HomeWorkApp8(450, 110);
    }
}

