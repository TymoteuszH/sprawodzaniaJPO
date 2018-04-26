public class SimEngine {

    private double mass;
    private double k; // wspolczynnik sprezystosci
    private double c; //wspolczynnik tlumienia
    private double l0; //dlugosc swobodna sprezyny
    private Vector2D massLocation;
    private Vector2D v;
    private Vector2D suspencionPoint;
    private double g;
    private double aY;
    private double t;
    private double tmp;

    public SimEngine(double mass, double k, double c, double l0, double locationX, double locationY,double suspY,double g)
    {
        if(mass > 0)
        {
            this.mass=mass;
        }
        else
        {
            System.out.println("wrong mass!!");
        }
        if(k > 0 )
        {
            this.k=k;
        }
        else
        {
            System.out.println("wrong k!!");
        }
        if(c > 0 )
        {
            this.c = c;
        }
        else
        {
            System.out.println("wrong c!!");
        }
        this.l0=l0;
        this.massLocation= new Vector2D(locationX,locationY);
        this.v=new Vector2D(0,0);
        this.suspencionPoint = new Vector2D(locationX,suspY); // wisza w jednej lini
        this.g=g;
        this.t=0;
    }

    public void simulation(double step)
    {
        this.t=step;
        this.aY = (this.getMass()*this.getG() - this.getK() * this.getMassLocation().getY() - this.getC()*getV().getY()) / this.getMass();
        double yV = this.getV().getY() + (this.getaY() * step);
        this.setvY(yV);
        this.setTmp(getTmp()+this.getV().getY()*this.t + this.getaY()* this.getT() * this.getT()/2);
        this.massLocation.setY(getTmp());

    }

    public void reset()
    {
        setvY(0);
    }

    public void setMass(double mass)
    {
        if(mass > 0)
        {
            this.mass=mass;
        }
        else
        {
            System.out.println("wrong mass!!");
        }
    }

    public double getMass() {
        return mass;
    }

    public void setK(double k)
    {
        if(k > 0 )
        {
            this.k=k;
        }
        else
        {
            System.out.println("wrong k!!");
        }
    }

    public double getK() {
        return k;
    }

    public void setC(double c) {
        if(c > 0 )
        {
            this.c = c;
        }
        else
        {
            System.out.println("wrong c!!");
        }
    }

    public double getC() {
        return c;
    }

    public void setL0(double l0) {
       if(l0>0)
       {
           this.l0 = l0;
       }
       else
       {
           System.out.println("wrong l0!!");
       }
    }

    public double getL0() {
        return l0;
    }

    public void setMassLocation(Vector2D massLocation) {
        this.massLocation = massLocation;
    }

    public Vector2D getMassLocation() {
        return massLocation;
    }

    public void setSuspencionPoint(Vector2D suspencionPoint) {
        this.suspencionPoint = suspencionPoint;
    }

    public Vector2D getSuspencionPoint() {
        return suspencionPoint;
    }

    public void setG(double g) {
        this.g = g;
    }

    public double getG() {
        return g;
    }

    public void setT(double t) {
        if(t>0)
        {
            this.t = t;
        }
    }

    public double getT() {
        return t;
    }

    public void setaY(double aY)
    {
        this.aY=aY;
    }

    public double getaY() {
        return aY;
    }

    public void setV(Vector2D v) {
        this.v = v;
    }

    public Vector2D getV() {
        return v;
    }

    public void setvY(double vY)
    {
        Vector2D tmp = new Vector2D();
        tmp = this.getV();
        tmp.setY(vY);
        this.setV(tmp);
    }

    public double getTmp() {
        return tmp;
    }

    public void setTmp(double tmp) {
        this.tmp = tmp;
    }
}
