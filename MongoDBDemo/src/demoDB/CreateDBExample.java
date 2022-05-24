package demoDB;
import com.mongodb.*;

public class CreateDBExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
			// to create a db 
			
			MongoClient mongo = new MongoClient("localhost",27017);
			DB createDb = mongo.getDB("newDB");
			System.out.println("DB Created");
			DBCollection collection = createDb.createCollection("newCollection", null);
			System.out.println("Collection Created");
			
			// insert Data in the collection
			
			BasicDBObject obj1 = new BasicDBObject("Veh-Type","Car").append("Status", "Parked");
			BasicDBObject obj2 = new BasicDBObject("Veh-Type","Truck").append("Status","Exited");
			System.out.println("Data Created");
			
			collection.insert(obj1);
			collection.insert(obj2);
			System.out.println("Data Added into the MongoDB");
			
			// to display the data
			
			DBCursor cursor =  collection.find();
			
		    while(cursor.hasNext())
		    {
		    	int i = 1;
		    	System.out.println(cursor.next());
		    	i++;
		    }
			
		} 
		catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
