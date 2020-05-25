
package Cars;


public class Bus  extends Vehicle{

    public Bus() {
    }
    
    @Override
    public void accelarate() {
        System.out.print("The acceleration is slow");
    }

    @Override
    public void stop() {
        System.out.print("The bus cannot Stop now");
    }

    @Override
    public void gas() {
       System.out.print("The bus uses the gas");
    }
    
    
    
}
