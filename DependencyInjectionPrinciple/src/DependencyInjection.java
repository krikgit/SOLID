interface Service{
    void write();
}

class  ServiceA implements Service{

    @Override
    public void write() {
        System.out.println("In Service A");
    }
}

public class DependencyInjection {
    private Service service;
    //This is constructor injetion
    public DependencyInjection(Service service){
        this.service=service;
    }
    void something(){
        System.out.println("In DI class");
    }

    //this is setter injection
    public void setService(Service service){
        this.service=service;
    }
    public static void main(String[] args) {

        System.out.println("Dependency Injection Principle");
        System.out.println("--------------------------------");

        Service serviced = new ServiceA();
        serviced.write();

        DependencyInjection di = new DependencyInjection(serviced);
        di.something();

        di.setService(serviced);
        di.something();
    }
}