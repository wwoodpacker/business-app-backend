import java.util.ArrayList;
import java.util.List;

/**
 * Created by TIvaykin on 04.03.2017.
 */
public class CardService {
    List<Card> allCards = new ArrayList<>();
    CardService() {
        int id = 0;
        Card card;

        card = new Card();
        card.setId(id++);
        card.setName("123");
        card.setDescription("123");
        card.setConditions("123");
        card.setContacts("123");
        allCards.add(card);
    }

    // returns a list of all users
    public List<Card> getAllCards() {
        return allCards;
    }

}
