package OOP.Home_Work.HW_2.SuperMarket.Classes;

import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iActorBehaviour;
import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected boolean isMakeReturn;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();

}
