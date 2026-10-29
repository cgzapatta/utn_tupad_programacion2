
package Ejercicio_03;

/**
 *
 * @author chino
 */
public class Main 
{
    public static void main(String[] args) 
    {
        System.out.println("1. Crear 3 profesores y 5 cursos");

        Profesor prof1 = new Profesor("P01", "Ana Torres", "Programacion");
        Profesor prof2 = new Profesor("P02", "Luis Gomez", "Base de Datos");
        Profesor prof3 = new Profesor("P03", "Marta Ruiz", "Redes");

        Curso c1 = new Curso("C101", "Programacion II");
        Curso c2 = new Curso("C102", "Programacion I");
        Curso c3 = new Curso("C103", "Base de Datos I");
        Curso c4 = new Curso("C104", "Redes I");
        Curso c5 = new Curso("C105", "Sistemas Operativos");

        System.out.println("\n2. Agregar profesores y cursos a la universidad");

        Universidad uni = new Universidad("UTN");

        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("\n3. Asignar profesores a cursos");

        uni.asignarProfesorACurso("C101", "P01");
        uni.asignarProfesorACurso("C102", "P01");
        uni.asignarProfesorACurso("C103", "P02");
        uni.asignarProfesorACurso("C104", "P03");
        uni.asignarProfesorACurso("C105", "P03");

        System.out.println("\n4. Listar cursos con su profesor");

        uni.listarCursos();

        System.out.println("\n4. Listar profesores con sus cursos");

        uni.listarProfesores();

        System.out.println("\n5. Cambiar profesor de un curso");

        System.out.println("Antes:");
        c1.mostrarInfo();

        uni.asignarProfesorACurso("C101", "P02");

        System.out.println("Despues:");
        c1.mostrarInfo();

        System.out.println("Verificacion:");
        prof1.listarCursos();
        prof2.listarCursos();

        System.out.println("\n6. Remover un curso y verificar profesor");

        uni.eliminarCurso("C102");

        System.out.println("Cursos del profesor P01 despues de eliminar C102:");
        prof1.listarCursos();

        System.out.println("\n7. Remover un profesor y dejar en null");

        uni.eliminarProfesor("P03");

        System.out.println("Cursos despues de eliminar profesor P03:");
        uni.listarCursos();

        System.out.println("\n8. Reporte cantidad de cursos por profesor");

        uni.listarProfesores();
    }
}