public class Main {
    public class Main {

    /* En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main crea objetos de cada una y los utilizaréis para imprimir sus valores por consola. */


        SmartPhone smartPhone1 = new SmartPhone("Iphone 14", "black", "100px", 798.90, 16, 500);
        SmartWatch smartWatch1 = new SmartWatch("IWatch 8", "platinum", "5A", 299.99, 4, 32);

    System.out.println(smartPhone1.toString());


        public static class SmartDevice {
            public SmartDevice() {
            }
        }

        public static class SmartPhone extends SmartDevice{
            String model;
            String color;
            String cameraType;
            double price;
            int ram ;
            int memory;

            public SmartPhone(String model, String color, String cameraType, double price, int ram, int memory) {
                this.model = model;
                this.color = color;
                this.cameraType = cameraType;
                this.price = price;
                this.ram = ram;
                this.memory = memory;
            }

            @Override
            public String toString() {
                return "SmartPhone{" +
                        "model='" + model + '\'' +
                        ", color='" + color + '\'' +
                        ", cameraType='" + cameraType + '\'' +
                        ", price=" + price +
                        ", ram=" + ram +
                        ", memory" + memory +
                        '}';
            }
        }

        public static class SmartWatch extends SmartDevice{
            String model;
            String color;
            String watchType;
            double price;
            int ram ;
            int memory;

            public SmartWatch(String model, String color, String watchType, double price, int ram, int memory) {
                this.model = model;
                this.color = color;
                this.watchType = watchType;
                this.price = price;
                this.ram = ram;
                this.memory = memory;
            }

            @Override
            public String toString() {
                return "SmartWatch{" +
                        "model='" + model + '\'' +
                        ", color='" + color + '\'' +
                        ", watchType='" + watchType + '\'' +
                        ", price=" + price +
                        ", ram=" + ram +
                        ", memory=" + memory +
                        '}';
            }
        }
    }
}
