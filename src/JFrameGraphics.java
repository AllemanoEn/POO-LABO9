import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JFrameGraphics extends JPanel{
    static int x = 0;
    static int y = 0;

    public JFrameGraphics(){
        x += 20;
        y += 20;
    }

    public void paint(Graphics g){
        g.drawOval(x, y, 100, 100);
    }

    public static void main(String[] args){
        JFrame frame= new JFrame("JavaTutorial.net");

        JPanel p1 = new JPanel();
        p1.setBounds(30,30,200,200);

        p1.add(new JFrameGraphics());


        JButton b= new JButton("ron");
        b.setBounds(0,0,80, 40);

        p1.add(b);

        frame.add(p1);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.getContentPane().add(new JFrameGraphics());
            }
        });
    }
}