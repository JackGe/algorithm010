class TrappingRainWater {
    public int trap(int[] height) {
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        int current = 0;
        while(current < height.length){
            // 大于开始处理
            while(!stack.isEmpty() && height[current] > height[stack.peek()] ){
                int h = height[stack.peek()];
                stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int d =  current - stack.peek() -1;

                int min = Math.min(height[stack.peek()], height[current]);
                sum = sum + d *(min - h);
            }
            stack.push(current);
            current ++;
        }
        return sum;
    }
}
