
package tallermongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class Compañia {
    
    String nombre;
    int año;
    String link;
    
    BasicDBObject documento = new BasicDBObject();
    DBCollection coleccion;
    
    //CONSTRUCTOR
    public Compañia(){}
    
    public Compañia(String nombre, int año, String link){
        this.nombre =  nombre;
        this.año = año;
        this.link = link;
    }
    //SETS DE CADA VARIABLE
    
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setaño(int año){
        this.año = año;
    }
    public void setlink(String link){
        this.link = link;
    }
    
    //GETS DE CADA VARIABLE    
    public String getnombre(){
        return nombre;
    }
    public int getaño(){
        return año;
    }
    public String getlink(){
        return link;
    }
    public DBCollection getcolec(){
        return coleccion;
    } 
    
     /*--------------------------------MÉTODOS---------------------------------*/
    
    //Obtener la conexión de Película
    public void ObtenerConexionCompañia(){
        //Conectar con servidor
            MongoClient mongoclient = new MongoClient("localhost",27017);
            System.out.println("Conección exitosa");
            //Conectar con base de datos
            DB basedatos = mongoclient.getDB("AdministracionPeliculasCompañias");
            System.out.println("Conección exitosa a la base de datos");
            //Obtener collecion
            coleccion = basedatos.getCollection("compañias");
            System.out.println("EXITO al obtener coleccion");           
    } 
       
    //Insertar una compañia    
    public void InsertarCompañia(String nombre, int año, String link){
        BasicDBObject documentoinsertar = new BasicDBObject("Nombre",nombre).
                    append("Año",año).
                    append("Link",link)
                ;
            coleccion.insert(documentoinsertar);     
    }
    
    //Actualizar una compañia
    public void ActualizarCompañia(Compañia DocViejo, Compañia DocNuevo){
        BasicDBObject documentoactualizo = new BasicDBObject();
        documentoactualizo.append("$set", new BasicDBObject().append("Nombre",DocNuevo.getnombre()).
                append("Año", DocNuevo.getaño()).
                append("Link",DocNuevo.getlink())
        );
        BasicDBObject documentoviejo = new BasicDBObject().append("Nombre",DocViejo.getnombre()).
                append("Año", DocViejo.getaño()).
                append("Link",DocViejo.getlink())
                ;
        coleccion.update(documentoviejo,documentoactualizo,false,false);
    }
    
    //Eliminar una compañia    
    public void EliminarCompañia(String nombre, int año, String link){
        BasicDBObject documentoeliminar = new BasicDBObject("Nombre",nombre).
                    append("Año",año).
                    append("Link",link)
                ;
            coleccion.remove(documentoeliminar);     
    }
              
}
