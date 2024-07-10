package xml.parser.XML;

public class ElementTree {
    private Element root;

    public ElementTree(Element root) {
        this.root = root;
    }

    public Element getRoot() {
        return root;
    }

    public void setRoot(Element root) {
        this.root = root;
    }

    public String toString() {
        return root.toString();
    }
}
