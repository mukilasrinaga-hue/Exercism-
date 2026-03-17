public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double rate = 221 * speed;

        if (speed >= 1 && speed <= 4) {
            return rate;
        } 
        else if (speed >= 5 && speed <= 8) {
            return rate * 0.90;
        } 
        else if (speed == 9) {
            return rate * 0.80;
        } 
        else if (speed == 10) {
            return rate * 0.77;
        }

        return 0;
        
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
       
    }
}
