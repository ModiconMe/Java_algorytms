package hash_table;

import java.util.HashSet;
import java.util.Set;

public class VoteList {
    Set<String> voteList = new HashSet<>();

    void checkVoter(String name) {
        if (voteList.contains(name)) {
            System.out.println("Get over here");
        } else {
            voteList.add(name);
            System.out.println("Your name is added to the table");
        }
    }
}
