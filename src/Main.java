import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    static class Page {
        String url;
        Integer viewCount;

        public Page(String url, Integer viewCount) {
            this.url = url;
            this.viewCount = viewCount;
        }

        @Override
        public String toString() {
            return "url='" + url + '\'' + ", viewCount=" + viewCount + '}';
        }
    }

    public static void main(String[] args) {
        Stack<Page> stack = new Stack<>();
        stack.push(new Page("link1", 9));
        stack.push(new Page("link2", 4));

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}