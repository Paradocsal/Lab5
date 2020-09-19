package This;

public class Coordinates {
    private Integer x; //Поле не может быть null
    private Integer y;//Поле не может быть null
    public Coordinates(){
        this(0,0);//mb ne srabotaet
    }
    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public String toString() {
        return "{x= " + this.x + " y= " + this.y + "}";
    }
}
