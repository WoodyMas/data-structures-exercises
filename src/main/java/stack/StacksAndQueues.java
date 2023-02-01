package stack;

public class StacksAndQueues {




    public static void main(String[] args) {
        System.out.println("""
                Each item in a stack can only be accessed one at a time, with the last item entered needing to be the first to be removed. (LIFO: Last In First Out)
                
                You can think of it as a can of tennis balls. When you add one, you can immediately remove it from the container. But once you add another, that one you just added will have to be removed first in order to access the one before it. This is true for all subsequent stacks.
                
                Say we had a web browser and we first went to facebook, and then went to youtube, instagram, and gmail, we have just created a stack of all the previous websites we visited. If we hit the back button, we will subsequently go backwards, but we can only access the previous page by first leaving the last one.
                
                A common way of implementing a stack is using an ArrayList instead of a typical array because we don't know how many items we will be adding to the stack (dynamic information). The only requirement for a stack is that we add and remove items from the same end. If we do this at the end of the ArrayList, this is O(1) for adding and remove items.
                
                On the other hand, if we do this from the opposite end (the beginning), because of the re-indexing and also if we have to bring back the item, this ends up being O(n). If you use an ArrayList to implement a stack, you always want to do it from the end not the beginning.
                
                With a stack, we no longer use the terms "removeFirst() and prepend()" we use the terms "pop and push". Similarly, no longer "head and tail" but "top and bottom". We NEVER remove from bottom, we always remove from top.
                """);
    }
}
