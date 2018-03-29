import java.util.Scanner;
public class Point
{
    private double mass;
    private double distance;
    private double Steiner;
    private double inertia;


    public Point() //konstruktor domyślny posiadający stałe wartości
    {
        this.mass = 2;
        this.distance = 2;
        this.inertia = CalculateInertia();
        this.Steiner = CalculateSteiner(distance);
    }

    public Point(double m,double d) //konstruktor sparametryzowany
    {
        if(m>0)
        {
            this.mass = m;
        }
        else
        {
            System.out.println("WRONG mass!!");
        }
        if(d>0)
        {
            this.distance = d;
        }
        else
        {
            System.out.println("WRONG distance!!");
        }
        this.inertia = CalculateInertia();
        this.Steiner = CalculateSteiner(distance);
    }

    public double CalculateInertia() // funckcja licząca bezwładność(zwracająca zero)
    {
        return 0;
    }

    public double CalculateSteiner(double distance) //funkcja licząca moment z tw. Steinera
    {

        return this.getInertia()+this.getDistance()*this.getDistance()*this.getMass();
    }

    public void pointDescryption() //funkcja wyświetlająca opis punktu
    {
        System.out.println("point mass: "+this.getMass());
        System.out.println("point distance: "+this.getDistance());
        System.out.println("point inertia: " +this.getInertia());
        System.out.println("point Steiner: " +this.getSteiner());


    }
/* akceosry */
    public double getMass()
    {
        return mass;
    }

    public double getDistance() {
        return distance;
    }

    public double getInertia() {
        return inertia;
    }

    public double getSteiner() {
        return Steiner;
    }

    public void setDistance(double distance)
    {
        if (distance >= 0) {
            this.distance = distance;
        }
        else
        {
            System.out.println("WRONG distance!!");
        }
        this.Steiner = this.CalculateSteiner(this.distance);
    }

    public void setMass(double mass)
    {

        if (mass > 0) {
            this.mass = mass;
        }
        else
        {
            System.out.println("WRONG mass!!");
        }
        this.Steiner = this.CalculateSteiner(this.distance);
    }
}
