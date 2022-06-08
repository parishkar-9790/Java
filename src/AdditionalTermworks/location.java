package addtionaltermwork.src;

class cor {
    float x, y;
    String city;

    void set(float x, float y, String city) {
        this.x = x;
        this.y = y;
        this.city = city;
    }

    void represent() {
        System.out.println("the longitude is " + x);
        System.out.println("the latitude is " + y);
        System.out.println("the city name is " + city);
    }

    void difference(cor l1, cor l2) {
        System.out.println("the difference btw longitude is " + (l1.x - l2.x));
        System.out.println("the difference btw latitude is " + (l1.x - l2.x));
        if (l1.x == l2.x && l1.y == l2.y){
            System.out.println("cities have same cordinates");
        }
        if(l1.y>l2.y){
            System.out.println(" the city "+l1.city+" is located higher");
        }
        else
        System.out.println(" the city "+l2.city+" is located higher");
    }

}

public class location {
    public static void main(String[] args) {
    cor l1=new cor();
    cor l2=new cor();
    l1.set(100.1f,200.2f,"paris");
    l1.represent();
    l2.set(2000.1f,4000.2f,"france");
    l2.represent();
    cor res=new cor();
    res.difference(l1,l2);

    }
}
