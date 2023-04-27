package OOP.Home_Work.HW_2.SuperMarket.Interfaces;

import OOP.Home_Work.HW_2.SuperMarket.Classes.Actor;

public interface iActorBehaviour {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean pickUpOrder);

    boolean isMakeOrder();

    boolean isTakeOrder();

    Actor getActor();
}
