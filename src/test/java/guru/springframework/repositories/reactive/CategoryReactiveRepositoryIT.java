//package guru.springframework.repositories.reactive;
//
//import guru.springframework.bootstrap.RecipeBootstrap;
//import org.junit.Before;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import static org.junit.Assert.*;
//
//public class CategoryReactiveRepositoryIT {
//
//    @Autowired
//    CategoryReactiveRepository categoryReactiveRepository;
//
//    @Autowired
//    RecipeReactiveRepository recipeReactiveRepository;
//
//    @Autowired
//    UnitOfMeasureReactiveRepository unitOfMeasureReactiveRepository;
//
//    @Before
//    public void setUp() throws Exception {
//        RecipeBootstrap bootstrap = new RecipeBootstrap(
//                categoryReactiveRepository,
//                recipeReactiveRepository,
//                unitOfMeasureReactiveRepository);
//
//    }
//}