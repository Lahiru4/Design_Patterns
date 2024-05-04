package FactoryDesignPattern.bo;


import FactoryDesignPattern.bo.custom.impl.CustomerBOImpl;
import FactoryDesignPattern.bo.custom.impl.ItemBOImpl;
import FactoryDesignPattern.bo.custom.impl.PlaceOrderBoImpl;

public class BOFactory {
    private static BOFactory boFactory;
    private BOFactory(){

    }
    public static BOFactory getBOFactory(){
        return (boFactory==null)?boFactory=new BOFactory():boFactory;
    }
    public enum BOTypes{
        CUSTOMER,ITEM,PLACE_ORDER
    }
    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case PLACE_ORDER:
                return  new PlaceOrderBoImpl();
            default:
                return null;
        }
    }

}
