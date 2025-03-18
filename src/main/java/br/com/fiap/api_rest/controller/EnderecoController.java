package br.com.fiap.api_rest.Controller;


import br.com.fiap.api_rest.dto.ClienteRequest;
import br.com.fiap.api_rest.model.Cliente;
import br.com.fiap.api_rest.model.Endereco;
import br.com.fiap.api_rest.repository.ClienteRepository;
import br.com.fiap.api_rest.service.ClienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/enderecos", produces = {"application/json"})
@Tag(name = "api-enderecos")
public class EnderecoController {

}