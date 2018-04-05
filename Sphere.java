public class Sphere extends Point
{
    private double SphereMass;
    private double SphereRadius;
   // 2/5*m*r^2
   public Sphere()
   {
       super();
       this.SphereMass=getMass();
       this.SphereRadius=7.4;
   }

    public Sphere(double r, double m)
    {
        super(m);
        this.SphereMass=getMass();
        if(r>0)
        {
            this.SphereRadius = r;
        }
        else
        {
            System.out.println("WRONG radius!!");
        }
    }
    public double Inertia()
    {
        return  0.4*this.getSphereMass()*this.getSphereRadius()*this.getSphereRadius();
    }

    public void Description()
    {
        System.out.println("----------------");
        System.out.println("Sphere mass: "+ this.getSphereMass());
        System.out.println("Sphere radius: "+ this.getSphereRadius());
        //System.out.println(this.getMass());
        System.out.println("Sphere Inertia: "+this.Inertia());
    }

    public double getSphereMass(){ return SphereMass;}
    public double getSphereRadius() { return SphereRadius;}


}
