public class Vector2D {
    public double x;
    public double y;

    public Vector2D()
    {
        this.x=0.0;
        this.y =0.0;
    }

    public Vector2D(double x, double y)
    {
        this.x=x;
        this.y=y;
    }

    public Vector2D sum(Vector2D v)
    {
        //Vector2D tmp = new Vector2D(this.x+v.x,this.y+v.y);
        //return tmp;
        return new Vector2D(this.x+v.x,this.y+v.y);
    }

    public Vector2D differential(Vector2D v)
    {
        return new Vector2D(this.x-v.x,this.y-v.y);
    }

    public Vector2D multipleByConst(double c)
    {
        return new Vector2D(this.x*c,this.y*c);
    }

    public double getLenght()
    {
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }

    public Vector2D normalization()
    {
        return new Vector2D(this.x/this.getLenght(),this.y/this.getLenght());
    }

    public double getX()
    {
        return  this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY()
    {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
