package pro.tmedia; /**
 * Created by TIvaykin on 04.03.2017.
 */
import spark.Spark;

import static pro.tmedia.JsonUtil.*;
import static spark.Spark.after;
import static spark.Spark.get;

public class CardController {

    public CardController(final CardService cardService) {

        get("/cards", (req, res) -> cardService.getAllCards(), JsonUtil.json());
        after((req, res) -> {
            res.type("application/json");
        });
    }
}