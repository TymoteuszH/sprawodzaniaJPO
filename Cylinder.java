public class Cylinder extends Point

{
    private double CylinderMass;
    private double CylinderRadius;
    //1/2*M*r^2
    public double getCylinderMass() {return CylinderMass;}
    public double getCylinderRadius() {return CylinderRadius;}

    public Cylinder()
    {
        super();
        this.CylinderMass=getMass();
        this.CylinderRadius=4;
    }

    public Cylinder(double r, double m)
    {
        super(m);
        this.CylinderMass=getMass();
        if(r>0)
        {
            this.CylinderRadius = r;
        }
        else
        {
            System.out.println("WRONG radius!!");
        }
    }
    public double Inertia()
    {
        return  0.5*this.getCylinderMass()*this.getCylinderRadius()*this.getCylinderRadius();
    }

    public void Description()
    {
        System.out.println("----------------");
        System.out.println("Cylinder mass: "+ this.getCylinderMass());
        System.out.println("Cylinder radius: "+ this.getCylinderRadius());
        //System.out.println(this.getMass());
        System.out.println("Cylinder Inertia: "+this.Inertia());
    }
}
