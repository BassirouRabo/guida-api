package controllers;

import models.Maison;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.ArrayList;
import java.util.List;


public class MaisonController extends Controller {

    @Transactional
    public Result reads() {
        List<Maison> maisonList = new Maison().findList();

        if(null == maisonList) {
            maisonList = new ArrayList<>();
        }

        return ok(Json.toJson(maisonList));
    }

}
