package restapiforsearch;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "page", path = "page")
public interface PageRepository extends MongoRepository<Page, String> {

    List<Page> findByUrl(@Param("name") String name);

}