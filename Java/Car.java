
public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver){
        this.license=license;
        this.driver = driver;
    }

    public void imprimeDatos(){
        System.out.println("License: "+license+" driver: "+driver.name);
    }
}
