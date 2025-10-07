package IniciarSeccion.Autenticacion;

import IniciarSeccion.Usuario;



public class AutenticarUsuario {







    public boolean autenticar(Usuario user){
    return user.getUserName().equals("Geronimo") && user.getPassword().equals("Mijares01");
     }




}
