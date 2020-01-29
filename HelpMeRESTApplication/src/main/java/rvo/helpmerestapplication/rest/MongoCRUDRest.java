/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.helpmerestapplication.rest;


import com.mongodb.client.MongoCollection;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.bson.Document;
import rvo.helpmerestapplication.database.MongoDBManager;

/**
 *
 * @author Robert
 */
@RequestScoped
@Path( "mongo_crud" )
public class MongoCRUDRest {
    private final MongoDBManager mongoManager = MongoDBManager.getInstance();
    
    @GET
    @Path( "echo/message" )
    @Produces( MediaType.TEXT_PLAIN )
    public String echoMessage(){
        return "Salut2";
    }
    
    @GET
    @Path( "echo/test" )
    @Produces( MediaType.APPLICATION_JSON )
    public String test(){
        MongoCollection< Document > d = mongoManager.getUsersCollection();
        if( d == null ){
            return "no coll";
        }else{
            return d.toString();
        }
    }
    
    @GET
    @Path( "echo/users" )
    @Produces( MediaType.APPLICATION_JSON )
    public String printUsers(){
        return mongoManager.getUsersCollection().find().toString();
    }
    
    @GET
    @Path( "insert/{username}/{password}" )
    @Produces( MediaType.APPLICATION_JSON )
    public String insertUser( @PathParam( "username" ) String username,
                              @PathParam( "password" ) String password ){
        
        MongoCollection usersCollection = mongoManager.getUsersCollection();
        Document user = mongoManager.getUser( username, password );
        if( user == null ){
            Document object = new Document();
            object.put( "username" , username );
            object.put( "password" , password );
            usersCollection.insertOne(object );
            user = mongoManager.getUser( username, password );
        }
        return user.toJson();
    }
}
