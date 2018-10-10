
package tallermongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    
    String nombre;
    String genero;
    String director;
    String franquicia;
    String pais;
    int año;
    int duracion;
    String compañia;
    //String actores;
    
    ArrayList<String> actores = new ArrayList<>();
    
    BasicDBObject documento = new BasicDBObject();
    DBCollection coleccion;
    
    
    //CONSTRUCTOR
    public Pelicula (String nombre,String genero, String director, String franquicia, String pais, int año,
            int duracion, String Compañia, List<DBObject> actores){
        this.nombre = nombre;
        this.genero = genero;
        this.director = director;
        this.franquicia = franquicia;
        this.pais = pais;
        this.año = año;
        this.duracion= duracion;
        this.compañia = compañia;
        
    }

    Pelicula() {
    }
    //SETS  DE CADA VARIABLE 
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setgenero(String genero){
        this.genero = genero;
    }
    public void setdirector(String director){
        this.director = director;
    }  
    public void setfranquicia(String franquicia){
        this.franquicia = franquicia;
    }
    public void setpais(String pais){
        this.pais = pais;
    }
    public void setaño(int año){
        this.año = año;
    }
    public void setduracion(int duracion){
        this.duracion= duracion;
    }
    public void setcompañia(String compañia){
        this.compañia = compañia;
    }
    public void setactores(ArrayList<String> actores){
        this.actores = actores;
    }
    public void setcollection(DBCollection  colec){
        this.coleccion = colec;
    }
        
    //GETS DE CADA VARIABLE  
    public String getnombre(){
        return nombre;
    }
    public String getgenero(){
        return genero;
    }
    public String getdirector(){
        return director;
    }
    public String getfranquicia(){
        return franquicia;
    }
    public String getpais(){
        return pais;
    } 
    public int getaño(){
        return año;
    }
    public int getduracion(){
        return duracion;
    }
    public String getcompañia(){
        return compañia;
    }
    public ArrayList<String> actores(){
        return actores;
    }
    public DBCollection getcolec(){
        return coleccion;
    }
    /*public MongoCollection<Document> getcoleconsul(){
        return coleccionconsulta;
    }*
    
    /*--------------------------------MÉTODOS---------------------------------*/
    
    //Obtener la conexión de Película
        public void ObtenerConexionPelicula(){
            //Conectar con servidor
            MongoClient mongoclient = new MongoClient("localhost",27017);
            System.out.println("Conección exitosa");
            //Conectar con base de datos
            DB basedatos = mongoclient.getDB("AdministracionPeliculasCompañias");
            System.out.println("Conección exitosa a la base de datos");
            //Obtener collecion
            coleccion = basedatos.getCollection("peliculas");
            System.out.println("EXITO al obtener coleccion");                            
        }
         
    //Insertar una pelicula           
        public void InsertarPelicula(String nombre, String genero, String director, String franquicia, String pais,
            int año, int duracion, String compañia, ArrayList<String> actores){
            
            List<BasicDBObject> arrayActores = new ArrayList<>();
            
            while(actores.isEmpty() == false){
                String actorindividual = actores.get(0);
                arrayActores.add(new BasicDBObject("NombreActor", actorindividual));
                actores.remove(0);                                        
            }
            System.out.println("EN CLASE PELÍCULA");
            System.out.println(arrayActores);
            BasicDBObject documentoinsertar = new BasicDBObject("Nombre",nombre).
                    append("Género",genero).
                    append("Director",director).
                    append("Franquicia",franquicia).
                    append("País",pais).
                    append("Año",año).
                    append("Duración",duracion).
                    append("Compañía",compañia).
                    append("Actores", arrayActores);           
            coleccion.insert(documentoinsertar);
        }
                          
    //Actualizar las peliculas  
    public void ActualizarPeliculas(Pelicula DocViejo, Pelicula DocNuevo){
        BasicDBObject documentoactualizo = new BasicDBObject();
        
        documentoactualizo.append("$set", new BasicDBObject().append("Nombre",DocNuevo.getnombre()).
                append("Género", DocNuevo.getgenero()).
                append("Franquicia",DocNuevo.getfranquicia()).
                append("Director",DocNuevo.getdirector()).
                append("País", DocNuevo.getpais()).
                append("Año", DocNuevo.getaño()).
                append("Duración",DocNuevo.getduracion()).
                append("Compañía",DocNuevo.getcompañia())
        );
        BasicDBObject documentoviejo = new BasicDBObject().append("Nombre",DocViejo.getnombre()).
                append("Género", DocViejo.getgenero()).
                append("Franquicia",DocViejo.getfranquicia()).
                append("Director",DocViejo.getdirector()).
                append("País", DocViejo.getpais()).
                append("Año", DocViejo.getaño()).
                append("Duración",DocViejo.getduracion()).
                append("Compañía",DocViejo.getcompañia())
                ;       
        coleccion.update(documentoviejo,documentoactualizo,false,false);       
    }
      
    //Eliminar las peliculas    
    public void EliminarPeliculas (String nombre, String genero, String director, String franquicia, String pais,
            int año, int duracion, String compañia,ArrayList<String> actores){
        
        List<BasicDBObject> arrayActores = new ArrayList<>();
            
            while(actores.isEmpty() == false){
                String actorindividual = actores.get(0);
                arrayActores.add(new BasicDBObject("NombreActor", actorindividual));
                actores.remove(0);                                        
            }
            System.out.println("EN CLASE PELÍCULA");
            System.out.println(arrayActores);
            
        BasicDBObject documentoeliminar = new BasicDBObject("Nombre",nombre).
                    append("Género",genero).
                    append("Director",director).
                    append("Franquicia",franquicia).
                    append("País",pais).
                    append("Año",año).
                    append("Duración",duracion).
                    append("Compañía",compañia).
                    append("Actores", arrayActores);
            coleccion.remove(documentoeliminar);
    }
    
}
