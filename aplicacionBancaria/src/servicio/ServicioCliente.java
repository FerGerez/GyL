package servicio;

import entidad.Usuario;

import java.util.Scanner;

public class ServicioCliente {

    Scanner sc = new Scanner (System.in);

    public void mostrarMenu(){

        int opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("****************************"+"\n  ¡HOLA ESTIMADO CLIENTE!");
        System.out.println("Bienvenido al menú principal");

        do {
            System.out.println("1) Ingreso al sistema"+"\n2) crear usuario"+"\n3) salir del menú");
            opcion= sc.nextInt();

            System.out.println("validadorNumeros()");
            System.out.println("validadorString()");
            switch (opcion) {
                case 1:
                    ingresarAlSistema();
                    break;

                case 2:
                    crearUsuario();
                    break;

                case 3:
                    System.out.println("Usted ha salido del sistema");
                    break;

                default:
                    System.out.println("Por favor, seleccione una opción válida");
            }
        }while (opcion!=3);
    }

    public void ingresarAlSistema(){
        System.out.println("Ingrese su usuario");


    }

    public Usuario crearUsuario() {
        int edad;
        System.out.println("Para registrarse debe ser mayor de edad, por favor indique cuántos años tiene");
        edad= sc.nextInt();
        if (edad< 18) {
            System.out.println("Usted es menor de edad, por lo tanto, no puede crear un usuario");
            return  null;
        }else {
            sc.nextLine();
            Usuario user = new Usuario();

            System.out.println("Ingrese -> nombre");
            user.setNombre(sc.nextLine());
            System.out.println("Ingrese -> apellido");
            user.setApellido(sc.nextLine());
            System.out.println("Ingrese -> dirección");
            user.setDireccion(sc.nextLine());
            System.out.println("Ingrese -> correo electrónico");
            user.setMail(sc.nextLine());
            System.out.println("Ingrese -> número de teléfono/celular");
            user.setTel(sc.nextInt());
            System.out.println("Usuario registrado correctamente - elija el nombre de usuario");
            sc.nextLine();
            user.setNombreUsuario(sc.nextLine());
            System.out.println("Ingrese una clave");
            user.setClave(sc.nextLine());
            System.out.println(user);
            return user;
        }

    }
}