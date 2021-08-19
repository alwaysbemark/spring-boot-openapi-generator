package alwaysbemark.example.rest;

import alwaysbemark.example.api.ExampleApi;
import alwaysbemark.example.model.OkayResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController implements ExampleApi {
    @Override
    public ResponseEntity<OkayResponse> exampleGet() {
        return ResponseEntity.ok(new OkayResponse().response("Hello world!"));
    }
}
