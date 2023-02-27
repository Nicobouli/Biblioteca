/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;

/**
 *
 * @author Angela Rios
 */
public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("Fundamentos de programacion");
        libro1.setCategoria("Programación");
        libro1.setEditorial("Alfaomega");
        libro1.setIsbn(2324);
        libro1.setStock(5);

        Libro libro2 = new Libro();
        libro2.setId(1);
        libro2.setNombre("Calculo");
        libro2.setCategoria("Matematicas");
        libro2.setEditorial("Alfaomega");
        libro2.setIsbn(344);
        libro2.setStock(2);

        Libro libro3 = new Libro();
        libro3.setId(2);
        libro3.setNombre("Programacion");
        libro3.setCategoria("Programación");
        libro3.setEditorial("Alfaomega");
        libro3.setIsbn(2324);
        libro3.setStock(5);

        Libro libro4 = new Libro();
        libro4.setId(2);
        libro4.setNombre("Hades");
        libro4.setCategoria("Literatura");
        libro4.setEditorial("Alfaomega");
        libro4.setIsbn(544);
        libro4.setStock(5);

        Libro libro5 = new Libro();
        libro5.setId(3);
        libro5.setNombre("Integrales");
        libro5.setCategoria("Matematicas");
        libro5.setEditorial("Alfaomega");
        libro5.setIsbn(456);
        libro5.setStock(3);

        Libro libro6 = new Libro();
        libro6.setId(3);
        libro6.setNombre("Derviadas");
        libro6.setCategoria("Matematicas");
        libro6.setEditorial("santillan");
        libro6.setIsbn(433);
        libro6.setStock(8);

        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);

        Alumno alumno1 = new Alumno();
        alumno1.setId(1);
        alumno1.setNombre("Diego");
        alumno1.setApellidoPaterno("Hernadez");
        alumno1.setApellidoMaterno("Ruiz");
        alumno1.setNumeroCuenta(20227102);

        Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(234);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);

        System.out.println(prestamo1);

        listaLibros.add(libro3);
        listaLibros.add(libro4);

        Alumno alumno2 = new Alumno();
        alumno2.setId(2);
        alumno2.setNombre("Pedro");
        alumno2.setApellidoPaterno("Hernadez");
        alumno2.setApellidoMaterno("Ruiz");
        alumno2.setNumeroCuenta(2343413);

        Prestamo prestamo2 = new Prestamo();
        prestamo2.setId(2);
        prestamo2.setFolio(534);
        prestamo2.setFechainicio(fechaIni);
        prestamo2.setLibros(listaLibros);
        prestamo2.setPersona(alumno2);

        System.out.println(prestamo2);

        List<Libro> listaLibro = new ArrayList<>();
        listaLibros.add(libro5);
        listaLibros.add(libro6);

        Alumno alumno3 = new Alumno();
        alumno3.setId(3);
        alumno3.setNombre("Alfonso");
        alumno3.setApellidoPaterno("Juarez");
        alumno3.setApellidoMaterno("Ruiz");
        alumno3.setNumeroCuenta(2227134);

        Prestamo prestamo3 = new Prestamo();
        prestamo3.setId(3);
        prestamo3.setFolio(614);
        prestamo3.setFechainicio(fechaIni);
        prestamo3.setLibros(listaLibros);
        prestamo3.setPersona(alumno3);

        System.out.println(prestamo3);

    }
}
