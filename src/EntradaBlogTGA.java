/**
 * Clase para manejar las entradas de un blog.
 * La clase se creó @since 19/02/23 por @author: Tatiana Garijo Amorós.
 * Esta es la @version: 2.4
*/
public class EntradaBlogTGA {
    /**
     * la variable separador se usa para dar formato a la cadena de texto y separar el título del autor
     */

    public static char separador=':';
    private final int id;
    private final String texto;
    private final String autor;

    /**
     * Constructor de la clase
     * Recibe los parámetros:
     * @param id número de entrada del Blog
     * @param autor nombre del autor del Blog
     * @param texto texto de la entrada del Blog
     *
     * Si el id (número de entrada) es null, negativo o igual a 0, lanza una excepción @trows IllegalArgumentException
     */
    public EntradaBlogTGA(int id, String autor, String texto)throws IllegalArgumentException{
        if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
        this.id=id;
        this.autor=autor;
        this.texto=texto;
    }

    /**
     *
     * @return cad la cadena de texto se haformado y se le ha dado formato a los datos de la entrada del Blog, autor y texto.
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