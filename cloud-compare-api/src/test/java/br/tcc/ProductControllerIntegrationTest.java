package br.tcc;

import br.tcc.dto.ProductRequestDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void deveCriarEListarProduto() throws Exception {
        ProductRequestDTO request = new ProductRequestDTO(
                "Notebook", "Notebook 15 polegadas", new BigDecimal("3500.00"), 10);

        mockMvc.perform(post("/api/v1/products")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Notebook"));

        mockMvc.perform(get("/api/v1/products"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content", hasSize(1)));
    }

    @Test
    void deveRejeitarProdutoSemNome() throws Exception {
        ProductRequestDTO request = new ProductRequestDTO(
                "", "Sem nome", new BigDecimal("10.00"), 1);

        mockMvc.perform(post("/api/v1/products")
                        .contentType("application/json")
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isBadRequest());
    }
}
