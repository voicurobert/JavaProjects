/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rvo.helpmerestapplication.database;



import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import javax.enterprise.context.ApplicationScoped;
import org.bson.Document;


/**
 *
 * @author Robert
 */

@ApplicationScoped
public class MongoDBManager {
    
    private static MongoDBManager instance;
    private MongoClient mongoClient;
    private MongoDatabase mongoDatabase;
    
    private static final String HOST = "localhost";
    private static final int PORT = 27017;
    private static final String HELPME_DATABASE_NAME = "helpme";
    private static final String USERS_COLLECTION_NAME = "users";
    
    public MongoDBManager(){
        if( mongoClient == null ){
            mongoClient = new MongoClient( HOST, PORT );
        }
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }
    
    public static MongoDBManager getInstance(){
        if( instance == null ){
            instance = new MongoDBManager();
        }
        return instance;
    }
    
    public MongoDatabase getDatabase(){
        if( mongoDatabase == null ){
            MongoIterable< String> databases = mongoClient.listDatabaseNames();
            for( String databaseName : databases ){
                if( databaseName.equalsIgnoreCase( HELPME_DATABASE_NAME ) ){
                    mongoDatabase = mongoClient.getDatabase( HELPME_DATABASE_NAME );
                }
            }   
        }
        if( mongoDatabase == null ){
            return null;
        }else{
            return mongoDatabase;
        }
    }
    
    public MongoCollection< Document > getUsersCollection(){
        MongoCollection< Document > mongoCollection = null;
        MongoIterable< String > colls = getDatabase().listCollectionNames();
        for( String coll : colls ){
            if( coll.equalsIgnoreCase( USERS_COLLECTION_NAME ) ){
                mongoCollection = getDatabase().getCollection( USERS_COLLECTION_NAME );
            }
        }
        if( mongoCollection == null ){
            getDatabase().createCollection( USERS_COLLECTION_NAME );
            mongoCollection = getDatabase().getCollection( USERS_COLLECTION_NAME );
        }
        return mongoCollection;
    }
    
    public Document getUser( String username, String password ){
        MongoCollection< Document > userCollection = getUsersCollection();
        MongoCursor< Document > cursor = userCollection.find().iterator();
        while( cursor.hasNext() ){
            Document currentObject = cursor.next();
            String dbUsername = currentObject.getString( "username" );
            String dbPassword = currentObject.getString( "password" );
            if( username.equals( dbUsername ) && password.equals( dbPassword )){
                return currentObject;
            }
        }
        return null;
    }
}
