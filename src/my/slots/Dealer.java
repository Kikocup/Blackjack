/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.slots;

/**
 *
 * @author ltree
 */
public class Dealer {
    private int sumDealer;
    private BlackJack b = new BlackJack();
    public int getSumDealer() {
        return sumDealer;
    }
    public void cardDealer(){
        Card dealer = b.getCard();
        if(dealer.getNumber()<10&&dealer.getNumber()>1){
            sumDealer += dealer.getNumber();
        } else if(dealer.getNumber()==1){
            int r= (int) (Math.random() * 1);
            if(r == 1){
                sumDealer += 1;
            }
            else{
                sumDealer += 11;
            }
        }
        else{
            sumDealer += 10;
        }
    }

    public void setSumDealer(int sumDealer) {
        this.sumDealer = sumDealer;
    }
    
}
