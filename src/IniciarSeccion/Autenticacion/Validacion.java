package IniciarSeccion.Autenticacion;
import IniciarSeccion.Usuario;

public class Validacion {







    public void permitirAcceso(Usuario user){
        System.out.println("Inicio de seccion completada");
        System.out.println("Su usuario es: "+user.getUserName());
    }

    public void restringir(){
        System.out.println("Acceso denegado");
        System.out.println("La informacion suministrada es incorrecta, vuelva a intentarlo");
    }





}
