package xml.parser.XML;

public class Element {
    private String name;
    private String value;
    private Element parent;
    private Element[] children;

    public Element(String name, String value, Element parent, Element[] children) {
        this.name = name;
        this.value = value;
        this.parent = parent;
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public Element getParent() {
        return parent;
    }

    public Element[] getChildren() {
        return children;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }

    public void setChildren(Element[] children) {
        this.children = children;
    }

    public String toString() {
        return name + " " + value;
    }
}
