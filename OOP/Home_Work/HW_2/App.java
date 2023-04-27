package OOP.Home_Work.HW_2;

import OOP.Home_Work.HW_2.SuperMarket.Classes.OrdinaryClient;
import OOP.Home_Work.HW_2.SuperMarket.Classes.PromotionClient;
import OOP.Home_Work.HW_2.SuperMarket.Classes.Market;
import OOP.Home_Work.HW_2.SuperMarket.Classes.SpecialClient;
import OOP.Home_Work.HW_2.SuperMarket.Classes.TaxService;
import OOP.Home_Work.HW_2.SuperMarket.Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // Market market = new Market();
        // OrdinaryClient client1 = new OrdinaryClient("Boris");
        // OrdinaryClient client2 = new OrdinaryClient("Dasha");
        // SpecialClient client3 = new SpecialClient("Fedor", 1101);
        // market.acceptToMarket(client1);
        // market.acceptToMarket(client2);
        // market.acceptToMarket(client3);
        // market.update();

        Market market = new Market();
        iActorBehaviour item1 = new OrdinaryClient("Boris");
        iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
        iActorBehaviour item3 = new OrdinaryClient("Dasha");
        iActorBehaviour item6 = new OrdinaryClient("Vasya");
        iActorBehaviour item7 = new OrdinaryClient("Stepa");
        iActorBehaviour item4 = new TaxService();
        iActorBehaviour item5 = new PromotionClient("Eduard", "Black Friday", 13);

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);
        market.acceptToMarket(item5);
        market.acceptToMarket(item6);
        market.acceptToMarket(item7);
        market.update();
    }
}