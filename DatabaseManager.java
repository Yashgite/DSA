import java.io.IOException;
import java.util.*;
public class DatabaseManager{
    private static final int MAX_RETRIES = 3;
    public void connectToDatabase() throws DatabaseConnectionException {
        int attempt=0;
        while(attempt < MAX_RETRIES){
            try{
                attempt++;
                if(Math.random()>0.5){
                    throw new IOException("Failed to connect to the database");
                }
                System.out.println("connected to the databse successsfully");
                return;
            }
            catch(IOException e){
                System.err.println("Attempt"+attempt+":"+e.getMessage());
                if (attempt>=MAX_RETRIES) {
                    throw new DatabaseConnectionException("Failed to connect after "+MAX_RETRIES);
                }
            }
        }
        }
        public static void main(String[] args) {
            DatabaseManager sb = new DatabaseManager();
            try{
                db.connectToDatabase();
            }
            catch(DatabaseConnectionException e){
                System.err.println("Error: "+e.getMessage);
            }
        }
    }