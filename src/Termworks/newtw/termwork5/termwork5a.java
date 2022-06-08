package termwork5;

class Vehicle {
    float u, v, a;

    public Vehicle() {
        v = 0;
        u = 0;
        a = 0;
    }

    Vehicle(float u, float v, float a) {
        this.u = u;
        this.v = v;
        this.a = a;
    }
}

class LawsofMotion extends Vehicle {
    Vehicle V1 = new Vehicle();
    float distance;
    float a;

    LawsofMotion(float u, float v, float a) {
        this.V1.u = u;
        this.V1.v = v;
        this.V1.a = a;
    }

    void computeDistanceTravelled(float t) {
        distance = V1.u * t + 0.5f * V1.a * t * t;
        System.out.println("The distance travelled is " + distance);
    }

    void computeDistanceTravelled() {
        distance = (V1.u * V1.u) / (2 * V1.a);
        System.out.println("The distance travelled is " + distance);
    }

    void computeAcceleration(float mass, float force) {
        a = (mass / force);
        System.out.println("The acceleration is " + a);
    }

    void computeAcceleration(float mass, float v, float u, float t) {
        a = (mass * v - mass * u) / t;
        System.out.println("The acceleration is " + a);
    }
}

public class termwork5a {
    public static void main(String[] args) {
        LawsofMotion V = new LawsofMotion(4, 5, 6);
        V.computeDistanceTravelled();
        V.computeDistanceTravelled(2);
        V.computeAcceleration(30, 50);
        V.computeAcceleration(5, 10, 5, 10);
    }
}
