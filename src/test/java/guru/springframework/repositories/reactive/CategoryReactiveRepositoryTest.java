package guru.springframework.repositories.reactive;

import guru.springframework.domain.Category;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataMongoTest
public class CategoryReactiveRepositoryTest {

    @Autowired
    CategoryReactiveRepository categoryReactiveRepository;

    Category category;

    @Before
    public void setUp() throws Exception {
        categoryReactiveRepository.deleteAll().block();
        category = new Category();
        category.setDescription("foo");
    }

    @Test
    public void testSave() {
        categoryReactiveRepository.save(category).block();
        assertEquals(Long.valueOf(1L), categoryReactiveRepository.count().block());
    }


    @Test
    public void findByDescription() {
        categoryReactiveRepository.save(category).then().block();

        Category fetchedCat = categoryReactiveRepository.findByDescription("foo").block();
        assertNotNull(fetchedCat.getId());
    }
}