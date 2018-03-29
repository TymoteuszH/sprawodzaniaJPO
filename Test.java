public class Test
{
    public static void main(String[] args)
    {
        Point p1 = new Point();
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
        }
    }
}
