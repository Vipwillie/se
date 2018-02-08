package data;

/**
 * <p>功能 描述:</p>
 * <p>创  建 人:Willie</p>
 * <p>创建 时间:2018/1/16 9:10</p>
 */
public class SingleList {
    public static void main(String[] args) {
        LinkList theList = new LinkList();

        theList.insertFirst(1, 2.2);
        theList.insertFirst(4, 2.3);
        theList.insertFirst(3, 2.6);
        theList.insertFirst(2, 2.5);

        theList.displayList();

        System.out.println("开始删除数据");
        while (!theList.isEmpty()) {
            Link link = theList.deleteFirst();
            link.displayLink();
        }
        theList.displayList();
    }
}

class LinkList {
    private Link first;

    public boolean isEmpty() {
        return null == first;
    }

    public void insertFirst(int id, double data) {
        Link newLink = new Link(id, data);
        newLink.setNext(first);
        first = newLink;
    }

    public Link deleteFirst() {
        Link temp = first;
        first = first.getNext();
        return temp;
    }

    public void displayList() {
        System.out.println("List (first--->last): ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.getNext();
        }
    }
}

class Link {
    private int id;
    private double data;
    private Link next;

    public Link(int id, double data) {
        this.id = id;
        this.data = data;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void displayLink() {
        System.out.println("{" + id + "," + data + "} ");
    }
}


