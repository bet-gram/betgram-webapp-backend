package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public Result index() {

        return ok(index.render("Your new application is ready."));
    }

    public Result post(Model model){
        model.save();
        return ok(Json.toJson(model));
    }

    public  Result addConfederation() {
        Confederation object = Form.form(Confederation.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addBlog() {
        Blog object = Form.form(Blog.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addClub() {
        Club object = Form.form(Club.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addCity() {
        City object = Form.form(City.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addCountry() {
        Country object = Form.form(Country.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addGround() {
        Ground object = Form.form(Ground.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addLeague() {
        League object = Form.form(League.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addManager() {
        Manager object = Form.form(Manager.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addPayment() {
        Payment object = Form.form(Payment.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addPlayer() {
        Player object = Form.form(Player.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addPosition() {
        Position object = Form.form(Position.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addSubscription() {
        Subscription object = Form.form(Subscription.class).bindFromRequest().get();
        return post(object);
    }

    public  Result addUser() {
        User object = Form.form(User.class).bindFromRequest().get();
        return post(object);
    }
}
