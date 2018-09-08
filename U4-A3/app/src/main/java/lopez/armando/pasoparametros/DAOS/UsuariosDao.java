package lopez.armando.pasoparametros.DAOS;

import java.util.HashSet;
import java.util.Set;

import lopez.armando.pasoparametros.Models.Usuario;


public class UsuariosDao {
    private Set<Usuario> listaUsuariosDao;

    public UsuariosDao() {
        listaUsuariosDao = new HashSet<>();
    }

    public Set<Usuario> listaUs(){
        listaUsuariosDao.add(new Usuario("Betoneytor", "12345"));
        listaUsuariosDao.add(new Usuario("B", "B"));
        return listaUsuariosDao;
    }

    public  boolean usuarioExist(final Usuario usAValidar){
        listaUsuariosDao=listaUs();
        //listaUsuariosDao.stream().anyMatch(usr -> usr.getUsuario().equals(usAValidar.getUsuario()));
        for (Usuario usr:listaUsuariosDao) {
            if(usr.getUsuario().equals(usAValidar.getUsuario())&&usr.getPassword().equals(usAValidar.getPassword())){
                return true;
            }
        }
        return false;
    }
}