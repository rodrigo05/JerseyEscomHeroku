package mx.com.ipn.escom;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class AlumnoService {

	private static Map<Integer, Alumno> alumnos = new HashMap<>();
	
	static {
		Alumno rodd = new Alumno(201563, "Rodd", "Rosales", "Sistemas", "rodd@gmail.com");
		Alumno zoe = new Alumno(201563, "Zoe", "De la Luz", "Sistemas", "zoe@gmail.com");
		alumnos.put(1, rodd);
		alumnos.put(2, zoe);
	}
	
	/**Este metodo nos va a regresar la lista de todos los clientes existentes en la base de datos**/
	@GET
	public List<Alumno> getAlumnos(){
		return new ArrayList<Alumno>(alumnos.values());
	}
	/**Este metodo nos va a agregar un cliente a la lista de todos los clientes existentes en la base de datos**/
	@POST
	public void addAlumno(Alumno alumno){
		alumnos.put(alumnos.size() + 1, alumno);
	}
	@DELETE
	@Path("/{alumnoId}")
	public void deleteAlumno(@PathParam("alumnoId")int id){
		alumnos.remove(id);
	}
	
}
