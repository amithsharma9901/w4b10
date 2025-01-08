package com.ust.collections.stackandqueue;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo2 {

   
    // Pushing element on the top of the stack
    static void stack_push(Stack<Integer> stack)
    { Scanner sc=new Scanner(System.in);
       System.out.println("enter 5 elements into stack");
        for(int i = 0; i < 5; i++)
        {
            stack.push(sc.nextInt());
        }
    }
    
    // Popping element from the top of the stack
    static void stack_pop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");

        for(int i = 0; i < 5; i++)
        {
            Integer y = (Integer) stack.pop();
            System.out.println(y);
        }
    }
    // Displaying element on the top of the stack
    static void stack_peek(Stack<Integer> stack)
    {
        Integer element = (Integer) stack.peek();
        System.out.println("Element on stack top: " + element);
    }
      // Searching element in the stack
    static void stack_search(Stack<Integer> stack, int element)
    {
        Integer pos = (Integer) stack.search(element);

        if(pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position: " + pos);
    }
    public static void main (String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.add(23);
        stack.
System.out.println(stack.empty());
System.out.println(stack.pop());
/*
        stack_push(stack);
        System.out.println(stack.empty());
        stack_pop(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack, 2);
        stack_search(stack, 6);
        */
    }
}
