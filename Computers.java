public class Computers {
    static class RAM {
        int volume;
        String name;

        RAM() {volume = 500;
            name = "Phil";}

        void showInf() {
            System.out.println("RAM name:" + name);
            System.out.println("RAM volume" + volume);
        }
    }

    static class HDD {
        int vol;
        String nam;
        String type;

        HDD() {
            vol = 500;
            nam = "JOHN";
            type = "External";
        }

        void showInformation() {
            System.out.println("HDD name:" + nam);
            System.out.println("HDD volume" + vol);
            System.out.println("HDD type" + type);
        }
    }
        public static void main(String[] args) {
        }

        int cost;
        String model;
        RAM ram;
        HDD hdd;

        Computers(int cost, String model) {
            this.cost = cost;
            this.model = model;
            this.ram = new RAM();
            this.hdd = new HDD();
        }
        void show(){
            System.out.println("Comp model " + model);
            System.out.println("Comp cost " + cost);
            ram.showInf();
            hdd.showInformation();
        }
    }







