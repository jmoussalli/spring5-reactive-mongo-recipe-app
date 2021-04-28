package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jerom on 27/04/2021 at 14:58
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
