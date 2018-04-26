import javax.swing.*;
import java.applet.*;
import java.awt.*;
import javax.swing.JApplet;
import java.awt.event.*;
import java.util.Timer;

public class SpringApplet extends JApplet implements MouseListener,MouseMotionListener,ActionListener{

    private SimEngine simEngine;
    private SimTask simTask;
    private Timer timer;
    private boolean isDrag;
    private double x;
    private double y;
    private Button button = new Button("RESET");
    private TextField m = new TextField(" ",1);
    private TextField k = new TextField(" ",1);
    private TextField c = new TextField(" ",1);
    private TextField l = new TextField(" ",1);
    private TextField gr = new TextField(" ",1);

    @Override
    public void init()
    {
        this.setSize(600,500);

        simEngine = new SimEngine(10.0, 0.5, 0.1, 100,300,100,0,10);
        simTask = new SimTask(simEngine,this, 0.2);
        timer = new Timer();
        timer.scheduleAtFixedRate(simTask,6,6);

        isDrag = false;
        addMouseListener(this);
        addMouseMotionListener(this);

        add(button);
        button.addActionListener(this);

        add(m);
        add(k);
        add(c);
        add(l);
        add(gr);
    }

    @Override
    public void paint(Graphics g)
    {
        g.clearRect(100,0,600,500);
        g.drawString("OSCILLATOR", 10, 20);
        g.drawString("MASS: " , 10, 50 );
        g.drawString("K: " ,10, 80);
        g.drawString("C: ",10,110);
        g.drawString("L0: ", 10, 140);
        g.drawString("g: ",10,90);
        g.setColor(Color.pink);
        g.drawLine((int)simEngine.getSuspencionPoint().getX()+10,(int) simEngine.getSuspencionPoint().getY(),(int) simEngine.getMassLocation().getX()+10,(int) simEngine.getMassLocation().getY());
        g.setColor(Color.MAGENTA);
        g.fillOval((int)simEngine.getMassLocation().getX()-40, (int)simEngine.getMassLocation().getY()-10, 100,100);

        m.setBounds(50,20,40,20);
        k.setBounds(50,50,40,20);
        c.setBounds(50,80,40,20);
        l.setBounds(50,110,40,20);
        gr.setBounds(50,140,40,20);
        button.setBounds(10,180,50,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button)
        {
            timer.cancel();


            //simEngine = new SimEngine(Double.parseDouble(m.getText()), Double.parseDouble(k.getText()), Double.parseDouble(c.getText()), Double.parseDouble(l.getText()),300,100,0,Double.parseDouble(gr.getText()));
            simEngine = new SimEngine(10.0, 0.5, 0.1, 100,300,100,0,10);
            simTask = new SimTask(simEngine,this, 0.2);
            timer = new Timer();
            timer.scheduleAtFixedRate(simTask,6,6);
            repaint();

        }

    }




    @Override
    public void mousePressed(MouseEvent e) {

        x=e.getX();
        y=e.getY();

        if((x <= simEngine.getMassLocation().getX()-50)&&(x >= simEngine.getMassLocation().getX()+50)&&(y >= simEngine.getMassLocation().getY())&&(y >= simEngine.getMassLocation().getY()+100))
        {
            timer.cancel();
            simEngine.reset();
            setDrag(true);
        }
        e.consume();

    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if(isDrag()==true)
        {
            simTask = new SimTask(simEngine,this, 0.2);
            timer = new Timer();
            timer.scheduleAtFixedRate(simTask,6,6);
            setDrag(false);
        }
        e.consume();

    }


    @Override
    public void mouseDragged(MouseEvent e) {

        if(isDrag()==true)
        {
            Vector2D tmp = simEngine.getMassLocation();
            tmp.setY(e.getY());
            simEngine.setMassLocation(tmp);
            repaint();
        }
        e.consume();

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    public void setDrag(boolean drag) {
        isDrag = drag;
    }

    public boolean isDrag() {
        return isDrag;
    }





    /* public void paint (Graphics g) {
             g.drawString ("Hello World", 25, 50);
        }*/

       /*public void init()
       {
           Vector2D v1 = new Vector2D(5,8);
           Vector2D v2 = new Vector2D(6.8,10);

           Vector2D s = v1.sum(v2);

           Vector2D d = v1.differential(v2);

           Vector2D n1 = v1.normalization();

           Vector2D n2 = v2.normalization();

           Vector2D k = v1.multipleByConst(3);

           double v1Lenght = v1.getLenght();
           double v2Lenght = v2.getLenght();
           double sLenght = s.getLenght();
           double dLenght = d.getLenght();
           double n1Lenght = n1.getLenght();
           double n2Lenght = n2.getLenght();


           System.out.println("Vector 1 with Parameterized Constructor: ("+v1.getX()+","+v1.getY()+")" +", lenght: "+v1.getLenght());
           System.out.println("Vector 2 with Parameterized Constructor: ("+v2.getX()+","+v2.getY()+")" +", lenght: "+v2.getLenght());
           System.out.println("Sum of vectors: ("+s.getX()+","+s.getY()+")" +", lenght: "+s.getLenght());
           System.out.println("Diff of vectors: ("+d.getX()+","+d.getY()+")" +", lenght: "+d.getLenght());
           System.out.println("Vector 1 normalization: ("+n1.getX()+","+n1.getY()+")" +", lenght: "+n1.getLenght());
           System.out.println("Vector 2 normalization: ("+n2.getX()+","+n2.getY()+")" +", lenght: "+n2.getLenght());
           System.out.println("Vector 1 multiple by 3: ("+k.getX()+","+k.getY()+")" +", lenght: "+k.getLenght());
       }

       public void paint(Graphics g){

           g.drawLine(110,10,110,210);
           g.drawLine(10,110,210,110);




       }*/
}
