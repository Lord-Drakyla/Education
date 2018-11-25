package manzilin.SpringInAction.VendingMachine;

import manzilin.SpringInAction.VendingMachine.Goods.Good;

public interface Machine {

        public Good Good(int key) ;

        public String[] typeOfGood() ;

}
