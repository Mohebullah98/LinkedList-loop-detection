# LinkedList-loop-detection
An algorithm that returns a LinkedList True if the list contains a loop. 

For this problem, we use a fast and slow runner technique where fast is 2x the speed of slow.
Let's say there's K nodes, outside the loop. After k steps, slow will be at the start of the loop while fast will be k steps into the loop.
So fast will be LoopSize-k steps behind slow. After LoopSize-k steps they will collide. At the point of collision they will be k steps from the start of the loop.
So we place slow at the head and traverse them at the same speed, they will collide at the head of the loop. Thus, returning true.

If fast reaches null, then it's obvious the list doesn't have a loop.
