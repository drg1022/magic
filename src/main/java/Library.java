import io.magicthegathering.javasdk.api.CardAPI;
import io.magicthegathering.javasdk.api.SetAPI;
import io.magicthegathering.javasdk.resource.Card;
import io.magicthegathering.javasdk.resource.MtgSet;
import org.joda.time.LocalTime;

import java.util.List;
import java.util.Set;

public class Library {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        int multiverseId = 500;
        Card card = CardAPI.getCard(multiverseId);
        System.out.println(card.toString());

        List<MtgSet> allSets = SetAPI.getAllSets();
        System.out.println(allSets);

        MtgSet aer = SetAPI.getSet("KLD");
        System.out.println(aer.getReleaseDate());

        List<Card> allCards = CardAPI.getAllCards();
        System.out.println(allCards.size());


    }
}