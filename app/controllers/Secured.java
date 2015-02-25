package controllers;

import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;

/**
 * User: samir
 */
public class Secured extends Security.Authenticator {

    @Override
    public String getUsername(Http.Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Http.Context ctx) {
        return ok("unAuthorized");
    }
}
