/**
 * Created by TIvaykin on 04.03.2017.
 */
import spark.Request;
import spark.Response;
import spark.Route;

import static spark.Spark.*;

public class CardController {

    public CardController(final CardService cardService) {

        get("/cards", (req, res) -> cardService.getAllCards());

    }
}