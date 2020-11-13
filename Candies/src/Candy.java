import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Candy {
    private final String colour;

    public Candy(String colour){
        this.colour = colour;
    }

}

class CandyBatching {
    /**
     * - Given a big batch of candies of different colors.
     * - Write an algorithm that will segregate the candies into individual bags, where:
     *  -> Each bag has at most one candy of any color.
     *  -> You produce the smallest number of bags possible.
     *
     * Note that you can use whatever data structures you wish to
     *
     **/

    /**
     *
     * Take in candies
     *
     *
     * **/

    public static Collection<Collection<Candy>> rebatch(Collection<Candy> candies) {


        List<Candy> batch = new ArrayList<>(candies);
//        ArrayList<Candy> batch = new ArrayList<Candy>(candies);
        Collections.sort(batch<Candy>);

        ArrayList<Candy> bag = new ArrayList<Candy>(batch);

        Set<Candy> uniqKeys = new TreeSet<Candy>();
        uniqKeys.addAll(candies);

        String colourcheck = "";

        Candy candy1 = new Candy(colourcheck);
        Candy candy2 = new Candy(colourcheck);

        for(Candy candy : batch) {
            for(String candycheck : bag){
                //if candy is in the bag then continue to above loop
                if(candy.equals(bag)){
                    continue;
                }else {
                    //Add Candy to the bag
                    bag.add(new Candy(candycheck));
                }

            }




        }

/**       Create New List to house new Objects
 *
          Take first colour and Iterate through candies Collections and compare with what is in the bag (initialised)

**/


        return ;
    }
}
public class Solution {
    // Assumes that you enter your inputs as a Comma-separated list of colours, example:
    // red,blue,green,yellow,red,black,white,yellow,purple,orange,black,orange,red
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String candiesAsCSVList = bufferedReader.readLine().trim();
        final String[] colours = candiesAsCSVList.split(",");

        final List<Candy> candies = new ArrayList<Candy>();
        for (String c : colours) {
            // Add each element into the list
            candies.add(new Candy(c));
        }

        Collection<Collection<Candy>> result = CandyBatching.rebatch(candies);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}
