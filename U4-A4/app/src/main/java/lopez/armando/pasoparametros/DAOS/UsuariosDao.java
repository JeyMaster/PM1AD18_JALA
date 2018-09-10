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
        listaUsuariosDao.add(new Usuario("JeyMaster", "12345","Armando",
                "Lopez Acosta","neomix5000@gmail.com"));
        listaUsuariosDao.add(new Usuario("Patito", "12345","Alberto",
                "Aguado Reyes","1234@hotmail.com"));
        return listaUsuariosDao;
    }

    public  Usuario usuarioExist(final Usuario usAValidar){
        listaUsuariosDao=listaUs();
        //listaUsuariosDao.stream().anyMatch(usr -> usr.getUsuario().equals(usAValidar.getUsuario()));
        for (Usuario usr:listaUsuariosDao) {
            if(usr.getUsuario().equals(usAValidar.getUsuario())&&usr.getPassword().equals(usAValidar.getPassword())){
                return usr;
            }
        }
        return null;
    }
}