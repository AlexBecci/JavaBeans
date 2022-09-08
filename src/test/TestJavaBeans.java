package test;

import domain.PersonaBean;

public class TestJavaBeans {

    public static void main(String[] args) {
        //Lo comun cuando trabajamos con javaBeans es con constructores vacios
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Alex");
        persona.setApellido("Becci");
        
        System.out.println(persona);
        
        System.out.println("Persona nombre: " +persona.getNombre());
        System.out.println("Persona apellido: "+ persona.getApellido());
    }
}
