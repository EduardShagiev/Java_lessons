package OOP.Home_Work.HW_2.SuperMarket.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.management.ValueExp;

import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iActorBehaviour;
import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iMarketBehaviour;
import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iQueueBehaviour;
import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iReturnOrder;

public class Market implements iMarketBehaviour, iQueueBehaviour {
    // private List<Actor> queue;
    private List<iActorBehaviour> queue;

    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName() + " клиент пришел в магазин ");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName() + " клиент добавлен в очередь ");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " клиент ушел из магазина ");
            queue.remove(actor);
        }

    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент получил свой заказ ");
            }

            if (actor.getActor().isMakeReturn() == true) {
                System.out.println(actor.getActor().getName() + " Вернул товар и получил деньги");

            }

        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.getActor());
                System.out.println(actor.getActor().getName() + " клиент ушел из очереди ");
            }

        }
        releaseFromMarket(releaseActors);
    }

    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getActor().getName() + " клиент сделал заказ ");
            }

            if (Math.random() <= 0.5) {
                actor.getActor().setMakeReturn(true);
                System.out.println(actor.getActor().getName() + " оформил заявление на возврат товара");
            }

        }

    }
}
