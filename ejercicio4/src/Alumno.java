import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String nombre;
    private String apellido;
    private List<Double> notas;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        notas.add(nota);
    }

    public double calcularPromedio() {
        if (notas.isEmpty()) {
            return 0;
        }

        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.size();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
}