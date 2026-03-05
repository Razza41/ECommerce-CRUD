package api.ecommerce.Entity;

import api.ecommerce.DTO.ProductDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity (name = "Product")
@Table (name = "produtos")
@AllArgsConstructor
@Getter
@NoArgsConstructor

public class ProductEntity {

    //anotacoes para a variavel id ser reconhecida para o banco de dados como ID
    //generated para gerar ids conforme criacao de novos produtos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private String sku;

    //enumerated para o banco de dados entender os atributos do enum como String, nao como numeros
    @Enumerated(EnumType.STRING)
    private Categories category;


    //declaracao de variaveis para reconhecimento do enum
    public ProductEntity(ProductDTO data){
        this.name = data.name();
        this.description = data.description();
        this.price = data.price();
        this.category = data.category();
        this.sku = data.sku();
    }






}
