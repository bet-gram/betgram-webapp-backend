package controllers;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import models.*;
import play.data.Form;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public Result index() {

        return ok(index.render("Your new application is ready."));
    }

    //POST

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

    //GET

    public Result getBlogs(){
        List<Blog> objects = new Model.Finder(String.class, Blog.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getCities(){
        List<City> objects = new Model.Finder(String.class, City.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getClubs(){
        List<Club> objects = new Model.Finder(String.class, Club.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getConfederations(){
        List<Confederation> objects = new Model.Finder(String.class, Confederation.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getCountries(){
        List<Country> objects = new Model.Finder(String.class, Country.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getGrounds(){
        List<Ground> objects = new Model.Finder(String.class, Ground.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getLeagues(){
        List<League> objects = new Model.Finder(String.class, League.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getManagers(){
        List<Manager> objects = new Model.Finder(String.class, Manager.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getPayments(){
        List<Payment> objects = new Model.Finder(String.class, Payment.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getPositions(){
        List<Position> objects = new Model.Finder(String.class, Position.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getSubscriptions(){
        List<Subscription> objects = new Model.Finder(String.class, Subscription.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getUsers(){
        List<User> objects = new Model.Finder(String.class, User.class).all();
        return ok(Json.toJson(objects));
    }

    public Result getPlayers(){
        List<Player> objects = new Model.Finder(String.class, Player.class).all();
        return ok(Json.toJson(objects));
    }
}
