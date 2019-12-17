package run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();
        friends.add("Omer");
        friends.add("Avi");
        friends.add("Dylan");
        friends.add("Rotem");
        friends.add("Gil'ad");
        for (int i = 0; i < friends.size() ; i++) {
          if(friends.get(i) == "Omer"){
              friends.remove(i);
          }
        }

        for (String myfreind:friends) {
            System.out.println(myfreind);
        }
        Set<String> permFriends = new HashSet<>();
        permFriends.add("Omer");
        permFriends.add("dylan");
        permFriends.add("jake");
        permFriends.add("fuckface");
        System.out.println(permFriends);
        permFriends.remove("jake");
        System.out.println(permFriends);
        if(permFriends.contains("dylan")){
            permFriends.remove("Dylan");
        }
    }
}
