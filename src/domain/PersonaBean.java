package domain;

import java.io.Serializable;
//Serializable convierte mi objeto de ceros y unos
public class PersonaBean implements Serializable {

    private String nombre;
    private String apellido;

    //Es obligatorio agregar un constructor publico vacio para que sea un JAVA BEAN
    public PersonaBean() {

    }
    //no es requerido en si pero se puede agregar mas constructores
    //Este constructor no es requerido pero lo hacemos para la simulacion
    public PersonaBean(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

    }
    //Lo que si es requerido es tener los metodos get y set para las variables del constructor
    //Se debe aplicar el encapsulamiento cuando trabajamos con javaBeans

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "\nnombre= " + nombre + "\napellido= " + apellido + '}';
    }
    
    
    
    
    
}
