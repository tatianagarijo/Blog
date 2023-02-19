/**
 * Clase para manejar las entradas de un blog.
 * 
 * @since 19/02/23 
 * @author Tatiana Garijo Amorós.
 * @version 2.4
*/
public class EntradaBlogTGA {
    /**
     * La variable separador se usa para dar formato a la cadena de texto y separar el título del autor
     */

    public static char separador=':';
    private final int id;
    private final String texto;
    private final String autor;

    /**
     * Constructor de la clase.
     * Recibe:
     * @param id número de entrada del Blog
     * @param autor nombre del autor del Blog
     * @param texto texto de la entrada del Blog
     *
     * @throws IllegalArgumentException se lanza si el id (número de entrada) es null, negativo o igual a 0
     */
    public EntradaBlogTGA(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     *Devuelve una cadena creada para dar formato a la salida de los valores.
     * @return cad 
     */
    @Override
    public String toString(){
        String cad="";
        cad+="\nENTRADA DE"+separador+autor;
        cad+="\n "+texto;
        return cad;
    }

    /**
     * método getter
     * @return id
     */
    public int getId(){
        return this.id;
    }

    /**
     * método getter
     * @return texto
     */
    public String getTexto(){
        return this.texto;
    }

    /**
     * método getter
     * Devuelve el nombre del autor en Mayúsculas
     * @return autor
     */
    public String getAutor(){
        return this.autor.toUpperCase();
    }

    /*
        //devuelve el nombre del autor. Ya no se usa. Mejor ver getAutor
        public String devuelveAutor(){
            return this.autor;
        }
    */

    /**
     * Punto de entrada a la aplicación java
     * @param args  no tiene porqué tener argumentos
     */
    public static void main(String[] args) {
        EntradaBlogTGA e1=new EntradaBlogTGA (3,"ana","Últimas noticias, está disponible BixBy 2.0");
        System.out.println(e1);
    }
}