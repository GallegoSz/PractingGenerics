import javax.swing.JOptionPane;

public class Tipos<T, S> {
    private T obj;
    private S obj2;

    public Tipos(T obj, S obj2) {
        this.obj = obj;
        this.obj2 = obj2;
    }

    public void imprimir() {
        System.out.println(obj.getClass());
        System.out.println(obj2.getClass());
        System.out.println("\n");

    }

    @Override
    public String toString() {
        return this.obj + ", " + this.obj2;
    }

    public static void main(String[] args) {
        Tipos<Integer, String> ob = new Tipos<>(123, "teste");
        Tipos<Integer, String> ob2 = new Tipos<>(321, "etset");

        ob.imprimir();
        ob2.imprimir();

        System.out.println(ob);
        System.out.println(ob2);
    }
}
