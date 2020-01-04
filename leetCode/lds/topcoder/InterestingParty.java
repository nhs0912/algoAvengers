package com.lds.topcoder;

/**
 * p.82 01 즐거운 파티
 */
public class InterestingParty {

//    case 1
//    String[] first  = new String[]{"fishing", "gardening", "swimming", "fishing"};
//    String[] second = new String[]{"hunting", "fishing", "fishing", "biting"};

    // case 2
    //String[] first  = new String[]{"va", "div", "lo", "co"};
    //String[] second = new String[]{"ta", "sp", "dis", "meet"};

    // case 3
    //String[] first  = new String[]{"sna", "pro", "cob", "mon"};
    //String[] second = new String[]{"pyt", "pyt", "ana", "pyt"};

    // case 4
    String[] first  = new String[]{"t", "o", "p", "c", "o", "d", "e", "r", "s", "i", "n", "g", "l", "e", "r", "o", "u", "n", "d", "m", "a", "t", "c", "h", "f", "o", "u", "r", "n", "i"};
    String[] second = new String[]{"n", "e", "f", "o", "u", "r", "j", "a", "n", "u", "a", "r", "y", "t", "w", "e", "n", "t", "y", "t", "w", "o", "s", "a", "t", "u", "r", "d", "a", "y"};

    public void run() {

        this.bestInvitation();
    }

    private void bestInvitation() {

        int peopleCount = first.length;
        int returnCount = 0;

        for(int i=0 ; i<peopleCount ; i++) {
            returnCount = Math.max(returnCount, this.getInterestCnt(i, peopleCount));
        }

        System.out.println("Returns: " + returnCount);
    }

    private int getInterestCnt(int baseIndex, int peopleCount) {

        int interestCntByFirst = 1;
        int interestCntBySecond = 1;

        String baseInterest = "";
        for(int i=0 ; i<peopleCount ; i++) {

            if(i==baseIndex) continue;

            if(first[baseIndex].equals(first[i]) || first[baseIndex].equals(second[i])) {
                interestCntByFirst++;
            }

            if(second[baseIndex].equals(first[i]) || second[baseIndex].equals(second[i])) {
                interestCntBySecond++;
            }
        }

        return Math.max(interestCntByFirst, interestCntBySecond);
    }
}