package com.collection.queue;

import java.util.*;

public class DequeEx {
    public static void main(String[] args) {
                                // ArrayDeque is Generally faster than LinkedList for Dique Operations
        Deque<String> deque = new ArrayDeque<>();
                // we can add both side elments this is main feture of Deque
        deque.addFirst("Front-Item");
        deque.addLast("Back-Item");
        deque.offerFirst("New-Front");

        System.out.println("Full Deque: " + deque); 
                     // [New-Front, Front-Item, Back-Item]

        // Removing from both ends
        System.out.println("Removed from last: " + deque.removeLast());
        System.out.println("Remaining: " + deque);
    }
}
