import java.io.*;

class MyStack {
    int top = -1;
    int[] arr;
    int size = 0;

    MyStack(int size) {
        this.top = -1;
        this.size = size;
        this.arr = new int[size];
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == this.size - 1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("This Stack is already Full");
        }
        this.arr[++top] = data;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("This Stack is already Empty");
        }
        return this.arr[top--];
    }

    int getSize() {
        return this.top;
    }

    void display() {
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

class Main {
    private int execute(String inputStr) {
        int stickCnt = 0; //쇠막대기 갯수
        int inputStrSize = inputStr.length();
        MyStack myStack = new MyStack(inputStrSize);
        boolean lazer = false;
        for (int i = 0; i < inputStrSize; i++) {
            if (inputStr.charAt(i) == '(') {
                lazer = true;
                myStack.push(inputStr.charAt(i));
            } else if (inputStr.charAt(i) == ')') {
                if (lazer) {
                    stickCnt += myStack.getSize();

                } else {
                    stickCnt += 1;
                }
                myStack.pop();
                lazer = false;
            }
        }
        return stickCnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String inputStr = br.readLine();
        int result = new Main().execute(inputStr);
        System.out.println(result);


    }
}
