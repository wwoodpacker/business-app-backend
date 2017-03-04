package pro.tmedia; /**
 * Created by TIvaykin on 04.03.2017.
 */
import spark.Spark;

import static pro.tmedia.JsonUtil.*;

public class CardController {

    public CardController(final CardService cardService) {

        Spark.get("/cards", (req, res) -> cardService.getAllCards(), JsonUtil.json());

    }
}