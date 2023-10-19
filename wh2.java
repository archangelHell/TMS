public class wh2 {
    public static void main(String[] args) {
        Persone director = new Persone("Director");
        Persone Worker = new Persone("Worker");
        Persone Accountet = new Persone("Accountant");
        director.print();
        Worker.print();
        Accountet.print();
    }
}
interface printable{
    void print();
}
class Persone implements printable{
    String name;

    Persone(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.printf("%s \n",name);
    }
}






