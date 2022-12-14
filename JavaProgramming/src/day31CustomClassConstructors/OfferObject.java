package day31CustomClassConstructors;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObject {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("Manchester", "PMI", "Tester", 80000, true, false, true, true);
        offer2.setInfo("Berkshire", "Reddit", "Manager Account", 90000, true, true, true, true);
        offer3.setInfo("Richmond", "Etna", "Solicitor", 50000, false, false, false, false);
        offer4.setInfo("london", "HSBC", "Controller", 60000, true, true, false, true);
        offer5.setInfo("Victoria", "Apple", "Developer", 100000, true, true, true, true);
        offer6.setInfo("USA", "Google", "QA", 70000, true, true, true, false);
        offer7.setInfo("Devon", "Philips", "Scrum Master", 90000, true, false, true, true);

        Offer[] myoffers={offer1,offer2,offer3,offer4,offer5,offer6,offer6};

        ArrayList<Offer>fullTimeOffers=new ArrayList<>(Arrays.asList(myoffers));
        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println(fullTimeOffers.size());











    }


}
