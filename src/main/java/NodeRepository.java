package com.example.networknodesdemo;
import java.util.ArrayList;
import java.util.List;
public class NodeRepository {
    private final List<Node> nodes = new ArrayList<>();
    public NodeRepository() {
        nodes.add(new BscNode(1L, "BSC_ZG_01", "Ericsson", "Zagreb", 101));
        nodes.add(new RncNode(2L, "RNC_ST_01", "Huawei", "Split", 24));
        nodes.add(new BasebandNode(3L, "BB_RI_01", "Nokia", "Rijeka", "BB6630"));
    }
    public List<Node> findAll() {
        return nodes;
    }
}
