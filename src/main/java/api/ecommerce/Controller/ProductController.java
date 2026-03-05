package api.ecommerce.Controller;


import api.ecommerce.DTO.ProductDTO;
import api.ecommerce.Entity.ProductEntity;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import api.ecommerce.repository.ProductRepository;


@RestController
@RequestMapping ("/produtos")
public class ProductController {


    @Autowired
    private ProductRepository repository;

    @Valid
    @PostMapping
    public void register(@RequestBody ProductDTO data){
        repository.save(new ProductEntity(data));
    }





}
