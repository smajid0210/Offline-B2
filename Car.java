public class Car {

        private String name;
        private String manufacturer;
        private Driver driver;
        private int fuelCapacity;

        public Car(String name, String manufacturer, Driver driver, int fuelCapacity) {
                this.name = name;
                this.driver = driver;
                this.manufacturer = manufacturer;
                this.fuelCapacity = fuelCapacity;
        }

        public Car(String name, String manufacturer) {
                this.name = name;
                this.manufacturer = manufacturer;
        }

        public void setFuelCapacity(int fuelCapacity) {
                this.fuelCapacity = fuelCapacity;
        }

        public void setDriver(Driver driver) {
                this.driver = driver;
        }

        public String getName()  {
                return name;
        }

        public Driver getDriver()  {
                return driver;
        }

        public String getManufacturer()  {
                return manufacturer;
        }

        public int getFuelCapacity() {
                return fuelCapacity;
        }


        public void refuel(int miles) {
                fuelCapacity += miles;
        }

        public void drive(int miles) {
                if (fuelCapacity >= miles) {
                        fuelCapacity -= miles;
                } else {
                        System.out.println("Impossible");
                }
        }

        public void print()  {
                System.out.println("Fuel Capacity: "+this.fuelCapacity);
        }



};

