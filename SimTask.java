import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SimTask extends TimerTask {

    private SimEngine simEngine;
    private SpringApplet springApplet;
    private double step;

    public SimTask(SimEngine simEngine, SpringApplet springApplet, double step)
    {
        this.simEngine = simEngine;
        this.springApplet = springApplet;
        this.step = step;
    }

    public void run() {

        simEngine.simulation(step);
        springApplet.repaint();

    }



}
