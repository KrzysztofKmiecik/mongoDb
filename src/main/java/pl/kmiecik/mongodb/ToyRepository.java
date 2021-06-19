package pl.kmiecik.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyRepository extends MongoRepository<Toy,String> {
}
