package restapiforsearch;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PageRepository extends MongoRepository<Page, String> {

    List<Page> findByLastName(@Param("name") String name);

}