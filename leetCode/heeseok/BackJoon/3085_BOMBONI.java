import java.io.*;
import java.util.StringTokenizer;


class Main {
    static int bigCnt = 0;
    static char[][] candyArr;

    private void display(char[][] candyArr) {
        for (int i = 0; i < candyArr.length; i++) {
            for (int j = 0; j < candyArr[i].length; j++) {
                System.out.print(candyArr[i][j]);
            }
            System.out.println();
        }
    }

    private void changeRowArr(int startRowIndex, int startColumnIndex) {
        char changeA = candyArr[startRowIndex][startColumnIndex];
        char changeB = candyArr[startRowIndex][startColumnIndex + 1];

        candyArr[startRowIndex][startColumnIndex] = changeB;
        candyArr[startRowIndex][startColumnIndex + 1] = changeA;
    }

    private void changeColumnArr(int startRowIndex, int startColumnIndex) {
        char changeA = candyArr[startRowIndex][startColumnIndex];
        char changeB = candyArr[startRowIndex + 1][startColumnIndex];

        candyArr[startRowIndex][startColumnIndex] = changeB;
        candyArr[startRowIndex + 1][startColumnIndex] = changeA;
    }


    //인접해 있는 candy 최대 갯수 구하기
    private void checkCandyCnt(int startRow, int startColumn) {

        char previousValue = '0';
        //Check row
        for (int i = 0; i < candyArr.length; i++) {
            int continueCnt = 0;
            previousValue = candyArr[i][0];
            for (int j = 0; j < candyArr[i].length; j++) {
                if (previousValue == candyArr[i][j]) {
                    continueCnt++;
                    if (j == candyArr[i].length - 1 && bigCnt < continueCnt) {
                        bigCnt = continueCnt;
                    }
                } else {
                    if (bigCnt < continueCnt) {
                        bigCnt = continueCnt;
                    }
                    continueCnt = 1;
                    previousValue = candyArr[i][j];
                }
            }
        }

        //Check Column
        for (int j = 0; j < candyArr.length; j++) {
            int continueCnt = 0;
            previousValue = candyArr[0][j];
            for (int i = 0; i < candyArr[j].length; i++) {
                if (previousValue == candyArr[i][j]) {
                    continueCnt++;
                    if (i == candyArr[j].length - 1 && bigCnt < continueCnt) {
                        bigCnt = continueCnt;
                    }
                } else {
                    if (bigCnt < continueCnt) {
                        bigCnt = continueCnt;
                    }
                    continueCnt = 1;
                    previousValue = candyArr[i][j];
                }
            }
        }
    }


    private int execute() {
        for (int i = 0; i < candyArr.length; i++) {
            for (int j = 0; j < candyArr[i].length; j++) {
                // 가로 바꾸기

                if (j < candyArr[i].length - 1) {
                    changeRowArr(i, j);
                    //인접해있는지 검사
                    checkCandyCnt(i, j);
                    //원래대로 가로 복구
                    changeRowArr(i, j);
                    //System.out.println("가로"+"("+i+","+j+")");
                }

                if (i < candyArr.length - 1) {
                    //세로 바꾸기
                    changeColumnArr(i, j);
                    //인접해있는지 검사
                    checkCandyCnt(i, j);
                    //원래대로 세로 복구
                    changeColumnArr(i, j);
                   // System.out.println("세로"+"("+i+","+j+")");
                }
            }
        }
        return bigCnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        candyArr = new char[N][N];
//        StringTokenizer st;
        int rowIndex = 0;
        while (N-- > 0) {
//            st = new StringTokenizer(br.readLine());
//            String str = st.nextToken();

            String str = br.readLine();
            for (int i = 0; i < str.length(); i++) {
                candyArr[rowIndex][i] = str.charAt(i);
            }
            rowIndex++;
        }
        int result = new Main().execute();
        br.close();
        System.out.println(result);


    }
}
