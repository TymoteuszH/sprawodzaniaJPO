import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Test
{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.Description();
        Cylinder c2 = new Cylinder(5, 3);
        c2.Description();
        Sphere s1 = new Sphere();
        s1.Description();
        Sphere s2 = new Sphere(5, 6);
        s2.Description();
        Rod r1 = new Rod();
        r1.Description();
        Rod r2 = new Rod(6, 8);
        r2.Description();

        Cylinder[] tab = new Cylinder[10];
        int i;

        for(i=0;i<3;i++)
        {
            tab[i] = new Cylinder((double)(i+1),3.2);
        }

        for (i=0;i<3;i++)
        {
            tab[i].Inertia();
            tab[i].Description();
        }
        Sphere[] tab1 = new Sphere[10];

        for(i=0;i<3;i++)
        {
            tab1[i] = new Sphere((double)(i+1),3.2);
        }

        for (i=0;i<3;i++)
        {
            tab1[i].Inertia();
            tab1[i].Description();
        }
        Rod[] tab2 = new Rod[10];

        for(i=0;i<3;i++)
        {
            tab2[i] = new Rod((double)(i+1),3.2);
        }

        for (i=0;i<3;i++)
        {
            tab2[i].Inertia();
            tab2[i].Description();
        }



        // System.out.println(c1.CalculateInertia());

            //InputStreamReader reader = new InputStreamReader(System.in);

            //BufferedReader in = new BufferedReader(reader);
            //String data=in.readLine();

        /*try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter which figure do you want to calculate? ");

            String data = reader.readLine();

            //System.out.println("Your name is: " + name);

            if(data=="1")
            {
                Cylinder c = new Cylinder();
                c.Description();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } */


        /*Point p1 = new Point();
        Point p2 = new Point(4,7);
        p1.pointDescryption();
        System.out.println("-------------------");
        p2.pointDescryption();
        System.out.println("-------------------");
        p1.setMass(6.9);
        System.out.println(p1.getMass());
        p1.pointDescryption();
        System.out.println("-------------------");
        p2.setMass(10);
        p2.pointDescryption();
        System.out.println("-------------------");
        int n = 5;
        Point[] tab1 = new Point[n]; //inicjalizowanie tablicy
        for (int i = 0; i <n;i++) //wypełnianie tablicy
        {
            tab1[i]= new Point(i+1,3.3);
        }
        for (int i = 0; i < n; i++)
        {
            tab1[i].pointDescryption();
            System.out.println("-------------------");
        }*/

    }
}
