public class Rod extends Point
{
    private double RodMass;
    private double RodLenght;

 //1/12*m*L^2
    public double getRodMass() { return RodMass; }
    public double getRodLenght() { return RodLenght;}

    public Rod()
    {
        super();
        this.RodMass=getMass();
        this.RodLenght=6;
    }
    public Rod(double L, double m)
    {
        super(m);
        this.RodMass=getMass();
        if(L>0)
        {
            this.RodLenght= L;
        }
        else
        {
            System.out.println("WRONG Lenght!!");
        }
    }
    public double Inertia()
    {
        return  0.083*this.getRodMass()*this.getRodLenght()*this.getRodLenght();
    }

    public void Description()
    {
        System.out.println("----------------");
        System.out.println("Rod mass: "+ this.getRodMass());
        System.out.println("Rod lenght: "+ this.getRodLenght());
        //System.out.println(this.getMass());
        System.out.println("Rod Inertia: "+this.Inertia());
    }

}
