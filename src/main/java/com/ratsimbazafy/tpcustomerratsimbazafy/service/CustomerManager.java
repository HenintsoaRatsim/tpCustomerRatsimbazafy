/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ratsimbazafy.tpcustomerratsimbazafy.service;

import java.util.List;
import jakarta.enterprise.context.RequestScoped;
import jakarta.transaction.Transactional;
import com.ratsimbazafy.tpcustomerratsimbazafy.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
/**
 * Façade pour gérer les Customers.
 * @author asus
 */
@RequestScoped
public class CustomerManager {
    
    /**
     * Cette fonction donne la liste des Customers
     * @return 
     */
    public List<Customer> getAllCustomers() {  
        Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList();
    }  
    /**
     * Cette fonction fait l'update d'un customer
     * @param customer
     * @return 
     */
    @Transactional
    public Customer update(Customer customer) {
      return em.merge(customer);
    } 
    
    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;

    /**
     * Cette fonction fait l'insertion de customer
     * @param customer 
     */
    @Transactional
    public void persist(Customer customer) {
      em.persist(customer);
    }
}
