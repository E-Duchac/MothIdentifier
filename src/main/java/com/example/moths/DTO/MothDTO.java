//Equivalent to the Repository files. Reduplication for
//the sake of preserving skill.

//Use MongoDBDriver

// package com.example.moths.DTO;

// import com.example.moths.model.Moth;
// import com.mongodb.MongoClient;
// import com.mongodb.MongoClientURI;
// import com.mongodb.client.MongoCollection;
// import com.mongodb.client.MongoDatabase;

// import java.util.List;

// import org.bson.Document;

// public class MothDTO {
//     private final MongoCollection<Document> mothCollection;

//     public MothDTO() {
//         MongoClientURI uri = new MongoClientURI("mongodb://localhost:27027");
//         MongoClient client = new MongoClient(uri);

//         MongoDatabase mothDTO = client.getDatabase("MothIdentifier");

//         mothCollection = mothDTO.getCollection("Moths");
//     }
    
//     //Create
//     public Moth saveMoth(Moth newMoth) {
//         //mothCollection.insertOne(newMoth);
//     }

//     //Read
//     public List<Moth> findAllMoths() {

//     }
    
//     //Update
//     public Moth updateMoth(Moth newMothDetails) {

//     }

//     //Delete
//     public String deleteMoth(Moth moth) {

//     }
// }
