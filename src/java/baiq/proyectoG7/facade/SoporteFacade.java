/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiq.proyectoG7.facade;

import baiq.proyectoG7.entity.Soporte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Daniela
 */
@Stateless
public class SoporteFacade extends AbstractFacade<Soporte> implements SoporteFacadeLocal {

    @PersistenceContext(unitName = "ProyectoBaiqG7PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SoporteFacade() {
        super(Soporte.class);
    }
    
}
