import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class TrafficLightSimulation  extends JFrame implements ActionListener {

    JRadioButton greenbutton,redbutton,yellowbutton;
    TrafficLightPanel lightpanel;
    TrafficLightSimulation()
    {
        setTitle("Traffic");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200,400);
        setLayout(new BorderLayout());

        greenbutton=new JRadioButton("GREEN");
        redbutton=new JRadioButton("RED");
        yellowbutton=new JRadioButton("YELLOW");
        ButtonGroup b=new ButtonGroup();
        b.add( greenbutton);
        b.add( redbutton);
        b.add(yellowbutton);

        greenbutton.addActionListener(this);
        redbutton.addActionListener(this);
        yellowbutton.addActionListener(this);

        JPanel p =new JPanel();

        p.add(greenbutton);
        p.add(redbutton);
        p.add(yellowbutton);

        lightpanel= new TrafficLightPanel();
        add(p,BorderLayout.NORTH);
        add(lightpanel,BorderLayout.CENTER);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==redbutton)
        {
            lightpanel.setColors(Color.RED,Color.LIGHT_GRAY,Color.LIGHT_GRAY);
        }
       else  if(e.getSource()==yellowbutton)
        {
            lightpanel.setColors(Color.LIGHT_GRAY,Color.YELLOW,Color.LIGHT_GRAY);
        }
        else  if(e.getSource()==greenbutton)
        {
            lightpanel.setColors(Color.LIGHT_GRAY,Color.LIGHT_GRAY,Color.GREEN);
        }

    }
    public static void main(String args[])
    {
        SwingUtilities.invokeLater(TrafficLightSimulation::new);
    }


}
class TrafficLightPanel extends JPanel
{
    private Color color1,color2,color3;
    TrafficLightPanel()
    {
        setPreferredSize(new Dimension(120,350));
        setColors(Color.LIGHT_GRAY,Color.LIGHT_GRAY,Color.LIGHT_GRAY);

    }
    public void setColors(Color c1,Color c2,Color c3)
    {
        color1=c1;
        color2=c2;
        color3=c3;
        repaint();
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        int postW=30;
        int postH=getHeight();
        int postX=getWidth()/2-postW/2;
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(postX-18,0,postW+10,postH);

        int boxW=80;
        int boxH=220;
        int boxX=postX-boxW/2;
        int boxY=getHeight()/6-10;
        g.setColor(Color.BLACK);
        g.fillRect(boxX,boxY,boxW,boxH);

        int diameter=60;

        int x=postX-diameter/2;
        int y=boxY+10;
        g.setColor(color1);
        g.fillOval(x,y,diameter,diameter);

        g.setColor(color2);
        g.fillOval(x,y+diameter+10,diameter,diameter);

        g.setColor(color3);
        g.fillOval(x,y+2*(diameter+10),diameter,diameter);



    }
}
