package OOP.Home_Work.HW_2.SuperMarket.Interfaces;

import java.util.List;

import OOP.Home_Work.HW_2.SuperMarket.Classes.Actor;

public interface iMarketBehaviour {
    void acceptToMarket(iActorBehaviour actor);

    void releaseFromMarket(List<Actor> actors);

    void update();
}
