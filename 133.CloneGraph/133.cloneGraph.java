/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        return clone(node);
    }
    private UndirectedGraphNode clone(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }
        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        // map record cloned nodes not origin nodes  -> ??? cases that the graph contains nodes with same label
        map.put(cloneNode.label, cloneNode);
        for (UndirectedGraphNode temp : node.neighbors) {
            cloneNode.neighbors.add(clone(temp));
        }
        return cloneNode;
    }
}