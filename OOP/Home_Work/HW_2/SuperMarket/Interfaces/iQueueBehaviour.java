package OOP.Home_Work.HW_2.SuperMarket.Interfaces;

import OOP.Home_Work.HW_2.SuperMarket.Classes.Actor;

public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);

    void releaseFromQueue();

    void takeOrder();

    void giveOrder();
}
