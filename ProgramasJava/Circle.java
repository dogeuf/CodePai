import java.awt.*;
import java.sql.SQLOutput;
import javax.swing.JApplet;
import javax.swing.JFrame;


public class Circle extends JApplet{

    public void paint (Graphics g){

        super.paint(g);

        g.setColor(Color.BLACK);
        g.fillOval(500, 500, 50, 50);
        g.setFont(new Font("Arial",Font.ITALIC,20));
//        for (int i=0; i<=350; i+=1){
//            double num =  Math.sqrt(-Math.pow(i-350,2)+122500);
//            double ParteDecimal = num%1;
//            double ParteEntera = num - ParteDecimal;
//            int numPE = (int)ParteEntera;
//            g.drawString(".", 350 +i,450+numPE);
//            g.drawString(".", 350 +i,450-numPE);
//            g.drawString(".", 1050 -i,450+numPE);
//            g.drawString(".", 1050 -i,450-numPE);

            g.drawString(".", 54,50);
            g.drawString(".", 56,48);
            g.drawString(".", 58,48);
            g.drawString(".", 60,46);

            removeAll();
            repaint();
            g.setColor(Color.BLACK);
            g.fillOval(300, 500, 50, 50);
            g.setColor(Color.red);
            g.fillRect(0,0, 1000, 1000);

//            System.out.println(num);
//            System.out.println(ParteEntera);
//            }


        }
    public static void main(String[] args){
        JFrame frame = new JFrame ("Creando el cicle");
        Circle circleApplet = new Circle();
        circleApplet.init();
        frame.getContentPane().add(circleApplet);
        frame.setSize(720,640);
        frame.setVisible(true);

    }
}
