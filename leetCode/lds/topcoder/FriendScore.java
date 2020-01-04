package com.lds.topcoder;

/**
 * p.121 05.친구수
 */
public class FriendScore {

    String[] friends = {
      "NYNNN",
      "YNYNN",
      "NYNYN",
      "NNYNY",
      "NNNYN"
    };

    public void run() {

        int peopleCnt = friends.length;
        int maxFriendsCnt = 0;

        for (int i=0; i<peopleCnt; i++) {

            int friendsCnt = 0;
            for(int j=0; j<peopleCnt; j++) {

                if(i==j) {
                    continue;
                }

                if(friends[i].charAt(j) == 'Y') {

                    friendsCnt++;

                } else {

                    for(int k=0; k<peopleCnt; k++) {

                        if(friends[j].charAt(k) == 'Y' && friends[k].charAt(i) == 'Y') {
                            friendsCnt++;
                        }
                    }
                }

            }

            maxFriendsCnt = Math.max(friendsCnt, maxFriendsCnt);
        }

        System.out.println("maxFriendsCnt = " + maxFriendsCnt);
    }
}
