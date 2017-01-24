/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author ANDRES
 */
@Named(value = "personaBean")
@RequestScoped
public class personaBean {

   private Persona persona  = new Persona();
   private static  List<Persona> lstPersonas = new ArrayList();
    public personaBean() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getLstPersonas() {
        return lstPersonas;
    }

    public void setLstPersonas(List<Persona> lstPersonas) {
        personaBean.lstPersonas = lstPersonas;
    }
  
    
    public void agregarPersona(){
    personaBean.lstPersonas.add(this.persona);
    }
    
    public void eliminarPersona(Persona Per){
    personaBean.lstPersonas.remove(Per);
    }
}

