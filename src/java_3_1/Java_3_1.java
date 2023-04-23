package java_3_1;

public class Java_3_1 {

  enum Direccion {
    IZQUIERDA, DERECHA, ARRIBA, ABAJO
  };

  public static void main(String[] args) {

    int x = 5;
    int y = 5;

    Direccion[] recorrido = {
      Direccion.ARRIBA,
      Direccion.DERECHA,
      Direccion.DERECHA,
      Direccion.DERECHA,
      Direccion.ABAJO
    };
    System.out.printf("Posición inicial: x = %d, y = %d\n", x, y);
    for (Direccion dir : recorrido) {
      switch (dir) {
        case IZQUIERDA:
          x--;
          break;
        case DERECHA:
          x++;
          break;
        case ARRIBA:
          y--;
          break;
        case ABAJO:
          y++;
          break;

      }
    }
    System.out.printf("Posición final: x = %d, y = %d\n", x, y);
  }

}
