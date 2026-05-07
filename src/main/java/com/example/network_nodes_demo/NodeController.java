package com.example.network_nodes_demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nodes")
public class NodeController {

    private final NodeRepository repository = new NodeRepository();
    @GetMapping
    public List<Node> getAllNodes() {
        return repository.findAll();
    }
}
