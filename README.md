# DSA_Sol_Palindrome_Linked_List
A complete and comprehensive solution to check whether a **Linked List** is a P**alindrome** or not in **LeetCode**

![pallined](https://github.com/user-attachments/assets/7f112e57-1e24-4588-af59-e822b17f6544)

## **Approach**

In this solution, we divide it into 3 seperate parts:-

<details>

<Summary> Steps for the solution</Summary>

### First Step

Check, whether the head is null or the next of head is null, if false ---> then move ahead.

We need to find the mid of the **Linked List** with the help of the **fast/slow pointer** approach. The **fast pointer** moves twice the **length** of the slow pointer. At the end, the **slow pointer** is at the mid of the **Linked List**.

### Second Step

![1*XTQtyjLQOkESP5_U9gNbfg](https://github.com/user-attachments/assets/9fde88e2-63bf-48c4-b1ae-020febac0ee9)

Create a reverse function which returns the **Linked List** in **Reverse**, from the mid to the end of the **Linked List**. 

### Third Step

Then, run a **while loop** which moves till the **reversed list** comes to an end. Use an **if condition**, to check whether the value of the **original list** and the **reversed list** is equal or not. If not equal even in one iteration, then **return false**

Otherwise, **return true**.
</details>

## Conclusion

Hence, this is a **comprehensive approach** to solve the **Palindrome Linked List** problem of **LeetCode** with a runtime second of **4ms**.
