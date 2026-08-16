public class JedliksToyCar {
    private int meters = 0;
    private int battery = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar car = new JedliksToyCar();
        return car;
        
        // throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
    }

    public String distanceDisplay() {
        String distance = String.format("Driven %d meters", meters);
        return distance;
        
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
    }

    public String batteryDisplay() {
        String batteryMessage = "";
        if (battery < 1) {
            batteryMessage = "Battery empty";    
        } else {
            batteryMessage = String.format("Battery at %d%%", battery);
        }
        return batteryMessage;
        
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
    }

    public void drive() {
        if (battery > 0) {
            meters += 20;
            battery -= 1;    
        }
        
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
    }
}
