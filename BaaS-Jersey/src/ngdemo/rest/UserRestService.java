package ngdemo.rest;

import ngdemo.domain.User;
import ngdemo.service.UserService;
import ngdemo.service.UserServiceImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/users")
public class UserRestService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public User getDefaultUserInJSON() {
        UserService userService = new UserServiceImpl();
        return userService.getDefaultUser();
    }
}