package OOP.Home_Work.HW_2.SuperMarket.Classes;

import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iReturnOrder;

/**
 * Класс акциионого клента
 */
public class PromotionClient extends Actor implements iReturnOrder {
    /** Название акции */
    private String NamePromotion;
    /** ID акцииного клента */
    private int idPromClient;

    /**
     * Конструкттор Акцииного клента
     * 
     * @param name          Имя клиента
     * @param NamePromotion Название акции
     * @param idPromClient  id клиента
     */
    public PromotionClient(String name, String NamePromotion, int idPromClient) {
        super(name);
        this.NamePromotion = NamePromotion;
        this.idPromClient = idPromClient;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {

        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;

    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;

    }

    public int getIdPromClient() {
        return idPromClient;
    }

    public String getNamePromotion() {
        return NamePromotion;
    }

    @Override
    public boolean isMakeReturn() {
        return super.isMakeReturn = isMakeReturn;
    }

    @Override
    public void setMakeReturn(boolean makeReturn) {
        super.isMakeReturn = makeReturn;

    }
}
