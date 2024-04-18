import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <String> words;
  public RandomStringChooser(String[] x){
    words = new ArrayList<String>();
    for (int i  = 0; i < x.length; i++){
      words.add(x[i]);
    }
  }
  public getNext(){
    if (words.size() == 0){
      return "NONE";
    }
    int index = Math.random() * words.size();
    String temp = words.get(index);
    return words.remove(index);
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
