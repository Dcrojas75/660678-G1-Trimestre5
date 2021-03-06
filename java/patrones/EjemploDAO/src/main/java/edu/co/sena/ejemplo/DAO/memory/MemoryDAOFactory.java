/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.co.sena.ejemplo.DAO.memory;

import edu.co.sena.ejemplo.DAO.CustommerDAO;
import edu.co.sena.ejemplo.DAO.DAOAbstractFactory;
import edu.co.sena.ejemplo.DAO.EmployeedDAO;

/**
 *
 * @author Enrique Moreno
 */
public class MemoryDAOFactory extends DAOAbstractFactory{

    @Override
    public EmployeedDAO createEmployeedDAO() {
        return new EmployeedDAOMemroyImpl();
    }

    @Override
    public CustommerDAO createCustommerDAO() {
      return new  CustommerDAOMemoryImpl();
    }
    
}
