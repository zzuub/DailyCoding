package section2;

import java.util.ArrayList;

public class D_26_TreeDFS {
    public ArrayList<String> dfs(tree node) {
        ArrayList<String> values = new ArrayList<>();
        values.add(node.getValue());

        if(node.getChildrenNode() != null) {
            for(int i = 0; i < node.getChildrenNode().size(); i++) {
                ArrayList<String> curList = dfs(node.getChildrenNode().get(i));
                values.addAll(curList);
            }
        }
        return values;
    }

    public static class tree {
        private String value;
        private ArrayList<tree> children;

        public tree(String data) {
            this.value = data;
            this.children = null;
        }

        public tree addChildNode(tree node) {
            if(children == null) children = new ArrayList<>();
            children.add(node);
            return children.get(children.size() - 1);
        }

        public String getValue() {
            return value;
        }

        public ArrayList<tree> getChildrenNode() {
            return children;
        }
    }
}
