package SeguridadRegistraduria.Seguridad.Repositorios;
import SeguridadRegistraduria.Seguridad.Modelos.PermisosRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermisosRoles extends MongoRepository<PermisosRoles,String> {

}