import java.util.*;
public class RandomStringChooser
{
  /* to be implemented in part (a) */
  private ArrayList <string> words;
  public RandomStringChooser(string[] x){
    words = new ArrayList<string>();
    for (int i  = 0; i < x.length; i++){
      words.add(x[i]);
    }
  }
  public getNext(){
    if (words.size() == 0){
      return "NONE";
    }
    else {
      int index = Math.random() * words.size();
      string temp = words.get(index);
      words.remove(index);
      return temp;
    }
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}
