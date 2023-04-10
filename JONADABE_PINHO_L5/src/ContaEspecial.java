/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SuperGeeks
 */
public class ContaEspecial extends ContaAbstrata {
    
    
    public double taxaServico(){
      return  this.getTotal()*0.05;
    }
    
    
}
