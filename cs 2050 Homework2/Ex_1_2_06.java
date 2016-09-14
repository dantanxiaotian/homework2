public class Ex_1_2_06{


 public boolean isRotation(String s1, String s2) {
    if ((s1.length() == s2.length()) && ((s1+s1).indexOf(s2) != -1)) {
    return true;
}
    else {
    return false;
}
}
}
  
    
  

