package OOP.Home_Work.HW_2.SuperMarket.Classes;

import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iReturnOrder;

public class OrdinaryClient extends Actor implements iReturnOrder {

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return this;
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
