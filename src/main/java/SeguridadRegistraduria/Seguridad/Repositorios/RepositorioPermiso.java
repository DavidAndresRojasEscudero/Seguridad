package SeguridadRegistraduria.Seguridad.Repositorios;
import SeguridadRegistraduria.Seguridad.Modelos.Permiso;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioPermiso extends MongoRepository<Permiso,String> {

}