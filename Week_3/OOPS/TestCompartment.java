abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "First Class Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {

        Compartment[] arr = new Compartment[10];

        for(int i = 0; i < 10; i++){

            int x = (int)(Math.random() * 4);

            if(x == 0){
                arr[i] = new FirstClass();
            }
            else if(x == 1){
                arr[i] = new Ladies();
            }
            else if(x == 2){
                arr[i] = new General();
            }
            else{
                arr[i] = new Luggage();
            }
        }

        for(int i = 0; i < 10; i++){
            System.out.println(arr[i].notice());
        }
    }
}
