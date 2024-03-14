
package ejemplo;


  public class MyClass {
    private int numero;
    private String texto;

    // Constructor
    public MyClass(int numero, String texto) {
        this.numero = numero;
        this.texto = texto;
    }

    // Método toString para mostrar los atributos en una sola línea
    @Override
    public String toString() {
        return "MyClass [numero=" + numero + ", texto=" + texto + "]";
    }
  }